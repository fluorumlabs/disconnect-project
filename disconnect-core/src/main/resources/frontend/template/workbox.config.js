export default {
    globDirectory: 'static/',
    globPatterns: [
        '**/*'
    ],
    globIgnores: ['sw.js', '**/*.map', '**/app.nomodule.js'],
    swSrc: 'jar_modules/disconnect-core-jar/frontend/template/src/sw.template.js',
    swDest: 'src/sw.js',
    modifyURLPrefix: {
        '': '/'
    }
};