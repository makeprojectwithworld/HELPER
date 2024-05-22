<template>
  <div class="post-form">
    <div class="form-group">
      <label for="title">제목</label>
      <input type="text" id="title" v-model="form.title" placeholder="제목을 입력해주세요." />
    </div>
    <div class="form-group">
      <label for="type">기능</label>
      <select id="type" v-model="form.type">
        <option disabled value="">보조 or 도움</option>
        <option>보조</option>
        <option>도움</option>
      </select>
    </div>
    <div class="form-group">
      <label for="content">내용</label>
      <textarea id="content" v-model="form.content" placeholder="내용을 입력해주세요."></textarea>
    </div>
    <button @click="submitForm">제출</button>
  </div>
</template>

<script>
export default {
  name: 'PostForm',
  data() {
    return {
      form: {
        title: '',
        type: '',
        content: ''
      }
    };
  },
  methods: {
    submitForm() {
      console.log('Form Submitted:', this.form);
      // Add your form submission logic here
    }
  }
};
</script>

<style scoped>
.post-form {
  max-width: 600px;
  margin: 20px auto;
  padding: 20px;
  border: 1px solid #ddd;
  border-radius: 5px;
  background-color: #f9f9f9;
}

.form-group {
  margin-bottom: 20px;
}

label {
  display: block;
  margin-bottom: 5px;
  font-weight: bold;
}

input[type="text"],
textarea,
select {
  width: 100%;
  padding: 10px;
  border: 1px solid #ccc;
  border-radius: 5px;
  font-size: 16px;
}

textarea {
  height: 150px;
  resize: vertical;
}

button {
  display: block;
  width: 100%;
  padding: 10px;
  background-color: #007BFF;
  color: white;
  border: none;
  border-radius: 5px;
  font-size: 16px;
  cursor: pointer;
}

button:hover {
  background-color: #0056b3;
}
</style>