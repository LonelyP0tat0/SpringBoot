<script setup>

import { ref } from "vue";
import axios from "axios";

const songList = ref([]);
const fetchingSongs = ref(false);

async function fetchSongs() {

  const response = await axios.get("http://localhost:8080/api/songs");
  songList.value.push(response.data);

}

import song from "./song.vue";


</script>

<template>

  <song
    v-for="song in songList"
    v-bind:id="song"
  />

</template>

<style scoped>

</style>