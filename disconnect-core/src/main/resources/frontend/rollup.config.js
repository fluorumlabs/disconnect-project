import {terser} from 'rollup-plugin-terser';
import babel from 'rollup-plugin-babel';
import ignore from 'rollup-plugin-ignore';
import replace from 'rollup-plugin-replace';
import resolve from 'rollup-plugin-node-resolve';
import commonjs from 'rollup-plugin-commonjs';
import fs from 'fs';

export default {
    input: 'src/app.js',
    output: {
        file: 'js/app.js',
        format: 'iife',
        sourceMap: 'inline'
    },
    plugins: [
        ignore([process.env.NODE_ENV !== 'production-ie11' && '@webcomponents/webcomponentsjs/custom-elements-es5-adapter.js']),
        replace({
            'process.env.NODE_ENV': JSON.stringify(process.env.NODE_ENV),
            'import_teavm_classes_js': fs.readFileSync('./teavm/classes.js', {encoding: 'utf8'})
        }),
        resolve(),
        commonjs(),
        (process.env.NODE_ENV === 'production-ie11' && babel({
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
        })),
        (((process.env.NODE_ENV === 'production') || (process.env.NODE_ENV === 'production-ie11')) && terser())
    ]
}