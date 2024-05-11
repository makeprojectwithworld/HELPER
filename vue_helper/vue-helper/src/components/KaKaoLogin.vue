<template>
    <div>
      <a id="custom-login-btn" @click="kakaoLogin()">
        <img
          src="https://k.kakaocdn.net/14/dn/btroDszwNrM/I6efHub1SN5KCJqLm1Ovx1/o.jpg"
          width="170" 
          alt="카카오 로그인 버튼"
        />
      </a>
      <!-- <div @click="kakaoLogout()">로그아웃</div> -->
    </div>
  </template>
  
  <script>
  export default {
    methods: {
      kakaoLogin() {
        window.Kakao.Auth.login({
          scope: "profile_image",
          success: this.getKakaoAccount,
        });
      },
      getKakaoAccount() {
        window.Kakao.API.request({
          url: "/v2/user/me",
          success: (res) => {
            const kakao_account = res.kakao_account;
            const ninkname = kakao_account.profile.ninkname;
        
            console.log("ninkname", ninkname);
            // console.log("email", email);
  
            //로그인처리구현
  
            alert("로그인 성공!");
          },
          fail: (error) => {
            console.log(error);
          },
        });
      },
      kakaoLogout() {
        window.Kakao.Auth.logout((res) => {
          console.log(res);
        });
      },
    },
  };
  </script>