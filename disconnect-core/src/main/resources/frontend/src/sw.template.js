importScripts("https://storage.googleapis.com/workbox-cdn/releases/3.6.3/workbox-sw.js");

workbox.precaching.suppressWarnings();
workbox.routing.registerNavigationRoute('/static/index.html');

// the following line will be replaced by workbox-cli
workbox.precaching.precacheAndRoute([]);