// src/router.js
import { createRouter, createWebHistory } from 'vue-router';
import HomeView from './views/HomeView.vue';
import ProductListView from './views/ProductListView.vue';
import AnomalyReportView from './views/AnomalyReportView.vue';
import AlertNotificationsView from './views/AlertNotificationsView.vue';
import UserManagementView from './views/UserManagementView.vue';

const routes = [
    { path: '/', component: HomeView },
    { path: '/products', component: ProductListView },
    { path: '/anomalies', component: AnomalyReportView },
    { path: '/alerts', component: AlertNotificationsView },
    { path: '/users', component: UserManagementView },
];

const router = createRouter({
    history: createWebHistory(),
    routes,
});

export default router;
