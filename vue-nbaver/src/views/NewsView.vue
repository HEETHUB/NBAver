<template>
 <div class="news">
    <div>
        <input type="text" v-model="searchNews" placeholder="뉴스 검색" class="news-search" @keydown.enter="searchNewsFn" />
      </div>
    <ul class="news-list">
     <h2 style="text-align: left;">최신 뉴스</h2>
      <li v-for="paper in paginatedNews" :key="paper.title" class="news-item">
        <a :href="paper.originallink" target="_blank" class="news-title" v-html="formatTitle(paper.title)"></a><br>
        <p class="news-description" v-html="formatTitle(paper.description)"></p>
        <p class="news-pubdate">{{ paper.pubDate }}</p>
      </li>
    </ul>
    <div v-if="filteredNews.length === 0" style="text-align: center; margin-top: 20px;">
      검색 결과가 없습니다.
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
      news: [],
      searchNews: "",
      currentPage: 1,
      newsPerPage: 15,
      visiblePageCount: 7,
    };
  },
  mounted() {
    this.latestnews();
  },
  methods: {
    latestnews() {
      axios
        .get("http://localhost:2306/server/nba/news/nba농구")
        .then((response) => {
          this.news = response.data;
        })
        .catch((err) => {
          console.log(err);
        });
    },
    formatTitle(title) {
      const formattedTitle = title
        .replace(/&apos;/g, "'")
        .replace(/&apos;/g, "'")
        .replace(/&lt;b&gt;/g, "<b>")
        .replace(/&lt;\/b&gt;/g, "</b>");

      return formattedTitle;
    },

    searchNewsFn() {
      if (this.searchNews.trim() !== "") {
        this.currentPage = 1;
      }
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
    filteredNews() {
      if (this.searchNews === "") {
        return this.news;
      }
      const searchTerm = this.searchNews.toLowerCase();
      return this.news.filter(
        (paper) =>
          paper.title.toLowerCase().includes(searchTerm) ||
          paper.description.toLowerCase().includes(searchTerm)
      );
    },
    paginatedNews() {
      const startIndex = (this.currentPage - 1) * this.newsPerPage;
      const endIndex = startIndex + this.newsPerPage;
      return this.filteredNews.slice(startIndex, endIndex);
    },
    totalPages() {
      return Math.ceil(this.filteredNews.length / this.newsPerPage);
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
/* 검색바 스타일링 */


.news-search {
  flex: 1;
  margin-top: 40px;
  margin-left: 800px;
  padding: 6px;
  border-radius: 4px;
  width: 120px;
  height: 20px;
}
button {
  margin-left: 10px;
}
/* 리스트 스타일링 */
.news-list {
  list-style: none;
  margin-top: -70px;
  padding: 0;
}

.news-item {
  margin-bottom: 20px;
}

.news-title {
  font-weight: bold;
  float: left;
}

.news-description {
  margin-top: 10px;
  text-align: left;
}

.news-pubdate {
  color: gray;
  text-align: left;
}

/* 추가적인 스타일링 */

.pagination {
  margin-top: 16px;
  display: flex;
  justify-content: center;
}

.pagination button {
  margin: 0 4px;
  padding: 4px 8px;
  background-color: black;
  border: 1px solid #ccc;
  border-radius: 4px;
  cursor: pointer;
  margin-bottom: 100px;
}

.pagination button.active {
  background-color: #ccc;
}
</style>
