<template>
  <div class="header-info">
    <container/>
  </div>
</template>

<script>
  import Container from "../info/container/Container"

  export default {
    name: "info",
    components: {
      Container
    }
  }
</script>

<style scoped>
  .header-info {
    height: 40px;
    background-color: rgb(22, 22, 22);
  }
</style>
