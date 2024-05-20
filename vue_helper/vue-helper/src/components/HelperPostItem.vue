<template>
  <div class="post-item">
    <h2>{{ post.title }}</h2>
    <p>{{ post.content }}</p>
  </div>
</template>

<script>
export default {
  name: 'HelperPostItem',
  props: {
    post: Object
  }
}
</script>

<style scoped>
/* CSS 스타일을 여기에 추가하세요 */
</style>