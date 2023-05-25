<template>
  <div class="player-view">
    <div class="search-bar">
      <input type="text" v-model="searchName" placeholder="선수 검색" class="player-search" />
    </div>
    <div class="table-container">
      <table>
        <thead>
          <tr>
            <th></th>
            <th>PlayerName</th>
            <th>BirthDate</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="player in paginatedPlayers" :key="player.playerId">
            <td>
              <img :src="getPlayerImage(player.playerId)" @error="setDefaultImage" style="width: 70px; height:60px;" />
            </td>
            <td>{{ player.playerName }}</td>
            <td>{{ player.birthDate }}</td>
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
      players: [],
      searchName: "",
      currentPage: 1,
      playersPerPage: 20,
      visiblePageCount: 5, // Number of visible page buttons
      defaultImageURL: require("../assets/playerstatpic/default_profile.png"), 
    };
  },
  mounted() {
    this.nbaPlayers();
  },
  methods: {
    nbaPlayers() {
      axios
        .get("http://localhost:2306/server/nba/all")
        .then((response) => {
          this.players = response.data;
        })
        .catch((err) => {
          console.log(err);
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
    getPlayerImage(playerId) {
      const imageURL = `https://cdn.nba.com/headshots/nba/latest/1040x760/${playerId}.png`;
      return imageURL;
    },
    setDefaultImage(event) {
      event.target.src = this.defaultImageURL;
    },
  },
  computed: {
    filteredPlayers() {
      return this.players.filter((player) =>
        player.playerName.toLowerCase().includes(this.searchName.toLowerCase())
      );
    },
    paginatedPlayers() {
      const startIndex = (this.currentPage - 1) * this.playersPerPage;
      const endIndex = startIndex + this.playersPerPage;
      return this.filteredPlayers.slice(startIndex, endIndex);
    },
    totalPages() {
      return Math.ceil(this.filteredPlayers.length / this.playersPerPage);
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
.search-bar {
  display: flex;
  align-items: center;
  position: relative;
  top: 100px;
  padding-right: 10px;
  background-color: #f5f5f5;
  border: 1px solid #ccc;
  border-radius: 4px;
}

.player-search {
  flex: 1;
  margin: 0;
  padding: 6px;
  border-radius: 4px;
  width: 120px;
  height: 20px;
}

.search-icon {
  color: #666;
  font-size: 18px;
  margin-left: 8px;
  width: 20px;
  height: 20px;
}

/* 테이블 스타일링 */
.table-container {
  margin-top: 130px;
  position: relative;
}


thead {
  background-color: #f5f5f5;
}

th,
td {
  padding: 8px;
  border: 1px solid #ccc;
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
