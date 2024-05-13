<template>
  <div class="body-container">
    <div class="signup-container">
      <form class="signup">
        <h1 class="singup-title"><span class="logo">HELPER</span> 회원가입</h1>
        <label>아이디</label>
        <input
          name="user-name"
          type="text"
          placeholder="Email"
        />
        <label>비밀번호</label>
        <input
          name="password"
          type="password"
          placeholder="비밀번호"
        />
        <label>생년월일</label>
        <input
          name="user-birth"
          type="text"
          placeholder="생년월일 8자리"
        />
        <label for="dropdown">성별</label>
        <select id="dropdown" name="user-sex" class="dropdown-sex">
          <option value="option1">남자</option>
          <option value="option2">여자</option>
        </select>
        <!-- <label>별명</label>
        <input
          name="user-nickname"
          type="text"
          placeholder="별명"
        /> -->
        <label for="dropdown">헬스장</label>
        <select id="dropdown" name="user-gym" class="dropdown-gym">
          <option value="option1">바이젝월드스튜디오</option> <!-- -> 헬스장으로 될 수 있도록 v-for 사용 필요!!! -->
          <option value="option2">여자</option>
        </select>
        <div class="button-container">
          <button class="button-cancel">취소</button>
          <button class="button-register">등록</button>
        </div>
      </form>
    </div>
  </div>
</template>

<script setup>
  import KaKaoLogin from './KaKaoLogin.vue';
</script>

<style scope>
  .body-container {
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
  }

  html {
    font-family: 'Noto Sans KR', sans-serif;
    font-size: 16px;
    font-weight: 400;
  }

  label {
    color: #2c2c2c;
    display: block;
    margin: 16px 0 8px;
  }

  input {
    border: 1px solid #d1d1d1;
    color: #ababab;
    display: block;
    font-size: 16px;
    line-height: 24px;
    margin: 8px 0;
    padding: 16px 24px;
    width: 100%;
  }

  .button-container {
    display: flex;
    width: 100%; /* 컨테이너 너비를 최대로 설정 */
  }

  .button-cancel, .button-register {
    flex: 1; /* 사용 가능한 공간을 균등하게 나눔 */
    width: auto; /* 기존의 width: 40% 제거하거나 이를 덮어씀 */
  }

  /* 선택적: 버튼 사이의 간격을 주기 위해 */
  .button-cancel {
    margin-right: 10px; /* 오른쪽 버튼과의 간격 */
  }

  button {
    font-size: 18px;
    font-weight: 700;
    margin: 24px auto;
    padding: 16px;
    width: 40%;
  }

  .button-register {
    background-color: #2c2c2c;
    border: none;
    color: #ffffff;
  }

  .button-cancel {
    background-color: white;
    border: 1px solid #d1d1d1;
    color: black;
  }

  * {
    box-sizing: border-box;
    border-radius: 10px;
  }

  .signup {
    margin: 0 auto;
    width: 360px;
  }

  .signup-container {
    background-color: #f1f3f5; /* 원하는 백그라운드 컬러 지정 */
    width: 420px; /* 컨테이너 너비 */
    border-radius: 20px; /* 모서리 둥글기 */
    padding: 10px;
  }

  .logo {
    color: #4e4e4e;
    font-size: 36px;
    font-weight: 700;
    background: linear-gradient(to top, aquamarine 10%, transparent 30%);
  }

  .singup {
    margin: 0px auto;
    width: 360px;
  }

  .singup-title {
    color: #4e4e4e;
    font-size: 36px;
    font-weight: 700;
    text-align: center;
  }

  select {
    padding: 16px 10px; /* 내부 여백 조정 */
    font-size: 16px; /* 글자 크기 조정 */
    border: 1px solid #d1d1d1;
    color: #ababab;
  }

  .dropdown-sex {
    width: 100px; /* 너비 조정 */
  }

  .dropdown-gym {
    width: 250px; /* 너비 조정 */
  }

</style>