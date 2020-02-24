var $rtd_wrapThread = {};

function $rtd_setThreadStarter(fn) {
    $rtd_wrapThread.fn = fn;
}

export {$rtd_wrapThread, $rtd_setThreadStarter};