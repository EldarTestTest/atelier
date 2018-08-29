import axios from "axios"

const AxiosHttp = axios.create({
  baseURL: "http://185.20.224.170:8080/atelier"
});

export default AxiosHttp;
