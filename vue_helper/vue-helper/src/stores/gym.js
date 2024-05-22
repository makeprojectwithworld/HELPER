import axios from "axios"
import { defineStore } from "pinia"
import {ref} from 'vue'

const REST_API = `http://localhost:8080/gymapi`

export const useGymStore = defineStore('gym', () =>{
  const gymList = ref([])
  const accessToken = ref('')

  const getGymList = function() {
    axios.get(`${REST_API}/allgyms`,{
      headers: {
        'access-token': accessToken.value,
        'Authorization': `Bearer ${accessToken.value}`
      }
    }
    )
    .then((res) =>{
      gymList.value = res.data
      console.log(res.data)
    })
  }

  const gym = ref({})
  const getGym = function (name){
    axios.get(`${REST_API}/helper/${name}`,{
      headers: {
        'access-token': accessToken.value
      }
    })
    .then((res) =>{
      gym.value = res.data
    })
  }

  return{getGymList, getGym, gymList}

})