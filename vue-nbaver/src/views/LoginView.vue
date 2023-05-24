<template>
  <div class="login">
    <form method="get" @submit="handleSubmit">
      <img src="@/assets/NBAVER LOGO TRANSPARENT.png" style="width: 250px; position:relative; bottom: 30px;"/>
      <fieldset>
        <legend>로그인</legend>
        <div class="form-group">
          <div class="label-input">
            <label for="userId">아이디</label>
            <div class="input-group">
              <input type="text" id="userId" name="userId" v-model="userId" />
            </div>
          </div>
          <div v-if="duplicateMessage" class="duplicate-message">
            {{ duplicateMessage }}
          </div>
        </div>
        <div class="form-group">
          <div class="label-input">
            <div class="input-group">
              <label for="password">비밀번호</label>
              <input type="password" id="password" name="password" v-model="password" />
            </div>
          </div>
        </div>
        <div class="form-actions">
          <input type="submit" value="로그인" /> &nbsp;
        </div>
          <span>계정이 없으신가요?</span> &nbsp;
          <router-link to="/signup" class="signup_in_login">회원가입</router-link>
      </fieldset>
    </form>
  </div>
</template>

<script>
import axios from "axios";


export default {
  data() {
    return {
      userId: "",
      password: "",
      userName: "",
      email: "",
      duplicateMessage: "",
    };
  },
  methods: {
    handleSubmit(event) {
      event.preventDefault(); // 폼의 기본 동작인 페이지 새로고침 방지

      // 서버로 보낼 데이터
      const data = {
        userId: this.userId,
        password: this.password,
      };

      // GET 요청 보내기
      axios.get("/login", { params: data })
        .then(response => {
          // 응답 처리
          const result = response.data;
          if (result.success) {
            // 로그인 성공
            alert("로그인 성공!");
            // 로그인 성공 시 리다이렉트 등 필요한 작업 수행
          } else {
            // 로그인 실패
            this.duplicateMessage = "아이디와 비밀번호를 확인해주세요.";
          }
        })
        .catch(error => {
          console.error(error);
        });
    },
  },
};
</script>

<style>
body {
  height: 100%;
  margin-bottom: 800px;
}

.login {
  max-width: 600px;
  position: relative;
  top: 150px;
  margin: auto;
  background-color: #f5f5f5;
  border: 1px solid #ccc;
  border-radius: 5px;
  margin-bottom: 150px;
  padding: 20px;
}

legend {
  font-size: 1.2rem;
  font-weight: bold;
  margin-bottom: 10px;
}

.form-group {
  display: flex;
  flex-direction: column;
  align-items: flex-start;
  margin-bottom: 15px;
}

.label-input {
  display: flex;
  align-items: center;
  width: 100%;
}

.label-input label {
  width: 100px;
  margin-right: 10px;
}

.input-group {
  display: flex;
  align-items: center;
  flex: 1;
}

.input-group input[type="text"],
.input-group input[type="password"],
.input-group input[type="email"] {
  flex: 1;
  width: 100%;
  padding: 8px;
  border-radius: 3px;
  border: 1px solid #ccc;
}

button {
  padding: 8px 15px;
  background-color: #4caf50;
  color: white;
  border: none;
  border-radius: 3px;
  cursor: pointer;
  margin-left: 10px;
}

button:hover {
  background-color: #45a049;
}

.duplicate-message {
  margin-top: 5px;
  color: red;
}

.form-actions {
  margin-top: 15px;
  text-align: right;
}

.form-actions input[type="submit"]{
  padding: 8px 15px;
  background-color: #4caf50;
  color: white;
  border: none;
  border-radius: 3px;
  cursor: pointer;
}


.form-actions input[type="submit"]:hover
{
  background-color: #45a049;
}
</style>
