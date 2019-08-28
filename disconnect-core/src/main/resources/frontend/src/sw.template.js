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

workbox.routing.registerNavigationRoute('/static/index.html');

// the following line will be replaced by workbox-cli
workbox.precaching.precacheAndRoute([]);

registerRoutes(workbox);