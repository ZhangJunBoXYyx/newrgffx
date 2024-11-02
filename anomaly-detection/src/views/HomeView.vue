<template>
  <div class="container">
    <h2>欢迎来到异常商品识别检测系统</h2>
    <p>请通过导航栏访问不同模块。</p>
    <div class="links">
      <router-link to="/products" class="nav-link">商品管理</router-link>
      <router-link to="/anomalies" class="nav-link">异常报告</router-link>
      <router-link to="/alerts" class="nav-link">告警通知</router-link>
      <router-link to="/users" class="nav-link">用户管理</router-link>
    </div>
  </div>
</template>

<script>
export default {
  name: "HomeView",
};
</script>

<style scoped>
.container {
  text-align: center;
  padding: 2em;
  background-color: #f3f3ed;
  color: #4a4a4a;
  border-radius: 8px;
}

h2 {
  color: #6a5d5d;
}

.links {
  margin-top: 1em;
}

.nav-link {
  display: inline-block;
  margin: 0.5em;
  padding: 0.75em 1.5em;
  background-color: #a7a69d;
  color: white;
  text-decoration: none;
  border-radius: 4px;
}

.nav-link:hover {
  background-color: #c3c2b5;
}
</style>
