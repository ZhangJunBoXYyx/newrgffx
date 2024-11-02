<template>
  <div>
    <h1>异常检测</h1>
    <ul>
      <li v-for="anomaly in anomalies" :key="anomaly.id">
        商品: {{ anomaly.productName }} - 异常类型: {{ anomaly.type }}
        <button @click="viewDetails(anomaly)">查看详情</button>
      </li>
    </ul>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return { anomalies: [] };
  },
  mounted() {
    this.fetchAnomalies();
  },
  methods: {
    fetchAnomalies() {
      axios.get('http://localhost:8080/api/anomalies')
          .then(response => { this.anomalies = response.data; })
          .catch(error => { console.error('Error fetching anomalies:', error); });
    },
    viewDetails(anomaly) {
      this.$router.push({ path: '/alert-notifications', query: { id: anomaly.id } });
    }
  }
};
</script>
