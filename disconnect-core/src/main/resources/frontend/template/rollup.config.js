import {terser} from 'rollup-plugin-terser';
import replace from 'rollup-plugin-replace';
import copy from 'rollup-plugin-copy'
import postcss from 'rollup-plugin-postcss';
import postcsscopy from 'postcss-copy';
import postcssimport from 'postcss-import';
import resolve from 'rollup-plugin-node-resolve';
import commonjs from 'rollup-plugin-commonjs';
import inject from '@rollup/plugin-inject';
import sourcemaps from 'rollup-plugin-sourcemaps';
import {readFileSync} from 'fs';
import path from 'path';

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

function postCss(compilationUnit) {
    return postcss({
        modules: true,
        use: [
            ['sass', {
                includePaths: [path.resolve('node_modules')]
            }]
        ],
        minimize: isProductionBuild,
        extract: `static/bin/${compilationUnit}.css`,
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

function defaultPlugins(compilationUnit, injectedSymbols) {
    return [
        jarModulesResolver,
        replace(replaceSettings(process.env.NODE_ENV)),
        inject(injectedSymbols || {}),
        postCss(compilationUnit),
        commonjs(commonJsOptions),
        sourcemaps(),
    ];
}

const compilationUnitConfigContent = readFileSync('./build.config.js', {encoding: 'utf8'});
const compilationUnitConfig = JSON.parse(compilationUnitConfigContent);

const config = [];

compilationUnitConfig.forEach(compilationUnit => {
// Read build config
    const buildConfigContent = readFileSync(`./${compilationUnit}/build.config.js`, {encoding: 'utf8'});
    const buildConfig = JSON.parse(buildConfigContent);

    config.push({
        context: 'window',
        input: (isLiveBuild && compilationUnit === 'app') ? `${compilationUnit}/bootstrap.live.js` : `${compilationUnit}/bootstrap.js`,
        output: {
            file: `static/bin/${compilationUnit}.js`,
            format: 'esm',
            sourcemap: true
        },
        plugins: [
            ...defaultPlugins(compilationUnit, buildConfig.injectedSymbols),
            isProductionBuild && terser(),
            copy({
                targets: [{ src: `${compilationUnit}/classes.js.teavmdbg`, dest: 'static/bin', rename: `${compilationUnit}.js.teavmdbg` }]
            }),
        ]
    })
});

export default config;
