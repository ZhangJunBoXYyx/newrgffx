<template>
  <div>
    <h1>{{ isEdit ? '编辑商品' : '添加商品' }}</h1>
    <form @submit.prevent="submitForm">
      <label>商品名称: <input v-model="product.name" /></label>
      <label>价格: <input v-model="product.price" type="number" /></label>
      <label>库存: <input v-model="product.stock" type="number" /></label>
      <button type="submit">{{ isEdit ? '保存更改' : '添加' }}</button>
    </form>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return { product: { name: '', price: 0, stock: 0 }, isEdit: false };
  },
  mounted() {
    const productId = this.$route.query.id;
    if (productId) {
      this.isEdit = true;
      axios.get(`http://localhost:8080/api/products/${productId}`)
          .then(response => { this.product = response.data; });
    }
  },
  methods: {
    submitForm() {
      const request = this.isEdit
          ? axios.put(`http://localhost:8080/api/products/${this.product.id}`, this.product)
          : axios.post('http://localhost:8080/api/products', this.product);

      request.then(() => {
        this.$router.push('/');
      }).catch(error => {
        console.error('Error saving product:', error);
      });
    }
  }
};
</script>
