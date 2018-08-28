<template>
  <div>
    <info/>
    <h2>Hello World!</h2>
    <login-form/>
    <success-message/>
  </div>
</template>

<script>
  import LoginForm from "../LoginForm"
  import SuccessMessage from "../SuccessMessage"
  import Info from "../header/info/Info"

  export default {
    components: {
      LoginForm,
      SuccessMessage,
      Info
    }
  }
</script>

<style>
  body {
    margin: 0 auto;
    min-height: 100%;
  }
</style>
