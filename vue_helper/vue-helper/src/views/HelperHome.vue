<template>
  <div class="home">
    <div class="header">
      <div class="logo">
        <span>HELPER</span>
      </div>
      <nav class="nav-links">
        <span class="gym">{{ gym.name }}</span>
        <a href="#" class="nav-link">자유</a>
        <a href="#" class="nav-link">보조</a>
        <a href="#" class="nav-link">내 정보</a>
      </nav>
      <div class="search-bar">
        <input type="text" placeholder="관심있는 내용을 검색해보세요!" v-model="searchQuery" @input="onSearch" />
      </div>
      <button class="write-button">글쓰기</button>
    </div>

    <div class="main-content">
      <HelperPostList :searchQuery="searchQuery" />
      <router-view></router-view>
    </div>
  </div>
</template>

<script>
import { RouterLink, RouterView } from 'vue-router';
import HelperPostList from '@/components/HelperPostList.vue';
import { useGymStore } from '@/stores/gym';
import { onMounted } from 'vue';



const store = useGymStore()
onMounted(() =>{
  
})
</script>

<style scoped>
.home {
  display: flex;
  flex-direction: column;
  align-items: center;
}

.header {
  display: flex;
  align-items: center;
  justify-content: space-between;
  width: 100%;
  max-width: 1200px;
  margin: 20px auto;
}

.logo {
  display: flex;
  align-items: center;
  margin-right: 20px;
}

.logo span {
  color: #4e4e4e;
  font-size: 36px;
  font-weight: 700;
  background: linear-gradient(to top, aquamarine 10%, transparent 30%);
}

.gym {
  background-color: lightgrey;
  padding: 5px;
  margin-right: 10px;
  color: white;
  border: none;
}

.nav-links {
  display: flex;
  align-items: center;
  margin-right: 20px;
  margin-left: 1%;
}

.nav-link {
  margin: 0 10px;
  text-decoration: none;
  color: #4e4e4e;
  font-size: 18px;
}

.nav-link:hover {
  text-decoration: underline;
}

.search-bar {
  flex: 1;
  display: flex;
  justify-content: flex-end;
  margin-right: 20px;
}

.search-bar input {
  width: 100%;
  max-width: 300px;
  padding: 10px;
  font-size: 16px;
  border: 1px solid #ddd;
  border-radius: 5px;
}

.write-button {
  background-color: #ff4d4f;
  color: white;
  border: none;
  padding: 10px 20px;
  font-size: 16px;
  border-radius: 5px;
  cursor: pointer;
  margin-right: 10px;
  width: 10%;
}

.main-content {
  display: flex;
  flex-direction: column;
  align-items: center;
  width: 100%;
  max-width: 1200px;
  margin: 20px auto;
}
</style>