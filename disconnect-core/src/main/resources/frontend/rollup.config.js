import {terser} from 'rollup-plugin-terser';
import babel from 'rollup-plugin-babel';
import ignore from 'rollup-plugin-ignore';
import replace from 'rollup-plugin-replace';
import postcss from 'rollup-plugin-postcss';
import postcsscopy from 'postcss-copy';
import postcssimport from 'postcss-import';
import resolve from 'rollup-plugin-node-resolve';
import commonjs from 'rollup-plugin-commonjs';
import workbox from 'rollup-plugin-workbox-build';
import visualizer from 'rollup-plugin-visualizer';
import sourcemaps from 'rollup-plugin-sourcemaps';
import {readFileSync, writeFileSync, existsSync} from 'fs';
import path from 'path';

import buildConfig from './build.config.js';
import workboxConfig from './workbox.config.js';

const importEs5Adapter = '@webcomponents/webcomponentsjs/custom-elements-es5-adapter.js';
const importWebComponents = '@webcomponents/webcomponentsjs/webcomponents-bundle.js';

const es5IgnoreSettings = buildConfig.enableWebComponents ? [] : [importEs5Adapter, importWebComponents];
const es6IgnoreSettings = buildConfig.enableWebComponents ? [importEs5Adapter] : [importEs5Adapter, importWebComponents];

// remove IIFE from classes.js
const content = readFileSync('./src/classes.js', {encoding: 'utf8'});

function whitespacify(str) {
    return ' '.repeat(str.length);
}

const mapExists = existsSync('./src/classes.js.map');

const expression = /^("use strict";\s*)(var [a-zA-Z0-9]+;)(\s*\(function\(\)\s*\{\s*)(.*)(\}\)\(\);\s*)$/sgm;
const result = expression.exec(content);
let processed = whitespacify(result[1])+result[2]+whitespacify(result[3])+result[4]+whitespacify(result[5])+'\nmain();';
if (mapExists) {
    processed = processed + '\n\n//# sourceMappingURL=classes.module.js.map';
}

writeFileSync('./src/classes.module.js', processed);

if (mapExists) {
    const mapContent = readFileSync('./src/classes.js.map', {encoding: 'utf8'});
    writeFileSync('./src/classes.module.js.map', mapContent
        .replace('"file":"classes.js"','"file":"classes.module.js"')
    );
}


const namedExports = {
};

const commonJsOptions = {
    include: 'node_modules/**',
    namedExports: namedExports
};

function replaceSettings(mode) {
    return {
        'process.env.NODE_ENV': JSON.stringify(mode)
    }
};

function visualizerSettings() {
    return visualizer({
        template: 'sunburst',
        bundlesRelative: false
    });
}

const developmentEs6Build= [
    postcss({
        use: [
            ['sass', {
                includePaths: [path.resolve('node_modules')]
            }]
        ],
        extract: 'static/bin/app.css',
        minimize: false,
        plugins: [
            postcssimport(),
            postcsscopy({
                basePath: ['src', 'node_modules'],
                template: '[path]/[name].[ext][query]',
                dest: 'static/bin'
            })
        ]
    }),
    ignore(es6IgnoreSettings),
    replace(replaceSettings("development")),
    resolve(),
    commonjs(commonJsOptions),
    workbox({
        mode: 'injectManifest',
        options: workboxConfig
    }),
    sourcemaps(),
    visualizerSettings(),
];

const productionEs5Build = [
    postcss({
        use: [
            ['sass', {
                includePaths: [path.resolve('node_modules')]
            }]
        ],
        extract: 'static/bin/app.css',
        minimize: true,
        plugins: [
            postcssimport(),
            postcsscopy({
                basePath: ['src', 'node_modules'],
                template: '[path]/[name].[ext][query]',
                dest: 'static/bin'
            })
        ]
    }),
    ignore(es5IgnoreSettings),
    replace(replaceSettings("production")),
    resolve(),
    commonjs(commonJsOptions),
    babel({
        exclude: ['node_modules/@babel/**', 'node_modules/core-js/**'],
        extensions: ['.js', '.mjs', '.html'],
        presets: [
            [
                '@babel/preset-env',
                {
                    useBuiltIns: 'usage',
                    corejs: 3,
                    targets: 'ie 11'
                }
            ]
        ],
    }),
    terser()
];

const productionEs6Build = [
    postcss({
        use: [
            ['sass', {
                includePaths: [path.resolve('node_modules')]
            }]
        ],
        extract: 'static/bin/app.css',
        minimize: true,
        plugins: [
            postcssimport(),
            postcsscopy({
                basePath: ['src', 'node_modules'],
                template: '[path]/[name].[ext][query]',
                dest: 'static/bin'
            })
        ]
    }),
    ignore(es6IgnoreSettings),
    replace(replaceSettings("production")),
    resolve(),
    commonjs(commonJsOptions),
    terser(),
    workbox({
        mode: 'injectManifest',
        options: workboxConfig
    }),
    visualizerSettings(),
];

let config = [];

if (process.env.NODE_ENV==='production') {
    config.push({
        input: 'src/app.js',
        output: {
            file: 'static/bin/app.js',
            format: 'esm',
        },
        plugins: productionEs6Build,
        context: 'window'
    });
    config.push({
        input: 'src/app.js',
        output: {
            file: 'static/bin/app.nomodule.js',
            format: 'iife',
        },
        plugins: productionEs5Build,
        context: 'window'
    });
    config.push({
        input: 'src/sw.js',
        output: {
            file: 'static/bin/sw.js',
            format: 'esm',
        },
        plugins: [
            replace(replaceSettings("production")),
            resolve(),
            commonjs(),
            terser()
        ]
    });
} else {
    config.push({
        input: 'src/app.js',
        output: {
            file: 'static/bin/app.js',
            format: 'esm',
            sourcemap: 'inline'
        },
        plugins: developmentEs6Build,
        context: 'window'
    });
    config.push({
        input: 'src/sw.js',
        output: {
            file: 'static/bin/sw.js',
            format: 'esm',
            sourcemap: 'inline'
        },
        plugins: [
            replace(replaceSettings("development")),
            resolve(),
            commonjs()
        ]
    });
}

export default config;