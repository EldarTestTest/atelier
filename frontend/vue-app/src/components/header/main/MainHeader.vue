<template>
  <div class="main">
    <div class="img-logo">
      <img :src="require('../../../assets/logo.png')"/>
      <img :src="require('../../../assets/logo.png')"/>
      <img :src="require('../../../assets/logo.png')"/>
      <img :src="require('../../../assets/logo.png')"/>
      <img :src="require('../../../assets/logo.png')"/>
      <img :src="require('../../../assets/logo.png')"/>
      <img :src="require('../../../assets/logo.png')"/>
      <img :src="require('../../../assets/logo.png')"/>
      <img :src="require('../../../assets/logo.png')"/>
      <img :src="require('../../../assets/logo.png')"/>
      <img :src="require('../../../assets/logo.png')"/>
    </div>
  </div>
</template>

<script>

  export default {
    name: "mainHeader"
  }
</script>

<style scoped>
  .img-logo {
    display: flex;
    justify-content: center;
  }
  .main {
    background: #b0ffb6;
    margin: 0 auto;
  }
  img {
    width: 20px;
    height: 100%;
  }
</style>
