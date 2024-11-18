<script>

import axios from "axios";

export default {
  data() {
    return {
      songs: []
    };
  },
  created() {
    this.fetchSongs();
  },
  methods: {
    async fetchSongs() {
      try {
        const response = await axios.get("http://localhost:8080/api/songs");
        this.songs = response.data;
      } catch (error) {
        console.log(error);
      }
    }
  }
};

</script>

<template>

  <ul v-if="songs.length">
    <li v-for="song in songs" :key="song.id">
      <h2>{{ song.title }}</h2>
      <p><strong>Author:</strong> {{ song.author }}</p>
      <p><strong>Genre:</strong> {{ song.genre }}</p>
      <p><strong>Release Year:</strong> {{ song.releaseYear }}</p>
      <p><strong>Duration:</strong> {{ song.duration }}</p>
    </li>
  </ul>


</template>

<style>

</style>
