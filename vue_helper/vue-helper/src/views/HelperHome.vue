<template>
  <HelperHeader/>
  <div class="main-content">
    <HelperPostList :searchQuery="searchQuery" />
  </div>
</template>

<script>
import HelperHeader from '@/components/HelperHeader.vue';
import HelperPostList from '@/components/HelperPostList.vue';

export default {
  components: {
    HelperHeader,
    HelperPostList
  },
  data() {
    return {
      searchQuery: ''
    }
  }
}
</script>

<style scoped>
.main-content {
  display: flex;
  flex-direction: column;
  align-items: center;
  width: 100%;
  max-width: 1200px;
  margin: 20px auto;
}
</style>