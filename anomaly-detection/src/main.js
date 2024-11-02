// src/main.js
import { createApp } from 'vue';
import App from './App.vue';
import router from './router';
import store from './store'; // 确保路径正确

createApp(App)
    .use(router)
    .use(store) // 使用 Vuex store
    .mount('#app');
