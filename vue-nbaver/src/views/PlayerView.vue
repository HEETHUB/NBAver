<template>
  <div class="player-view">
    <table>
      <thead>
        <tr>
          <th>ID</th>
          <th>Name</th>
          <th>Year</th>
          <th>Team</th>
          <th>GP</th>
          <th>Min</th>
          <th>Pts</th>
          <th>FGM</th>
          <th>FGA</th>
          <th>FG%</th>
          <th>3PM</th>
          <th>3PA</th>
          <th>3P%</th>
          <th>FTM</th>
          <th>FTA</th>
          <th>FT%</th>
          <th>OREB</th>
          <th>DREB</th>
          <th>REB</th>
          <th>AST</th>
          <th>TOV</th>
          <th>STL</th>
          <th>BLK</th>
          <th>PF</th>
          <th>FP</th>
          <th>DD2</th>
          <th>TD3</th>
          <th>MGN</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="player in players" :key="player.id">
          <td>{{ player.id }}</td>
          <td>{{ player.name }}</td>
          <td>{{ player.year }}</td>
          <td>{{ player.team }}</td>
          <td>{{ player.gp }}</td>
          <td>{{ player.min }}</td>
          <td>{{ player.pts }}</td>
          <td>{{ player.fgm }}</td>
          <td>{{ player.fga }}</td>
          <td>{{ player.fgp }}</td>
          <td>{{ player.pm3 }}</td>
          <td>{{ player.pa3 }}</td>
          <td>{{ player.pp3 }}</td>
          <td>{{ player.ftm }}</td>
          <td>{{ player.fta }}</td>
          <td>{{ player.ftp }}</td>
          <td>{{ player.oreb }}</td>
          <td>{{ player.dreb }}</td>
          <td>{{ player.reb }}</td>
          <td>{{ player.ast }}</td>
          <td>{{ player.tov }}</td>
          <td>{{ player.stl }}</td>
          <td>{{ player.blk }}</td>
          <td>{{ player.pf }}</td>
          <td>{{ player.fp }}</td>
          <td>{{ player.dd2 }}</td>
          <td>{{ player.td3 }}</td>
          <td>{{ player.mgn }}</td>
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