import Vue from 'vue'
import VueRouter from 'vue-router'
import HomeView from '../views/HomeView.vue'
import TodaysGameView from '../views/TodaysGameView.vue'
import Match from '../views/Match.vue'
import HighlightView from '../views/HighlightView.vue'
import NewsView from '../views/NewsView.vue'
import RankingView from '../views/RankingView.vue'
import PlayerView from '../views/PlayerView.vue'
import CommunityView from '../views/CommunityView.vue'
import PredictionVoteView from '../views/PredictionVoteView.vue'
import LoginView from '../views/LoginView.vue'
import SignUpView from '../views/SignUpView.vue'


Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/todays-game',
    name: 'todays-game',
    component: TodaysGameView
  },
  {
    path: '/match',
    name: 'match',
    component: Match
  },
  {
    path: '/highlight',
    name: 'highlight',
    component: HighlightView
  },
  {
    path: '/news',
    name: 'news',
    component: NewsView
  },
  {
    path: '/ranking',
    name: 'ranking',
    component: RankingView
  },
  {
    path: '/player-view',
    name: 'player-view',
    component: PlayerView
  },
  {
    path: '/community',
    name: 'community',
    component: CommunityView
  },
  {
    path: '/prediction-vote',
    name: 'prediction-vote',
    component: PredictionVoteView
  },
  {
    path: '/login',
    name: 'login',
    component: LoginView
  },
  {
    path: '/signup',
    name: 'signup',
    component: SignUpView
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
