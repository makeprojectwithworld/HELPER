import { ref, computed } from 'vue'
import { defineStore } from 'pinia'

const REST_API = 'http://localhost:8080/userapi'

export const useCounterStore = defineStore('counter', () => {
  const loginUserId = ref(null)
  const userLogin = function (id,password) {
    axios.post(`${REST_API}/login`,{
      id: id,
      password: password
    })
    .then((res) => {
      console.log("로그인 성공")
      console.log(res.data["access-token"])
      sessionStorage.setItem('access-token',res.data["access-token"])
      

      accessToken.value = res.data["access-token"]
      const token = res.data['access-token'].split('.')
      let id = JSON.parse(atob(token[1]))['id']

      loginUserId.value = id;

      router.push({name: 'main'})
    .catch((e) => {
      console.log("로그인 실패")
      alert(e)
    })


    })
  
  }
  return{
    userLogin, loginUserId
  }
}
)

