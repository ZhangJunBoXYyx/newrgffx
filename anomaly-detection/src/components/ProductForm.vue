<template>
  <div>
    <h3>添加新商品</h3>
    <input v-model="name" placeholder="商品名称" />
    <input v-model="price" placeholder="价格" type="number" />
    <input v-model="stock" placeholder="库存" type="number" />
    <button @click="submitProduct">添加商品</button>
  </div>
</template>

<script>
export default {
  data() {
    return {
      name: '',
      price: '',
      stock: ''
    };
  },
  methods: {
    submitProduct() {
      const newProduct = { name: this.name, price: this.price, stock: this.stock };
      this.$emit('add-product', newProduct);
      this.name = '';
      this.price = '';
      this.stock = '';
    }
  }
};
</script>
