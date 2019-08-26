export default {
    globDirectory: 'static/',
    globPatterns: [
        '**/*'
    ],
    globIgnores: ['sw.js'],
    swSrc: 'src/sw.template.js',
    swDest: 'src/sw.js',
    modifyURLPrefix: {
        '': '/static/'
    }
};