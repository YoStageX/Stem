let currentAudio = document.getElementById('audio');
let nowPlaying = document.getElementById('now-playing');
let isPlaying = false;

function playSong(file, element) {
  currentAudio.src = file;
  currentAudio.play();
  nowPlaying.textContent = "Now Playing: " + element.querySelector("h4").textContent;
  isPlaying = true;
}

function togglePlay() {
  if (isPlaying) {
    currentAudio.pause();
    isPlaying = false;
  } else {
    currentAudio.play();
    isPlaying = true;
  }
}

function seekSong(input) {
  const seekTo = currentAudio.duration * (input.value / 100);
  currentAudio.currentTime = seekTo;
}

currentAudio.ontimeupdate = function () {
  const progress = document.getElementById('progress');
  progress.value = (currentAudio.currentTime / currentAudio.duration) * 100;
};