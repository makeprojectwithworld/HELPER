<template>
  <div class="home">
    <div class="main-content">
      <HelperPostList />
    </div>
  </div>
</template>

<script>
import HelperPostList from '@/components/HelperPostList.vue';

export default {
  name: 'Home',
  components: {
    HelperPostList
  }
}
</script>

<style scoped>
.home {
  display: flex;
  flex-direction: column;
  align-items: center;
}

.main-content {
  display: flex;
  width: 100%;
  max-width: 1200px;
  margin: 20px auto;
}

.sidebar {
  flex: 1;
}

.post-list {
  flex: 3;
}
</style>