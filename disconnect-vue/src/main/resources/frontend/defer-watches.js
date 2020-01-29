var registrationQueue = {};
var instanceMap = {};

function enqueue(javaInstance, watchFn, actionFn, immediate) {
    registrationQueue[javaInstance] = registrationQueue[javaInstance] || [];
    registrationQueue[javaInstance].push({watch: watchFn, action: actionFn, immediate: immediate});
}

function register(javaInstance, vueInstance) {
    if (registrationQueue[javaInstance]) {
        registrationQueue[javaInstance].forEach((v) => {
            vueInstance.$watch(v.watch, v.action, {immediate: v.immediate});
        });
    }
    registrationQueue[javaInstance] = undefined;
}

export {enqueue, register};