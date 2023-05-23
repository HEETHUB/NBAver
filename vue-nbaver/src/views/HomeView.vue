<template>
  <body>
  <div class="home">  
    <div class="home0">
    <img src="../assets/homepic/LiveIcon.png" class="img1" />
    </div>
    <div class="home1">
      <img src="../assets/homepic/matches.png" class="img2" />
    </div>
    <div class="home2">
      <img src="../assets/homepic/predictionvote.png" class="img3" />  
    </div>
    <div class="home3">
      <p class="inner-title">하이라이트 영상</p>
      <hr class="hr90"/> <br/>
      <img src="../assets/homepic/highlightcapture.png" class="img4"/>
    </div>
    <div class="home4">
      <p class="inner-title">2022-23 팀 순위</p>
      <hr class="hr90"/> <br/>
    </div>
    <img src="../assets/homepic/standings.png" class="img5" />
    </div>
    <div class="footer">
      <p class="footer2">© 2023 (주)허앤조콤퓨타개발단. All rights reserved.</p>
    </div>
  </body>
</template>

<script>
// @ is an alias to /src
// import HelloWorld from '@/components/HelloWorld.vue'



export default {
  name: 'HomeView',
  components: {
    
  }
}
</script>

<style>
  body{
  margin: 0;
  padding: 0;
  }
  .home{
    display: table-row;
    position: relative;
    width: 100%;
    height: 100vh;
    margin: 0 auto;
    padding-bottom: 100px;
    
  }
  .home0{
    position: relative;
    margin-top:10%;
  }
  .home1{
    position: relative;
  }
  .home2{
    position: relative;
    margin-top: 20%;
  }
  .img1{
    float:left;
    width: 50px;
    height: 25px;

  }
  .img2{
    width: 750px;
    height: 200px;
  }
  .img3{
    width: 350px;
    height: 200px;
  }

  .home3{
    width: 750px;
    height: 580px;
    background: linear-gradient(45deg,skyblue, lightgreen,turquoise) ;;
    border-radius: 2%;
    font-weight: bold;
  }
  .img4{
    width:450px;
    height:300px;
  }
  .img5{
    
    top: 530px;
    left: 980px;
    width:350px;
    height:1000px;
  }
  .home4{
    width: 400px;
    height: 70px;
    background : linear-gradient(45deg,skyblue,lightGreen);
    border-radius: 2%;
    font-weight: bold;
  }

  .inner-title{
    text-align: left;
    padding-left : 20px;
  }

  .hr90{
    width : 90%;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.3);
    opacity: 0.5;
  }

  footer{
    border-top: 1px solid linear-gradient(45deg,skyblue, lightGreen);
    display: block;
    width: 100%;
}
.footer2{
  font-weight: bold;
  font-size:15px;

  margin-left: 100px;
}
</style>
