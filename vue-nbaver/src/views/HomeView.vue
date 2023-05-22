<template>
  <div class="home">  
    <hr/>
    <div class="home1">
      <img src="../assets/homepic/LiveIcon.png" class="img1" />
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
    <footer>
      <p class="footer2">© 2023 (주)허앤조콤퓨타개발단. All rights reserved.</p>
    </footer>
  </div>
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


  .img1{
    position: absolute;
    top: 170px;
    left:150px;
    width: 50px;
    height: 25px;

  }
  .img2{
    position: absolute;
    top: 200px;
    left:150px;
    width: 750px;
    height: 200px;
  }
  .img3{
    position: absolute;
    top: 200px;
    left:950px;
    width: 350px;
    height: 200px;
  }

  .home3{
    position: absolute;
    top: 450px;
    left: 150px;
    width: 750px;
    height: 580px;
    background : linear-gradient(45deg,skyblue,lightGreen);
    border-radius: 2%;
    font-weight: bold;
  }
  .img4{
    width:450px;
    height:300px;
  }
  .img5{
    position: absolute;
    top: 530px;
    left: 980px;
    width:350px;
    height:1000px;
  }
  .home4{
    position: absolute;
    top: 450px;
    left: 950px;
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

  hr{
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.3);
    opacity: 0.5;
  }
  .hr90{
    width : 90%;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.3);
    opacity: 0.5;
  }

  footer{
  background: linear-gradient(45deg,skyblue, lightGreen) ;
  width: 100%;
  height: 70px;
  position: absolute;
  bottom: 0;
  
}
.footer2{
  font-weight: bold;
  font-size:15px;
  position: absolute;
  left:0;
  margin-left: 100px;
}
</style>
