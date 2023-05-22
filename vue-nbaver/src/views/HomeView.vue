<template>
  <div class="home">  
    <div class="home1">
      <p>하이라이트 영상</p>
      <img src="../assets/homepic/highlightcapture.png" class="img1"/>
    </div>
    <div class="home2">

    </div>
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
  .home1{
    position: absolute;
    top: 100px;
    left: 50px;
    width: 500px;
    height: 300px;
    background-color: #00E676;
    border-radius: 5%;
    font-weight: bold;
  }
  .img1{
    width:300px;
    height:200px;
  }
</style>
