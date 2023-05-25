<template>
  <div class="highlight">
    <div class="table-container">
      <table>
        <thead>
          <tr>
            <th>영상</th>
            <th>제목</th>
            <th>영상 설명</th>
            <th>시간</th>
            <th>채널</th>
          </tr>
        </thead>
  <tbody>
  <tr v-for="video in paginatedVideos" :key="video.videoId">
    <td>
      <iframe width="240" height="180" :src="video.embedUrl" frameborder="0" allowfullscreen></iframe>
    </td>
    <td>{{ video.title }}</td>
    <td>{{ video.description }}</td>
    <td>{{ video.publishTime }}</td>
    <td>{{ video.channelTitle }}</td>
  </tr>
</tbody>
      </table>
    </div>
    <div class="pagination">
      <button @click="previousPage" :disabled="currentPage === 1">Previous</button>
      <button v-for="pageNumber in visiblePages" :key="pageNumber" @click="changePage(pageNumber)" :class="{ active: currentPage === pageNumber }">
        {{ pageNumber }}
      </button>
      <button @click="nextPage" :disabled="currentPage === totalPages">Next</button>
    </div>
  </div>
</template>

<script>
import axios from "axios";

export default {
  data() {
    return {
      videos: [],
      currentPage: 1,
      videosPerPage: 10,
      visiblePageCount: 5,
    };
  },
  mounted() {
    this.loadVideos();
  },
  methods: {
  loadVideos() {
  axios
    .get('http://localhost:2306/server/nba/videos/nba%20playoffs%20highlights%202023%20may')
    .then((response) => {
      this.videos = response.data.map((video) => {
        const embedUrl = `https://www.youtube.com/embed/${video.videoId}`;
        return { ...video, embedUrl };
      });
    })
    .catch((error) => {
      console.log(error);
    });
},

    changePage(pageNumber) {
      this.currentPage = pageNumber;
    },
    previousPage() {
      if (this.currentPage > 1) {
        this.currentPage--;
      }
    },
    nextPage() {
      if (this.currentPage < this.totalPages) {
        this.currentPage++;
      }
    },
  },
  computed: {
    paginatedVideos() {
      const startIndex = (this.currentPage - 1) * this.videosPerPage;
      const endIndex = startIndex + this.videosPerPage;
      return this.videos.slice(startIndex, endIndex);
    },
    totalPages() {
      return Math.ceil(this.videos.length / this.videosPerPage);
    },
    visiblePages() {
      const startPage = Math.max(1, this.currentPage - Math.floor(this.visiblePageCount / 2));
      const endPage = Math.min(startPage + this.visiblePageCount - 1, this.totalPages);
      return Array(endPage - startPage + 1)
        .fill()
        .map((_, index) => startPage + index);
    },
  },
};
</script>

<style scoped>
.table-container {
  margin-top: 30px;
}

table {
  width: 100%;
}

th,
td {
  padding: 8px;
  text-align: left;
  border-bottom: 1px solid #ddd;
}

.pagination {
  margin-top: 16px;
  display: flex;
  justify-content: center;
}

.pagination button {
  margin: 0 4px;
  padding: 4px 8px;
  background-color: #f5f5f5;
  border: 1px solid #ccc;
  border-radius: 4px;
  cursor: pointer;
}

.pagination button.active {
  background-color: #ccc;
}
</style>
