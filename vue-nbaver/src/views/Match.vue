<template>
  <div class="match-schedule-view">
    <div class="table-container">
      <h2 style="text-align: left; margin-bottom: 30px;">경기 일정</h2>
      <table>
        <thead>
          <tr>
            <th>Date</th>
            <th>Day</th>
            <th>Time</th>
            <th>Team Left</th>
            <th>Team Right</th>
            <th>Score</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="match in matches" :key="match.month + match.day">
            <td>{{ match.month }}/{{ match.day }}</td>
            <td>{{ match.dow }}</td>
            <td>{{ match.hour }}</td>
            <td>{{ match.teamLeft }}</td>
            <td>{{ match.teamRight }}</td>
            <td>{{ match.score }}</td>
          </tr>
        </tbody>
      </table>
    </div>
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "MatchSchedule", // Updated component name
  
  data() {
    return {
      matches: [],
    };
  },
  mounted() {
    this.getMatchSchedule();
  },
  methods: {
    getMatchSchedule() {
      axios
        .get("http://localhost:2306/server/nba/match-schedule")
        .then((response) => {
          this.matches = response.data;
        })
        .catch((error) => {
          console.log(error);
        });
    },
  },
};
</script>

<style scoped>
/* 테이블 스타일링 */
.table-container {
  margin-top: 20px;
}

thead {
  background-color: #f5f5f5;
}

th,
td {
  padding: 8px;
  border: 1px solid #ccc;
}

</style>
