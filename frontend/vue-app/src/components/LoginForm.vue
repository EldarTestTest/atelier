<template>
  <div>
    <h3>Login form</h3>
    <div>
      <div>
        <label>Email:</label>
        <input type="text" v-model="email"/>
      </div>
      <div>
        <label>Password</label>
        <input type="password" v-model="pass"/>
      </div>
      <div>
        <button @click="login">LogIn</button>
      </div>
    </div>
  </div>
</template>

<script>
  import {eventBus} from "../main"

  export default {
    data() {
      return {
        email: "",
        pass: ""
      }
    },
    methods: {
      login() {
        eventBus.$emit("login", {
          email: this.email,
          password: this.pass
        })
      }
    }
  }
</script>
