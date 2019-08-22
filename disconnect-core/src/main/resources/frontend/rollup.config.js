import {terser} from 'rollup-plugin-terser';
import babel from 'rollup-plugin-babel';
import ignore from 'rollup-plugin-ignore';
import replace from 'rollup-plugin-replace';
import resolve from 'rollup-plugin-node-resolve';
import commonjs from 'rollup-plugin-commonjs';
import fs from 'fs';

import enableWebComponents from './build.config.js';

const importEs5Adapter = '@webcomponents/webcomponentsjs/custom-elements-es5-adapter.js';
const importWebComponents = '@webcomponents/webcomponentsjs/webcomponents-bundle.js';

const developmentBuild= [
    ignore([importEs5Adapter, !enableWebComponents && importWebComponents]),
    replace({
        'process.env.NODE_ENV': JSON.stringify("development"),
        'import_teavm_classes_js': fs.readFileSync('./teavm/classes.js', {encoding: 'utf8'})
    }),
    resolve(),
    commonjs()
];

const es5Build = [
    ignore([!enableWebComponents && importEs5Adapter, !enableWebComponents && importWebComponents]),
    replace({
        'process.env.NODE_ENV': JSON.stringify("production"),
        'import_teavm_classes_js': fs.readFileSync('./teavm/classes.js', {encoding: 'utf8'})
    }),
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

const es6Build = [
    ignore([importEs5Adapter, !enableWebComponents && importWebComponents]),
    replace({
        'process.env.NODE_ENV': JSON.stringify("production"),
        'import_teavm_classes_js': fs.readFileSync('./teavm/classes.js', {encoding: 'utf8'})
    }),
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
        plugins: es6Build
    });
    config.push({
        input: 'src/app.js',
        output: {
            file: 'js/app.nomodule.js',
            format: 'iife',
            sourceMap: 'inline'
        },
        plugins: es5Build
    });
} else {
    config.push({
        input: 'src/app.js',
        output: {
            file: 'js/app.js',
            format: 'esm',
            sourceMap: 'inline'
        },
        plugins: developmentBuild
    });
}

export default config;