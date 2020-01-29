export default function registerRPCStrategy(workbox, method, path, strategy, expirationConfig, bgSyncConfig) {
    let plugins = [];

    plugins.push(new workbox.cacheableResponse.Plugin({
        statuses: [200]
    }));

    if (expirationConfig) {
        plugins.push(new workbox.expiration.Plugin(expirationConfig));
    }

    if (bgSyncConfig) {
        plugins.push(new workbox.backgroundSync.Plugin(bgSyncConfig.queueName, bgSyncConfig));
    }

    workbox.routing.registerRoute(
        new RegExp(path+'.*'),
        new strategy({
            cacheName: 'rpc-cache',
            plugins: plugins
        }),
        method
    );
}