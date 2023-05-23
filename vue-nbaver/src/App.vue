<template>
  <div id="app">
    <header></header>
    <nav>
    <router-link to="/">
      <img class="logo" src="./assets/NBAVER LOGO TRANSPARENT.png"/>
    </router-link> 
    <router-link to="/todays-game" class="r1" style="text-decoration:none">오늘의 경기</router-link>
    <router-link to="/schedule" class="r2" style="text-decoration:none">경기 일정</router-link>
    <router-link to="/highlight" class="r3" style="text-decoration:none">하이라이트 영상</router-link>
    <router-link to="/news" class="r4" style="text-decoration:none">뉴스</router-link>
    <router-link to="/ranking" class="r5" style="text-decoration:none">랭킹</router-link>
    <router-link to="/player" class="r6" style="text-decoration:none">선수 정보</router-link>
    <router-link to="/community" class="r7" style="text-decoration:none">커뮤니티</router-link>
    <router-link to="/prediction-vote" class="r8" style="text-decoration:none">승부 예측</router-link>
    <img src="./assets/homepic/menuicon.png" class="menu-icon" />
    <router-link to="/login" class="r9" style="text-decoration:none">로그인</router-link>
    <router-link to="/signup" class="r10" style="text-decoration:none">회원가입</router-link>
    </nav>
    <router-view/>
  </div>
</template>
   
<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

header {
  background: linear-gradient(45deg,skyblue, lightGreen) ;
  max-width:1920px;
  width: 100%;
  height: 75px;
  position: fixed;
  top:0;
  z-index : 9999;
}

.logo {
  position: fixed;
  top:15px;
  left: 300px;
  width: 135px;
  height: 50px;
  z-index : 9999;
}

.menu-icon {
  position: fixed;
  top: 26px;
  left: 1390px;
  z-index : 9999;
}

nav {
  padding: 30px;
}

nav a {
  font-weight: bold;
  color: #2c3e50;
}

nav a.router-link-exact-active {
  /* color: #42b983; */
  color: blue;
}

.r1 {
  position: fixed;
  top:30px;
  left: 450px;
  font-size: 15px;
  color : white;
  z-index : 9999;
}
.r2 {
  position: fixed;
  top:30px;
  left: 550px;
  font-size: 15px;
  color : white;
  z-index : 9999;
}
.r3 {
  position: fixed;
  top:30px;
  left: 640px;
  font-size: 15px;
  color : white;
  z-index : 9999;
}
.r4 {
  position: fixed;
  top:30px;
  left: 770px;
  font-size: 15px;
  color : white;
  z-index : 9999;
}
.r5 {
  position: fixed;
  top:30px;
  left: 825px;
  font-size: 15px;
  color : white;
  z-index : 9999;
}
.r6 {
  position: fixed;
  top:30px;
  left: 880px;
  font-size: 15px;
  color : white;
  z-index : 9999;
}
.r7 {
  position: fixed;
  top:30px;
  left: 965px;
  font-size: 15px;
  color : white;
  z-index : 9999;
}
.r8 {
  position: fixed;
  top:30px;
  left: 1050px;
  font-size: 15px;
  color : white;
  z-index : 9999;
}
.r9 {
  position: fixed;
  top:30px;
  left: 1450px;
  font-size: 15px;
  color : white;
  z-index : 9999;
}
.r10 {
  position: fixed;
  top:30px;
  left: 1520px;
  font-size: 15px;
  color : white;
  z-index : 9999;
}


</style>
