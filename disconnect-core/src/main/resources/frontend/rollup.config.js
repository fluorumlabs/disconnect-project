import {terser} from 'rollup-plugin-terser';
import babel from 'rollup-plugin-babel';
import replace from 'rollup-plugin-replace';
import resolve from 'rollup-plugin-node-resolve';
import commonjs from 'rollup-plugin-commonjs';
import fs from 'fs';

export default {
    input: 'src/app.js',
    output: {
        file: 'js/app.js',
        format: 'iife'
    },
    plugins: [
        replace({
            'process.env.NODE_ENV': JSON.stringify('production'),
            'import_teavm_classes_js': fs.readFileSync('./teavm/classes.js', {encoding: 'utf8'})
        }),
        resolve(),
        commonjs(),
        babel(),
        terser()
    ]
}