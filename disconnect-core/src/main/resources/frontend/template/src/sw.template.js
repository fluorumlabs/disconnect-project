import * as precaching from 'workbox-precaching';
import * as routing from 'workbox-routing';
import * as cacheableResponse from 'workbox-cacheable-response';
import * as strategies from 'workbox-strategies';
import * as expiration from 'workbox-expiration';
import * as backgroundSync from 'workbox-background-sync';

var workbox = {
    precaching,
    routing,
    strategies,
    cacheableResponse,
    expiration,
    backgroundSync
};

import registerRoutes from './sw.config.js';

// default page handler for offline usage,
// where the browser does not how to handle deep links
// it's a SPA, so each path that is a navigation should default to index.html
workbox.routing.registerRoute(
    ({ event }) => event.request.mode === 'navigate',
    async () => {
        const defaultBase = '/index.html';
        return caches
            .match(workbox.precaching.getCacheKeyForURL(defaultBase))
            .then(response => {
                return response || fetch(defaultBase);
            })
            .catch(err => {
                return fetch(defaultBase);
            });
    }
);

// the following line will be replaced by workbox-cli
workbox.precaching.precacheAndRoute([]);

registerRoutes(workbox);