<template>
  <div class="post-list">
    <div class="post-item" v-for="post in posts" :key="post.id">
      <div class="post-header">
        <span class="post-title">{{ post.title }}</span>
      </div>
      <div class="post-content">
        <p>{{ post.content }}</p>
        <span class="post-footer">{{ post.footer }}</span>
        <div class="post-icons">
          <span class="icon"><font-awesome-icon :icon="['fas', 'eye']" /> <span class="icon-text">{{ post.views }}</span></span>
          <span class="icon"><font-awesome-icon :icon="['fas', 'thumbs-up']" /> <span class="icon-text">{{ post.likes }}</span></span>
          <span class="icon"><font-awesome-icon :icon="['fas', 'comment']" /> <span class="icon-text">{{ post.comments }}</span></span>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import HelperPostItem from '@/components/HelperPostItem.vue'; // Adjust path if necessary

export default {
  name: 'PostList',
  components: { HelperPostItem },
  data() {
    return {
      posts: [
        { id: 1, title: '삼바 3급 경력직은 영어점수 필수야?', content: '바이오 출신이라 지원해봤는데..', footer: '한마음공 - 탈*******', views: 308, likes: 0, comments: 4 },
        { id: 2, title: '아 현대차 들어가고 싶다', content: '생산직 1차 면접 2번 탈락.....', footer: 'LS엔트론 - c*******', views: 284, likes: 1, comments: 6 },
        { id: 3, title: '협력사 용역업체', content: '형들 삼성 전자 디스플레이 용역 업체뽑는데 가도 되냐?', footer: '새회사 - 개*******', views: 64, likes: 0, comments: 3 },
        { id: 4, title: '면까몰', content: '진짜로 있다고 생각해?', footer: '한국환경공단 - *******', views: 80, likes: 1, comments: 2 },
        { id: 5, title: '협력사 용역업체', content: '형들 삼성 전자 디스플레이 용역 업체뽑는데 가도 되냐?', footer: '새회사 - 개*******', views: 64, likes: 0, comments: 3 },
        { id: 6, title: '면까몰', content: '진짜로 있다고 생각해?', footer: '한국환경공단 - *******', views: 80, likes: 1, comments: 2 },
        { id: 7, title: '협력사 용역업체', content: '형들 삼성 전자 디스플레이 용역 업체뽑는데 가도 되냐?', footer: '새회사 - 개*******', views: 64, likes: 0, comments: 3 },
        { id: 8, title: '면까몰', content: '진짜로 있다고 생각해?', footer: '한국환경공단 - *******', views: 80, likes: 1, comments: 2 },
        { id: 9, title: '협력사 용역업체', content: '형들 삼성 전자 디스플레이 용역 업체뽑는데 가도 되냐?', footer: '새회사 - 개*******', views: 64, likes: 0, comments: 3 },
        { id: 10, title: '면까몰', content: '진짜로 있다고 생각해?', footer: '한국환경공단 - *******', views: 80, likes: 1, comments: 2 }
        // Add more post data as needed
      ]
    }
  }
}
</script>

<style scoped>
.post-list {
  display: flex;
  flex-wrap: wrap;
  justify-content: space-between;
  width: 100%;
}

.post-item {
  width: 48%;
  background: white;
  border: 1px solid #ddd;
  margin-bottom: 20px;
  padding: 10px;
  border-radius: 5px;
  box-shadow: 0 2px 4px rgba(0,0,0,0.1);
}

.post-header {
  display: flex;
  justify-content: flex-start;
  align-items: center;
  margin-bottom: 10px;
}

.post-title {
  font-size: 18px;
  font-weight: bold;
}

.post-content {
  font-size: 14px;
}

.post-footer {
  margin-top: 10px;
  font-size: 12px;
  color: gray;
}

.post-icons {
  display: flex;
  justify-content: flex-end;
  margin-top: 10px;
}

.icon {
  display: flex;
  align-items: center;
  font-size: 12px;
  color: gray;
  margin-right: 15px;
}

.icon .fa-icon {
  margin-right: 5px;
}

.icon-text {
  margin-left: 5px;
}
</style>