<template>
  <div class="container">
    <h2>异常告警</h2>
    <ul>
      <li v-for="alert in alerts" :key="alert.id">
        {{ alert.message }} - {{ alert.timestamp }}
      </li>
    </ul>
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
          .catch(error => console.error('Error fetching alerts:', error));
    }
  }
};
</script>
