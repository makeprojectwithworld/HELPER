import { createRouter, createWebHistory } from 'vue-router'
import HelperMain from '../views/HelperMain.vue'
import HelperHome from '../views/HelperHome.vue'
import HelperLogin from '@/components/HelperLogin.vue'
import HelperSignUp from '@/components/HelperSignUp.vue'
import HelperPostDetail from '@/components/HelperPostDetail.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'main',
      component: HelperMain
    },
    {
      path: '/home',
      name: 'home',
      component: HelperHome
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
      path: '/detail',
      name: 'detail',
      component: HelperPostDetail
    }
  ]
})

export default router
