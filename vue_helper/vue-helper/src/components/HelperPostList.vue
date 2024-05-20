<template>
  <div class="post-list">
    <HelperPostItem v-for="post in posts" :key="post.id" :post="post" />
  </div>
</template>

<script>
import HelperPostItem from '@/components/HelperPostItem.vue'; // HelperPostItem.vue 파일 경로로 수정

export default {
  name: 'PostList',
  components: { HelperPostItem },
  data() {
    return {
      posts: [
        { id: 1, title: '현재 4월 채용 서류결과 왜 안떠?', content: '4차채용 22일인데...' },
        { id: 2, title: '공무원 마수직 1년 컷 가능할까', content: '자신있긴한데...' },
        // 더 많은 포스트 데이터를 여기에 추가하세요.
      ]
    }
  }
}
</script>

<style scoped>
/* CSS 스타일을 여기에 추가하세요 */
</style>