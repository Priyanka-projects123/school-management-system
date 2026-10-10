// PWA Service Worker for Offline & Installability Support
const CACHE_NAME = 'school-app-v1';

self.addEventListener('install', (e) => {
  self.skipWaiting();
});

self.addEventListener('activate', (e) => {
  e.waitUntil(clients.claim());
});

self.addEventListener('fetch', (e) => {
  // Pass-through fetch for dynamic Spring Boot REST API and static UI
  e.respondWith(
    fetch(e.request).catch(() => caches.match(e.request))
  );
});
