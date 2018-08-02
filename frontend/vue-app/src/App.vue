<template>
  <div>
    <h2>Hello World!</h2>
    <login-form />
    <success-message />
  </div>
</template>

<script>
  import LoginForm from "./LoginForm"
  import SuccessMessage from "./SuccessMessage"

  export default {
    components: {
      LoginForm,
      SuccessMessage
    }
  }
</script>
