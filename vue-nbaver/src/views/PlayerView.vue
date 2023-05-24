<template>
  <div class="player-view">
    <table>
      <thead>
        <tr>
          <th>Link</th>
          <th>PlayerID</th>
          <th>PlayerName</th>
          <th>BirthDate</th>

        </tr>
      </thead>
      <tbody>
        <tr v-for="player in players" :key="player.playerName">
          <td>{{ player.link }}</td>
          <td>{{ player.playerId }}</td>
          <td>{{ player.playerName }}</td>
          <td>{{ player.birthDate }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
import axios from 'axios';
export default {
  data(){
    return {
      players:[]
    };
  },
  mounted(){
    this.nbaPlayers();
  },
  methods: {
    nbaPlayers(){
      axios
      .get('http://localhost:2306/server/nba/all')
      .then((response)=>{
        this.players= response.data;
      })
      .catch((err)=>{
        console.log(err);
      });
    }
  }

}
</script>

<style>

</style>