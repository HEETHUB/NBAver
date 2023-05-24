<template>
<div class="body">
  <div id="app">
    <div class="outer">
      <div class="header">
       <div class="category">
          <div class="logo_area">
            <router-link to="/">
             <img class="logo" src="./assets/NBAVER LOGO TRANSPARENT.png"/>
           </router-link>        
           </div>
            <div class="menu_area">  
              <ul>
                <li>
                  <router-link to="/todays-game" class="r1">오늘의 경기</router-link>
                </li>
                <li>
                  <router-link to="/schedule" class="r1">경기 일정</router-link>
                </li>
                <li>
                   <router-link to="/highlight" class="r1">하이라이트 영상</router-link>
                </li>
                <li>
                   <router-link to="/news" class="r1">뉴스</router-link>
                </li>
                <li>
                   <router-link to="/ranking" class="r1">랭킹</router-link>
                </li>
                <li>
                  <router-link to="/player" class="r1" >선수 정보</router-link>
                </li>
                <li>
                   <router-link to="/community" class="r1">커뮤니티</router-link>
                </li>
                <li>
                  <router-link to="/prediction-vote" class="r1">승부 예측</router-link>
                </li>
              </ul>
           </div>
          <div class="login_area">
             <span class="r2">
               <img src="./assets/homepic/menuicon.png"/>
             </span>
             <span class="r3">   
               <router-link to="/login" class="r3" >로그인</router-link>  
            </span>
            <span class="r4">
               <router-link to="/signup" class="r4">회원가입</router-link>
           </span>       
          </div>
           <router-view></router-view>
        </div>
      </div>
    </div>
    <a href="#" class="btn_gotop">
      <img src="./assets/homepic/topbutton.png" class="topbtn" />
   </a>
  </div>
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
.outer{
  height: 75px;
  position: relative;
}

.header {
    background: black ;
    border-bottom: 1px solid #d6d6d6;
    box-sizing: content-box;
    height: 75px;
    width: 100%;
    z-index: 100;
}

.logo_area{
    float: left;
    height: 100%;
    text-align: left;
    width: 180px;
}
.logo {
    display: inline-block;
    text-align: left;
    width: 135px;
    top: 16px;
    height: 45px;
    position: relative;
    vertical-align: middle;
}

.category{
    height: 100%;
    margin: 0 auto;
    position: relative;
    width: 1168px;
}

.menu_area{
    display: block;
    float: left;
    height: 100%;
    position: relative;
}
.menu_area>ul{
    display: inline-block;
    height: 100%;
    margin-top: 30px;
    vertical-align: middle;
    list-style: none;
}
.menu_area>ul>li{
  display: inline-block;
  height: 100%;
}
.menu_area>ul>li + li{
  margin-left: 30px;
}

.login_area{
    float: right;
    height: 100%;
}


/* nav {
  padding: 30px;
}

nav a {
  font-weight: bold;
  color: #2c3e50;
}

nav a.router-link-exact-active {
  /* color: #42b983; */
  /* color: blue;
} */ 

.r1 {
    margin: 0;
    padding: 0;
    font-size: 15px;
    line-height: 18px;
    text-decoration: none;
    color:#d6d6d6;
}
.r2{
    display: inline-block;
    height: 30px;
    line-height: 30px;
    margin-top: 22px;
    margin-right: 10px;
    position: relative;
    text-align: center;
  
}
.r3{
    position: relative;
    margin-left:10px;
    bottom: 6px;   
    text-decoration: none;
    color:#d6d6d6;
}
.r4{
    position: relative; 
    bottom:6px;
    margin-left: 10px;
    text-decoration: none;
    color:#d6d6d6;
}

.btn_gotop {
display: block; 
position: fixed; 
bottom: 50px; 
right: 40px; 
z-index: 999; 
outline: none; 
cursor: pointer; 

}
.topbtn{
  width: 50px;
  height: 50px;
}
</style>