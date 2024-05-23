<template>
  <div class="post-detail">
    <div class="post-header">
      <h1>{{ post.title }}</h1>
      <div class="post-meta">
        <span class="author">{{ post.author }}</span>
        <span class="date">{{ post.date }}</span>
      </div>
    </div>
    <div class="post-content">
      <p>{{ post.content }}</p>
    </div>
    <div class="post-reactions">
      <span class="reaction" @click="toggleLikePost">
        <font-awesome-icon icon="thumbs-up" />
        <span class="icon-text"> {{ post.likes }} </span>
      </span>
      <span v-if="likedPostByUser" class="reaction cancel-like">
        <span @click="toggleLikePost" class="cancel-text">좋아요 취소</span>
      </span>
      <span class="reaction">
        <font-awesome-icon icon="comment" />
        <span class="icon-text"> {{ post.comments.length }} </span>
      </span>
    </div>
    <div class="post-comments">
      <h2>댓글 {{ post.comments.length }}</h2>
      <div class="comment-input">
        <font-awesome-icon icon="camera" />
        <input type="text" placeholder="댓글을 남겨주세요." v-model="newComment" @keyup.enter="addComment" />
      </div>
      <div class="comments-list">
        <div class="comment" v-for="comment in post.comments" :key="comment.id">
          <div class="comment-meta">
            <span class="comment-author">{{ comment.author }}</span>
            <span class="comment-date">{{ comment.date }}</span>
          </div>
          <div class="comment-content">
            <p>{{ comment.content }}</p>
          </div>
          <div class="comment-actions">
            <span class="comment-like" @click="toggleLikeComment(comment)">
              <font-awesome-icon icon="thumbs-up" />
              <span class="icon-text"> {{ comment.likes }} </span>
            </span>
            <span v-if="likedCommentByUser(comment)" class="reaction cancel-like">
              <span @click="cancelLikeComment(comment)" class="cancel-text">좋아요 취소</span>
            </span>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome';

export default {
  name: 'PostDetail',
  components: {
    FontAwesomeIcon
  },
  data() {
    return {
      currentUser: '새회사 - i******', // 현재 로그인된 사용자 정보
      post: {
        title: '신세계푸드 조선호텔앤리조트',
        author: '새회사 - i******',
        date: '04.29',
        views: 627,
        likes: 10,
        likedUsers: [], // 좋아요를 누른 사용자 목록
        comments: [
          { id: 1, author: '조선호텔앤리조트 - y******', date: '04.30', content: '진짜 짜 기대 그 쌀이하 오지마...', likes: 1, likedUsers: [] },
          { id: 2, author: '새회사 - i******', date: '05.01', content: '난 지금 더 짜 ㅋㅋㅋ', likes: 0, likedUsers: [] },
        ],
        content: '초봉말고 5년차정도 연봉 얼마나 돼'
      },
      newComment: ''
    };
  },
  computed: {
    likedPostByUser() {
      return this.post.likedUsers.includes(this.currentUser);
    }
  },
  methods: {
    toggleLikePost() {
      if (this.likedPostByUser) {
        this.post.likes--;
        const index = this.post.likedUsers.indexOf(this.currentUser);
        if (index > -1) {
          this.post.likedUsers.splice(index, 1);
        }
      } else {
        this.post.likes++;
        this.post.likedUsers.push(this.currentUser);
      }
    },
    likedCommentByUser(comment) {
      return comment.likedUsers.includes(this.currentUser);
    },
    toggleLikeComment(comment) {
      if (this.likedCommentByUser(comment)) {
        return; // 이미 좋아요를 누른 경우 아무 작업도 하지 않음
      }
      comment.likes++;
      comment.likedUsers.push(this.currentUser);
    },
    cancelLikeComment(comment) {
      if (this.likedCommentByUser(comment)) {
        comment.likes--;
        const index = comment.likedUsers.indexOf(this.currentUser);
        if (index > -1) {
          comment.likedUsers.splice(index, 1);
        }
      }
    },
    addComment() {
      if (this.newComment.trim() !== '') {
        const newComment = {
          id: Date.now(),
          author: this.currentUser,
          date: new Date().toLocaleDateString('ko-KR'),
          content: this.newComment,
          likes: 0,
          likedUsers: []
        };
        this.post.comments.push(newComment);
        this.newComment = '';
      }
    }
  }
};
</script>

<style scoped>
p {
  margin-top: 5px;
}

.post-detail {
  max-width: 800px;
  margin: 3% auto;
  padding: 20px;
  background: white;
  border: 1px solid #ddd;
  border-radius: 5px;
}

.post-header {
  border-bottom: 1px solid #ddd;
  padding-bottom: 10px;
  border-radius: 0px;
}

.post-header h1 {
  font-size: 24px;
  margin-bottom: 10px;
}

.post-meta {
  display: flex;
  gap: 10px;
  font-size: 14px;
  color: gray;
}

.post-content {
  padding: 20px 0;
}

.post-reactions {
  display: flex;
  gap: 10px;
  margin-bottom: 20px;
  font-size: 12px;
}

.reaction {
  display: flex;
  align-items: center;
  cursor: pointer;
}

.reaction .fa-icon {
  margin-right: 5px;
}

.icon-text {
  margin-left: 5px;
}

.cancel-like {
  font-size: 12px;
  color: gray;
}

.cancel-text {
  cursor: pointer;
  color: gray;
  margin-left: 5px; /* 좋아요 숫자 오른쪽에 위치하도록 여백 추가 */
}

.post-comments {
  border-top: 1px solid #ddd;
  padding-top: 20px;
  border-radius: 0px;
}

.comment-input {
  display: flex;
  align-items: center;
  gap: 10px;
  margin-bottom: 20px;
}

.comment-input input {
  flex: 1;
  padding: 10px;
  border: 1px solid #ddd;
  border-radius: 5px;
}

.comments-list {
  margin-top: 10px;
}

.comment {
  padding: 10px;
  border-bottom: 1px solid #ddd;
  border-radius: 0px;
}

.comment-meta {
  display: flex;
  gap: 10px;
  font-size: 14px;
  color: gray;
  margin-bottom: 5px;
}

.comment-content {
  font-size: 16px;
  margin-bottom: 5px;
}

.comment-actions {
  font-size: 12px; /* 포스트의 좋아요 폰트 크기와 동일하게 설정 */
  color: gray;
  display: flex;
  align-items: center;
}

.comment-like {
  display: flex;
  align-items: center;
  cursor: pointer;
}

.comment-like .fa-icon {
  margin-right: 5px;
}
</style>