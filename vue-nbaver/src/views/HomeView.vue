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
      



      <section class="slick" aria-label="Gallery">
  <ol class="slick__viewport">
    <li id="carousel__slide1"
        tabindex="0"
        class="carousel__slide">
      <div class="carousel__snapper">
        <a href="#carousel__slide4"
           class="carousel__prev">Go to last slide</a>
        <a href="#carousel__slide2"
           class="carousel__next">Go to next slide</a>
      </div>
    </li>
    <li id="carousel__slide2"
        tabindex="0"
        class="carousel__slide">
      <div class="carousel__snapper"></div>
      <a href="#carousel__slide1"
         class="carousel__prev">Go to previous slide</a>
      <a href="#carousel__slide3"
         class="carousel__next">Go to next slide</a>
    </li>
    <li id="carousel__slide3"
        tabindex="0"
        class="carousel__slide">
      <div class="carousel__snapper"></div>
      <a href="#carousel__slide2"
         class="carousel__prev">Go to previous slide</a>
      <a href="#carousel__slide4"
         class="carousel__next">Go to next slide</a>
    </li>
    <li id="carousel__slide4"
        tabindex="0"
        class="carousel__slide">
      <div class="carousel__snapper"></div>
      <a href="#carousel__slide3"
         class="carousel__prev">Go to previous slide</a>
      <a href="#carousel__slide1"
         class="carousel__next">Go to first slide</a>
    </li>
  </ol>
  <aside class="carousel__navigation">
    <ol class="carousel__navigation-list">
      <li class="carousel__navigation-item">
        <a href="#carousel__slide1"
           class="carousel__navigation-button">Go to slide 1</a>
      </li>
      <li class="carousel__navigation-item">
        <a href="#carousel__slide2"
           class="carousel__navigation-button">Go to slide 2</a>
      </li>
      <li class="carousel__navigation-item">
        <a href="#carousel__slide3"
           class="carousel__navigation-button">Go to slide 3</a>
      </li>
      <li class="carousel__navigation-item">
        <a href="#carousel__slide4"
           class="carousel__navigation-button">Go to slide 4</a>
      </li>
    </ol>
  </aside>
</section>





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

  @keyframes tonext {
  75% {
    left: 0;
  }
  95% {
    left: 100%;
  }
  98% {
    left: 100%;
  }
  99% {
    left: 0;
  }
}

@keyframes tostart {
  75% {
    left: 0;
  }
  95% {
    left: -300%;
  }
  98% {
    left: -300%;
  }
  99% {
    left: 0;
  }
}

@keyframes snap {
  96% {
    scroll-snap-align: center;
  }
  97% {
    scroll-snap-align: none;
  }
  99% {
    scroll-snap-align: none;
  }
  100% {
    scroll-snap-align: center;
  }
}


/* * {
  box-sizing: border-box;
  scrollbar-color: transparent transparent; /* thumb and track color */
  /* scrollbar-width: 0px;
} */ 

*::-webkit-scrollbar {
  width: 0;
}

*::-webkit-scrollbar-track {
  background: transparent;
}

*::-webkit-scrollbar-thumb {
  background: transparent;
  border: none;
}

* {
  -ms-overflow-style: none;
}

ol, li {
  list-style: none;
  margin: 0;
  padding: 0;
}

.slick {
  position: relative;
  padding-top: 75%;
  filter: drop-shadow(0 0 10px #0003);
  perspective: 100px;
}

.slick__viewport {
  position: absolute;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  width: 80%;
  height: 80%;
  margin: 0 auto;
  display: flex;
  overflow-x: scroll;
  counter-reset: item;
  scroll-behavior: smooth;
  scroll-snap-type: x mandatory;
}

.carousel__slide {
  position: relative;
  flex: 0 0 100%;
  width: 100%;
  background-color: #f99;
  counter-increment: item;
}

.carousel__slide:nth-child(even) {
  background-color: #99f;
}

.carousel__slide:before {
  content: counter(item);
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate3d(-50%,-40%,70px);
  color: #fff;
  font-size: 2em;
}

.carousel__snapper {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  scroll-snap-align: center;
}

@media (hover: hover) {
  .carousel__snapper {
    animation-name: tonext, snap;
    animation-timing-function: ease;
    animation-duration: 4s;
    animation-iteration-count: infinite;
  }

  .carousel__slide:last-child .carousel__snapper {
    animation-name: tostart, snap;
  }
}

@media (prefers-reduced-motion: reduce) {
  .carousel__snapper {
    animation-name: none;
  }
}

.carousel:hover .carousel__snapper,
.carousel:focus-within .carousel__snapper {
  animation-name: none;
}

.carousel__navigation {
  position: absolute;
  right: 0;
  bottom: 0;
  left: 0;
  text-align: center;
}

.carousel__navigation-list,
.carousel__navigation-item {
  display: inline-block;
}

.carousel__navigation-button {
  display: inline-block;
  width: 1.5rem;
  height: 1.5rem;
  background-color: #333;
  background-clip: content-box;
  border: 0.25rem solid transparent;
  border-radius: 50%;
  font-size: 0;
  transition: transform 0.1s;
}

.carousel::before,
.carousel::after,
.carousel__prev,
.carousel__next {
  position: absolute;
  top: 0;
  margin-top: 37.5%;
  width: 4rem;
  height: 4rem;
  transform: translateY(-50%);
  border-radius: 50%;
  font-size: 0;
  outline: 0;
}

.carousel::before,
.carousel__prev {
  left: -1rem;
}

.carousel::after,
.carousel__next {
  right: -1rem;
}

.carousel::before,
.carousel::after {
  content: '';
  z-index: 1;
  background-color: #333;
  background-size: 1.5rem 1.5rem;
  background-repeat: no-repeat;
  background-position: center center;
  color: #fff;
  font-size: 2.5rem;
  line-height: 4rem;
  text-align: center;
  pointer-events: none;
}

.carousel::before {
  background-image: url("data:image/svg+xml,%3Csvg viewBox='0 0 100 100' xmlns='http://www.w3.org/2000/svg'%3E%3Cpolygon points='0,50 80,100 80,0' fill='%23fff'/%3E%3C/svg%3E");
}

.carousel::after {
  background-image: url("data:image/svg+xml,%3Csvg viewBox='0 0 100 100' xmlns='http://www.w3.org/2000/svg'%3E%3Cpolygon points='100,50 20,100 20,0' fill='%23fff'/%3E%3C/svg%3E");
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
    margin-top: 200px;
    width: 750px;
    height: 580px;
    background-color: lightgray;
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
