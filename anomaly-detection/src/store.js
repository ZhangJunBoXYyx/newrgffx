// src/store.js
import { createStore } from 'vuex';

export default createStore({
    state: {
        products: [],
        anomalies: [],
        alerts: [],
        users: []
    },
    mutations: {
        setProducts(state, products) {
            state.products = products;
        },
        setAnomalies(state, anomalies) {
            state.anomalies = anomalies;
        },
        setAlerts(state, alerts) {
            state.alerts = alerts;
        },
        setUsers(state, users) {
            state.users = users;
        }
    },
    actions: {
        fetchProducts({ commit }) {
            axios.get('http://localhost:8080/api/products')
                .then(response => commit('setProducts', response.data))
                .catch(error => console.error('Error fetching products:', error));
        },
        fetchUsers({ commit }) {
            axios.get('http://localhost:8080/api/users')
                .then(response => commit('setUsers', response.data))
                .catch(error => console.error('Error fetching users:', error));
        }
    }
});
