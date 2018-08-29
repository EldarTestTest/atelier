<template>
  <div>
    <info/>
    <main-header/>
    <menu-header/>
  </div>
</template>

<script>
  import Info from "../header/info/Info"
  import MenuHeader from "../header/menu/Menu"
  import MainHeader from "./main/MainHeader";

  export default {
    name: "headerApp",
    components: {
      Info,
      MainHeader,
      MenuHeader
    }
  }
</script>

<style scoped>

</style>
