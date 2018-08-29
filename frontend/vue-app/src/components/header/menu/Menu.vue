<template>
  <div class="menu">
    <ul>
      <li><a href="#">Category1</a></li>
      <li><a href="#">Category2</a></li>
      <li><a href="#">Category3</a></li>
    </ul>
  </div>
</template>

<script>
  import AxiosHttp from "../../../utils/AxiosHttp"
  import axios from "axios";

  export default {
    name: "menu",
    computed: {
      getAllBaskets() {
        axios.get("http://185.20.224.170:8080/atelier/api/rest/basket/getAll")
          .then(response => {
            console.log(response)
          })
      }
    }
  }
</script>

<style scoped>
  ul {
    -webkit-padding-start: 0em;
    -webkit-padding-end: 0em;
    -webkit-padding-after: 0em;
    -webkit-padding-before: 0em;
    display: flex;
    justify-content: space-around;
    margin: 0 auto;
  }

  li {
    list-style-type: none;
  }

  a {
    color: forestgreen;
  }

  .menu {
    margin: 0 auto;
    background: #e9ffe0;
  }
</style>
