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
      <span class="reaction"><font-awesome-icon icon="thumbs-up" /><span class="icon-text"> {{ post.likes }} </span></span>
      <span class="reaction"><font-awesome-icon icon="comment" /><span class="icon-text"> {{ post.comments.length }} </span></span>
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
            <span class="comment-like"><font-awesome-icon icon="thumbs-up" /><span class="icon-text"> {{ comment.likes }} </span></span>
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
      post: {
        title: '신세계푸드 조선호텔앤리조트',
        author: '새회사 - i******',
        date: '04.29',
        views: 627,
        likes: 10,
        comments: [
          { id: 1, author: '조선호텔앤리조트 - y******', date: '04.30', content: '진짜 짜 기대 그 쌀이하 오지마...', likes: 1 },
          { id: 2, author: '새회사 - i******', date: '05.01', content: '난 지금 더 짜 ㅋㅋㅋ', likes: 0 },
        ],
        content: '초봉말고 5년차정도 연봉 얼마나 돼'
      },
      newComment: ''
    };
  },
  methods: {
    addComment() {
      if (this.newComment.trim() !== '') {
        const newComment = {
          id: Date.now(),
          author: '새회사 - i******', // Ideally, this should be dynamic
          date: new Date().toLocaleDateString('ko-KR'),
          content: this.newComment,
          likes: 0
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
}

.reaction .fa-icon {
  margin-right: 5px;
}

.icon-text {
  margin-left: 5px;
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
  font-size: 14px;
  color: gray;
}

.comment-like {
  display: flex;
  align-items: center;
}

.comment-like .fa-icon {
  margin-right: 5px;
}
</style>