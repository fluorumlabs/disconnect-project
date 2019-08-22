import {terser} from 'rollup-plugin-terser';
import babel from 'rollup-plugin-babel';
import ignore from 'rollup-plugin-ignore';
import replace from 'rollup-plugin-replace';
import resolve from 'rollup-plugin-node-resolve';
import commonjs from 'rollup-plugin-commonjs';
import {readFileSync} from 'fs';

import enableWebComponents from './build.config.js';

const importEs5Adapter = '@webcomponents/webcomponentsjs/custom-elements-es5-adapter.js';
const importWebComponents = '@webcomponents/webcomponentsjs/webcomponents-bundle.js';

const es5IgnoreSettings = enableWebComponents ? [] : [importEs5Adapter, importWebComponents];
const es6IgnoreSettings = enableWebComponents ? [importEs5Adapter] : [importEs5Adapter, importWebComponents];

function replaceSettings(mode) {
    return {
        'process.env.NODE_ENV': JSON.stringify(mode),
        'import_teavm_classes_js': readFileSync('./teavm/classes.js', {encoding: 'utf8'})
    }
};

const developmentEs6Build= [
    ignore(es6IgnoreSettings),
    replace(replaceSettings("development")),
    resolve(),
    commonjs()
];

const productionEs5Build = [
    ignore(es5IgnoreSettings),
    replace(replaceSettings("production")),
    resolve(),
    commonjs(),
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
    ignore(es6IgnoreSettings),
    replace(replaceSettings("production")),
    resolve(),
    commonjs(),
    terser()
];

let config = [];

if (process.env.NODE_ENV==='production') {
    config.push({
        input: 'src/app.js',
        output: {
            file: 'js/app.js',
            format: 'esm',
            sourceMap: 'inline'
        },
        plugins: productionEs6Build
    });
    config.push({
        input: 'src/app.js',
        output: {
            file: 'js/app.nomodule.js',
            format: 'iife',
            sourceMap: 'inline'
        },
        plugins: productionEs5Build
    });
} else {
    config.push({
        input: 'src/app.js',
        output: {
            file: 'js/app.js',
            format: 'esm',
            sourceMap: 'inline'
        },
        plugins: developmentEs6Build
    });
}

export default config;