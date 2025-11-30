import axios from "axios"

console.log(import.meta.env.VITE_API_BASE_URL)
export const baseURL = import.meta.env.VITE_API_BASE_URL

export const httpClient = axios.create({
    baseURL: baseURL,
});
