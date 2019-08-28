import memoize from 'fast-memoize';

var $rtd_wrapThread;

function $rtd_setThreadStarter(fn) {
    $rtd_wrapThread = memoize(fn);
}

export {$rtd_wrapThread, $rtd_setThreadStarter};