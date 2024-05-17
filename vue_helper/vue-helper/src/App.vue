<script setup>
import { RouterLink, RouterView } from 'vue-router'
import HelperLogin from '@/components/HelperLogin.vue'
</script>

<template>
  <RouterLink to= "/login">로그인하기</RouterLink>
<RouterView />

</template>

<style scoped>
</style>
