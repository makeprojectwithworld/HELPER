import { defineStore } from "pinia"

const REST_API = 'http://localhost:8080/boardapi'

export const useBoardStore = defineStore('board',() => {
  const accessToken = ref('')

})