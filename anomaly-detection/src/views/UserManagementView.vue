<template>
  <div class="container">
    <h2>用户管理</h2>
    <table>
      <thead>
      <tr>
        <th>用户名</th>
        <th>权限</th>
        <th>操作</th>
      </tr>
      </thead>
      <tbody>
      <tr v-for="user in users" :key="user.id">
        <td>{{ user.username }}</td>
        <td>{{ user.role }}</td>
        <td>
          <button class="btn" @click="editUser(user)">编辑</button>
          <button class="btn btn-danger" @click="deleteUser(user.id)">删除</button>
        </td>
      </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      users: [],
    };
  },
  mounted() {
    this.fetchUsers();
  },
  methods: {
    fetchUsers() {
      axios.get('http://localhost:8080/api/users')
          .then(response => {
            this.users = response.data;
          })
          .catch(error => console.error('Error fetching users:', error));
    },
    editUser(user) {
      // 添加用户编辑逻辑
    },
    deleteUser(userId) {
      axios.delete(`http://localhost:8080/api/users/${userId}`)
          .then(() => this.fetchUsers())
          .catch(error => console.error('Error deleting user:', error));
    }
  }
};
</script>

<style scoped>
.container {
  padding: 2em;
  background-color: #f3f3ed;
  color: #4a4a4a;
  border-radius: 8px;
}

table {
  width: 100%;
  border-collapse: collapse;
  margin-top: 1em;
}

th, td {
  padding: 1em;
  text-align: left;
  border-bottom: 1px solid #ddd;
}

th {
  background-color: #6a5d5d;
  color: white;
}

.btn {
  background-color: #6b705c;
  color: white;
  border: none;
  padding: 0.5em 1em;
  margin-right: 0.5em;
  cursor: pointer;
  border-radius: 4px;
}

.btn:hover {
  background-color: #8a8f8c;
}

.btn-danger {
  background-color: #b56565;
}
</style>
