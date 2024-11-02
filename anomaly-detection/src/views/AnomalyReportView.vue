<template>
  <div class="container">
    <h2>异常报告</h2>
    <ul>
      <li v-for="report in reports" :key="report.id">
        商品: {{ report.productName }} - 异常类型: {{ report.type }} - 日期: {{ report.date }}
      </li>
    </ul>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      reports: [],
    };
  },
  mounted() {
    this.fetchReports();
  },
  methods: {
    fetchReports() {
      axios.get('http://localhost:8080/api/reports')
          .then(response => {
            this.reports = response.data;
          })
          .catch(error => console.error('Error fetching reports:', error));
    }
  }
};
</script>
