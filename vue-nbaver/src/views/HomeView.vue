<template>
<body>
  <div class="home">
    <div class="home3">
      <p class="inner-title">하이라이트 영상</p>
      <hr class="hr90" /><br />

      <section class="slick" aria-label="Gallery">
        <ol class="slick__viewport">
          <li v-for="(video, index) in videos" :key="index" :id="`carousel__slide${index + 1}`" tabindex="0" class="carousel__slide">
            <div class="carousel__snapper">
              <router-link to="/highlight">
                <img :src="getYouTubeThumbnailUrl(video.videoId)" class="thumbnail-image" :alt="`Video Thumbnail ${index + 1}`" />
              </router-link>
            </div>
          </li>
        </ol>
        <aside class="carousel__navigation">
          <ol class="carousel__navigation-list">
            <li v-for="(video, index) in videos" :key="index" class="carousel__navigation-item">
              <a :href="`#carousel__slide${index + 1}`" class="carousel__navigation-button"></a>
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
import axios from 'axios';

export default {
  name: 'HomeView',
  data() {
    return {
      videos: [],
      activeSlide: 0,
    };
  },
  mounted() {
    this.fetchVideos();
    this.startCarousel();
  },
  methods: {
    async fetchVideos() {
      try {
        const response = await axios.get('http://localhost:2306/server/nba/videos/nba%20playoffs%20highlights%202023%20may');
        this.videos = response.data;
      } catch (error) {
        console.error(error);
      }
    },
    getYouTubeThumbnailUrl(videoId) {
      return `https://img.youtube.com/vi/${videoId}/0.jpg`;
    },
    startCarousel() {
      setInterval(() => {
        this.nextSlide();
      }, 5000); // Change slide every 5 seconds (adjust as needed)
    },
    nextSlide() {
      this.activeSlide = (this.activeSlide + 1) % this.videos.length;
    },
  },
};
</script>

<style>
body {
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

.slick__viewport::-webkit-scrollbar {
  width: 0;
}

.slick__viewport::-webkit-scrollbar-track {
  background: transparent;
  scrollbar-width: 0px;
}

.slick__viewport::-webkit-scrollbar-thumb {
  background: transparent;
  border: none;
}

* {
  -ms-overflow-style: none;
}

ol,
li {
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
  scroll-behavior: auto;
  scroll-snap-type: x mandatory;
   scroll-padding: 0 10px;
}

.carousel__slide {
  position: relative;
  flex: 0 0 100%;
  width: 100%;

  counter-increment: item;
}

.carousel__slide:before {
  content: counter(item);
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate3d(-50%, -40%, 70px);
  color: #fff;
  font-size: 2em;
  display: none; /* 숫자 숨김 */
}

.carousel__snapper {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  scroll-snap-align: none;
  
}

@media (hover: hover) {
  .carousel__snapper {
    animation-name: tonext,snap;
    animation-timing-function: ease;
    animation-duration: 5s;
    animation-iteration-count: infinite;
  }

  /* .carousel__slide:last-child .carousel__snapper {
    animation-name: tostart;
  } */
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

/* .carousel__navigation-button {
  display: inline-block;
  width: 1.5rem;
  height: 1.5rem;
  background-color: #333;
  background-clip: content-box;
  border: 0.25rem solid transparent;
  border-radius: 50%;
  font-size: 0;
  transition: transform 0.1s;
} */

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

.home {
  display: table-row;
  position: relative;
  width: 100%;
  height: 100vh;
  margin: 0 auto;
  padding-bottom: 100px;
}

.home3 {
  margin-top: 100px;
  width: 1000px;
  height: 700px;
  background-color: lightgray;
  border-radius: 2%;
  font-weight: bold;
}

.img4 {
  width: 450px;
  height: 300px;
}

.img5 {
  top: 530px;
  left: 980px;
  width: 350px;
  height: 1000px;
}

.home4 {
  width: 400px;
  height: 70px;
  background: linear-gradient(45deg, skyblue, lightGreen);
  border-radius: 2%;
  font-weight: bold;
}

.inner-title {
  text-align: left;
  padding-left: 20px;
}

.hr90 {
  width: 90%;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.3);
  opacity: 0.5;
}

.thumbnail-image{
  width:850px;
 
}

footer {
  border-top: 1px solid linear-gradient(45deg, skyblue, lightGreen);
  display: block;
  width: 100%;
}

.footer2 {
  font-weight: bold;
  font-size: 15px;
  margin-left: 100px;
}
</style>