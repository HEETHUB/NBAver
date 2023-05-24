<template>
  <div class="signup">
    <form method="post" @submit="handleSubmit">
      <img src="@/assets/NBAVER LOGO TRANSPARENT.png" style="width: 250px; position:relative; bottom: 30px;"/>
      <fieldset>
        <legend>회원가입</legend>
        <div class="form-group">
          <div class="label-input">
            <label for="userId">아이디</label>
            <div class="input-group">
              <input type="text" id="userId" name="userId" v-model="userId" />
              <button @click="checkAvailability">중복 확인</button>
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
        <div class="form-group">
          <div class="label-input">
            <div class="input-group">
              <label for="userName">이름</label>
              <input type="text" id="userName" name="userName" v-model="userName" />
        </div>
          </div>
        </div>
        <div class="form-group">
          <div class="label-input">
            <div class="input-group">
              <label for="email">이메일</label>
              <input type="email" id="email" name="email" v-model="email" />
            </div>
          </div>
        </div>
        <div class="form-actions">
          <input type="submit" value="등록" /> &nbsp;
          <input type="reset" value="초기화" />
        </div>
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
      event.preventDefault();
      const isValid = this.validateForm();

      if (isValid) {
        // Make an API request to register the user
        axios
          .post("http://localhost:2306/server/user/signup", {
            userId: this.userId,
            password: this.password,
            userName: this.userName,
            email: this.email,
          })
          .then(() => {
            // Assuming the registration is successful
            alert("회원가입이 완료되었습니다.");
            this.resetForm();
          })
          .catch((error) => {
            console.error(error);
            // Display an error message if registration fails
            alert("회원가입에 실패하였습니다. 다시 시도해주세요.");
          });
      }
    },
    validateForm() {
      if (!this.userId || !this.password || !this.userName || !this.email) {
        return false;
      }
      if (this.duplicateMessage !== "사용 가능한 아이디입니다.") {
        return false;
      }
      return true;
    },

    checkAvailability() {
      axios
        .get(`http://localhost:2306/server/user/users`)
        .then((response) => {
          const userList = response.data;
          const duplicateUser = userList.find(
            (user) => user.userId === this.userId
          );
          if (duplicateUser) {
            alert("이미 사용 중인 아이디입니다.");
            this.duplicateMessage = "";
          } else {
            alert("사용 가능한 아이디입니다.");
            this.duplicateMessage = "사용 가능한 아이디입니다.";
          }
        })
        .catch((error) => {
          console.error(error);
        });
    },
    resetForm() {
      this.userId = "";
      this.password = "";
      this.userName = "";
      this.email = "";
    },
  },
};
</script>

<style>
body {
  height: 100%;
  margin-bottom: 800px;
}

.signup {
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

.form-actions input[type="submit"],
.form-actions input[type="reset"] {
  padding: 8px 15px;
  background-color: #4caf50;
  color: white;
  border: none;
  border-radius: 3px;
  cursor: pointer;
}

.form-actions input[type="submit"]:hover,
.form-actions input[type="reset"]:hover {
  background-color: #45a049;
}
</style>
