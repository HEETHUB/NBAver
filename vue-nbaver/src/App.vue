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
  width: 100%;
  height: 70px;
  position: fixed;
  top:0;
}

.logo {
  position: fixed;
  top:20px;
  left: 100px;
  width: 120px;
  height: 50px;
}

.menu-icon {
  position: fixed;
  top: 26px;
  left: 1100px;
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
  left: 250px;
  font-size: 15px;
  color : white;
}
.r2 {
  position: fixed;
  top:30px;
  left: 350px;
  font-size: 15px;
  color : white;
}
.r3 {
  position: fixed;
  top:30px;
  left: 440px;
  font-size: 15px;
  color : white;
}
.r4 {
  position: fixed;
  top:30px;
  left: 570px;
  font-size: 15px;
  color : white;
}
.r5 {
  position: fixed;
  top:30px;
  left: 630px;
  font-size: 15px;
  color : white;
}
.r6 {
  position: fixed;
  top:30px;
  left: 687px;
  font-size: 15px;
  color : white;
}
.r7 {
  position: fixed;
  top:30px;
  left: 775px;
  font-size: 15px;
  color : white;
}
.r8 {
  position: fixed;
  top:30px;
  left: 860px;
  font-size: 15px;
  color : white;
}
.r9 {
  position: fixed;
  top:30px;
  left: 1180px;
  font-size: 15px;
  color : white;
}
.r10 {
  position: fixed;
  top:30px;
  left: 1250px;
  font-size: 15px;
  color : white;
}


</style>
