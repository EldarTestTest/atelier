<template>
  <h2 v-if="isLogin">You are logging, {{email}}</h2>
</template>

<script>
  import {eventBus} from "../main"

  export default {
    name: "success-message",
    data() {
      return {
        isLogin: false,
        email: ""
      }
    },
    created() {
      eventBus.$on("login", (object) => {
        if (object.email !== undefined && object.password !== undefined
          && object.email.length > 0 && object.password.length > 0) {
          this.email = object.email;
          this.isLogin = true;
        } else {
          this.isLogin = false;
        }
      })
    }
  }
</script>

<style scoped>

</style>
