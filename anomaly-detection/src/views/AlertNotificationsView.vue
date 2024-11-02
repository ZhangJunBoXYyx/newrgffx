<template>
  <div>
    <h1>异常告警</h1>
    <ul>
      <li v-for="alert in alerts" :key="alert.id">
        <strong>商品:</strong> {{ alert.productName }}<br />
        <strong>异常类型:</strong> {{ alert.type }}<br />
        <strong>详细信息:</strong> {{ alert.details }}
        <button @click="confirmAlert(alert.id)">确认</button>
        <button @click="dismissAlert(alert.id)">驳回</button>
      </li>
    </ul>
    <p v-if="alerts.length === 0">暂无异常告警</p>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      alerts: [],
    };
  },
  mounted() {
    this.fetchAlerts();
  },
  methods: {
    fetchAlerts() {
      axios.get('http://localhost:8080/api/alerts')
          .then(response => {
            this.alerts = response.data;
          })
          .catch(error => {
            console.error('Error fetching alerts:', error);
          });
    },
    confirmAlert(alertId) {
      axios.post(`http://localhost:8080/api/alerts/${alertId}/confirm`)
          .then(() => {
            this.fetchAlerts(); // Refresh alerts after confirming
          })
          .catch(error => {
            console.error('Error confirming alert:', error);
          });
    },
    dismissAlert(alertId) {
      axios.post(`http://localhost:8080/api/alerts/${alertId}/dismiss`)
          .then(() => {
            this.fetchAlerts(); // Refresh alerts after dismissing
          })
          .catch(error => {
            console.error('Error dismissing alert:', error);
          });
    }
  }
};
</script>

<style scoped>
/* 使用莫兰迪色系进行简单的美化 */
h1 {
  color: #6b705c;
}
button {
  background-color: #a5a58d;
  color: #fff;
  border: none;
  padding: 5px 10px;
  margin: 5px;
  border-radius: 5px;
  cursor: pointer;
}
button:hover {
  background-color: #6b705c;
}
</style>
