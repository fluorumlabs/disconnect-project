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
import {readFileSync} from 'fs';

import enableWebComponents from './build.config.js';
import workboxConfig from './workbox.config.js';

const importEs5Adapter = '@webcomponents/webcomponentsjs/custom-elements-es5-adapter.js';
const importWebComponents = '@webcomponents/webcomponentsjs/webcomponents-bundle.js';

const es5IgnoreSettings = enableWebComponents ? [] : [importEs5Adapter, importWebComponents];
const es6IgnoreSettings = enableWebComponents ? [importEs5Adapter] : [importEs5Adapter, importWebComponents];

const namedExports = {
    'node_modules/react/index.js': [
        'Component',
        'Children',
        'Fragment',
        'cloneElement',
        'createElement',
        'createContext',
        'PropTypes',
        'isValidElement',
        'useContext',
        'useState',
        'useCallback',
        'useRef',
        'useMemo',
        'useEffect',
        'useLayoutEffect',
        'useDebugValue',
        'memo',
        'forwardRef',
    ],
    'node_modules/react-is/index.js': [
        'isValidElementType',
        'ForwardRef'
    ],
    'node_modules/react-dom/index.js': [
        'findDOMNode'
    ],
    'node_modules/prop-types/index.js': [
        'element',
        'elementType',
        'func',
        'oneOfType',
        'oneOf',
        'node',
        'object',
        'string',
        'bool',
        'number',
        'instanceOf',
        'any',
        'arrayOf'
    ],
};

const commonJsOptions = {
    include: 'node_modules/**',
    namedExports: namedExports
};

function replaceSettings(mode) {
    return {
        'process.env.NODE_ENV': JSON.stringify(mode),
        'import_teavm_classes_js': readFileSync('./teavm/classes.js', {encoding: 'utf8'})
    }
};

const developmentEs6Build= [
    postcss({
        extract: 'static/bin/app.css',
        minimize: false,
        modules: true,
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
    })
];

const productionEs5Build = [
    postcss({
        extract: 'static/bin/app.css',
        minimize: true,
        modules: true,
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
        extract: 'static/bin/app.css',
        minimize: true,
        modules: true,
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
    })
];

let config = [];

if (process.env.NODE_ENV==='production') {
    config.push({
        input: 'src/app.js',
        output: {
            file: 'static/bin/app.js',
            format: 'esm',
            sourceMap: 'inline'
        },
        plugins: productionEs6Build
    });
    config.push({
        input: 'src/app.js',
        output: {
            file: 'static/bin/app.nomodule.js',
            format: 'iife',
            sourceMap: 'inline'
        },
        plugins: productionEs5Build
    });
    config.push({
        input: 'src/sw.js',
        output: {
            file: 'static/bin/sw.js',
            format: 'esm',
            sourceMap: 'inline'
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
            sourceMap: 'inline'
        },
        plugins: developmentEs6Build
    });
    config.push({
        input: 'src/sw.js',
        output: {
            file: 'static/bin/sw.js',
            format: 'esm',
            sourceMap: 'inline'
        },
        plugins: [
            replace(replaceSettings("development")),
            resolve(),
            commonjs()
        ]
    });
}

export default config;