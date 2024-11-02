<template>
  <div class="container">
    <h2>商品管理</h2>
    <product-form @add-product="addProduct" />
    <ul>
      <li v-for="product in products" :key="product.id">
        {{ product.name }} - ¥{{ product.price }} - 库存: {{ product.stock }}
      </li>
    </ul>
  </div>
</template>

<script>
import ProductForm from '../components/ProductForm.vue';
import axios from 'axios';

export default {
  components: { ProductForm },
  data() {
    return {
      products: [],
    };
  },
  mounted() {
    this.fetchProducts();
  },
  methods: {
    fetchProducts() {
      axios.get('http://localhost:8080/api/products')
          .then(response => {
            this.products = response.data;
          })
          .catch(error => console.error('Error fetching products:', error));
    },
    addProduct(newProduct) {
      axios.post('http://localhost:8080/api/products', newProduct)
          .then(() => this.fetchProducts());
    }
  }
};
</script>
