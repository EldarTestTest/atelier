<template>
  <div class="app">
    <header-app/>
    <h2>Hello World!</h2>
    <login-form/>
    <success-message/>
  </div>
</template>

<script>
  import LoginForm from "../LoginForm"
  import SuccessMessage from "../SuccessMessage"
  import HeaderApp from "../header/HeaderApp"

  export default {
    components: {
      LoginForm,
      SuccessMessage,
      HeaderApp
    }
  }
</script>

<style>
  body {
    margin: 0 auto;
    min-height: 100%;
  }
  .app {
    margin: 0 auto;
    width: 100%;
  }
</style>
