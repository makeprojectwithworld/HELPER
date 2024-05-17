import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import HelperSignUp from '@/components/HelperSignUp.vue'
import HelperLogin from '@/components/HelperLogin.vue'
import HelloWorld from '@/components/HelloWorld.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/login',
      name: 'login',
      component: HelperLogin,
    },
    {
      path: '/signup',
      name: 'signup',
      component: HelperSignUp
    },
    {
      path: '/main',
      name: 'main',
      component: HelloWorld
    }
  ]
})

export default router
