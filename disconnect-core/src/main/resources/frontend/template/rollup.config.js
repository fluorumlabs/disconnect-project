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
import html from 'rollup-plugin-html';
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
const isTestBuild = process.env.NODE_ENV === 'test';
const artifactId = process.env.NODE_CURRENT_ARTIFACT || '-unknown-artifact-';
const buildId = process.env.NODE_BUILD_ID || '';

function artifactSubstitution() {
    const replacementSettings = {
        delimiters: ['', '']
    };
    replacementSettings[artifactId + '-jar/frontend'] = '..';
    return replace(replacementSettings);
}

function replaceSettings(mode) {
    return {
        'process.env.NODE_ENV': JSON.stringify(mode),
        '${DISCONNECT_BUILD_ID}': buildId
    }
};

function postCss(compilationUnit) {
    return postcss({
        modules: false,
        use: [
            ['sass', {
                includePaths: [path.resolve('node_modules')]
            }]
        ],
        minimize: isProductionBuild,
        extract: false,
        inject: false,
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
        html({
            include: '**/*.html',
            htmlMinifierOptions: {
                collapseWhitespace: isProductionBuild,
                collapseBooleanAttributes: isProductionBuild,
                conservativeCollapse: isProductionBuild
            }
        }),
        artifactSubstitution(),
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

    // Substitute current artifact
    for (let key in buildConfig.injectedSymbols) {
        if (buildConfig.injectedSymbols.hasOwnProperty(key)) {
            let ref = buildConfig.injectedSymbols[key];
            if (Array.isArray(ref)) {
                if (ref[0].startsWith(artifactId + '-jar/frontend')) {
                    buildConfig.injectedSymbols[key][0] = ref[0].replace(artifactId + '-jar/frontend', '..');
                }
            } else {
                if (ref.startsWith(artifactId + '-jar/frontend')) {
                    buildConfig.injectedSymbols[key] = ref.replace(artifactId + '-jar/frontend', '..');
                }
            }
        }
    }

    config.push({
        context: 'window',
        input: (isLiveBuild && compilationUnit === 'app') ? `${compilationUnit}/bootstrap.live.js` : `${compilationUnit}/bootstrap.js`,
        output: {
            file: `static/bin/${compilationUnit}${buildId}.js`,
            format: 'esm',
            sourcemap: true
        },
        plugins: [
            ...defaultPlugins(compilationUnit, buildConfig.injectedSymbols),
            isProductionBuild && terser(),
            copy({
                targets: [{
                    src: `${compilationUnit}/classes.js.teavmdbg`,
                    dest: 'static/bin',
                    rename: `${compilationUnit}${buildId}.js.teavmdbg`
                }]
            }),
        ]
    })
});

export default config;
