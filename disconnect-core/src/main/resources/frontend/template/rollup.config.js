import {terser} from 'rollup-plugin-terser';
import replace from 'rollup-plugin-replace';
import postcss from 'rollup-plugin-postcss';
import postcsscopy from 'postcss-copy';
import postcssimport from 'postcss-import';
import resolve from 'rollup-plugin-node-resolve';
import commonjs from 'rollup-plugin-commonjs';
import workbox from 'rollup-plugin-workbox-build';
import inject from '@rollup/plugin-inject';
import sourcemaps from 'rollup-plugin-sourcemaps';
import {readFileSync} from 'fs';
import path from 'path';
import workboxConfig from './workbox.config.js';

// Read build config
const buildConfigContent = readFileSync('./build.config.js', {encoding: 'utf8'});
const buildConfig = JSON.parse(buildConfigContent);

const jarModulesResolver = resolve({
    customResolveOptions: {
        moduleDirectory: ['node_modules', 'jar_modules']
    }
});

const commonJsOptions = {
    include: ['node_modules/**'],
    //namedExports: namedExports
};

const isProductionBuild = process.env.NODE_ENV === 'production';
const isLiveBuild = process.env.NODE_ENV === 'live';

function replaceSettings(mode) {
    return {
        'process.env.NODE_ENV': JSON.stringify(mode),
    }
};

function postCss() {
    return postcss({
        modules: true,
        use: [
            ['sass', {
                includePaths: [path.resolve('node_modules')]
            }]
        ],
        minimize: isProductionBuild,
        extract: 'static/bin/app.css',
        plugins: [
            postcssimport(),
            postcsscopy({
                basePath: ['src', 'node_modules', 'jar_modules'],
                template: '[name]-[hash].[ext][query]',
                dest: 'static/bin'
            })
        ]
    })
}

const defaultPlugins = [
    jarModulesResolver,
    replace(replaceSettings(process.env.NODE_ENV)),
    inject(buildConfig.injectedSymbols || {}),
    postCss(),
    commonjs(commonJsOptions),
    sourcemaps(),
];

const config = [
    {
        context: 'window',
        input: isLiveBuild?'src/app.bootstrap.live.js':'src/app.bootstrap.js',
        output: {
            file: 'static/bin/app.js',
            format: 'esm',
            sourcemap: true
        },
        plugins: [
            ...defaultPlugins,
            isProductionBuild && terser(),
            buildConfig.enableWorkbox && !isLiveBuild && workbox({
                mode: 'injectManifest',
                options: workboxConfig
            }),
        ]
    }
];

if (buildConfig.enableWorkbox && !isLiveBuild) {
    config.push({
        input: 'src/sw.js',
        output: {
            file: 'static/sw.js',
            format: 'esm',
            sourcemap: true,
            plugins: [
                isProductionBuild && terser()
            ]
        },
        plugins: [
            replace(replaceSettings("development")),
            jarModulesResolver,
            commonjs(commonJsOptions),
        ]
    });

}

export default config;
