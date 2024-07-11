<template>
  <div>
    username<input type="text" v-model="username">
  </div>
  <div>
    password<input type="password" v-model="password">
  </div>
  <div>
    <button @click="login">login</button>
  </div>
</template>
<script setup>
  import { ref } from 'vue';
  let username = ref('')
  let password = ref('')
  const login = ()=>{
    console.log(username.value,password.value,'login successful')
  }

</script>
<style scoped>

</style>