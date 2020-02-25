# Disconnect Project

_Disclaimer: this is work in progress_

## What?

**Disconnect** is a _framework_ to write offline-first mobile-ready applications 
in a pure Java. No GWT involved.

## Why?

Being a Java veteran, I was always looking for a way to build web-apps with Java. 
There are several UI frameworks out there, but they either use outdated technology,
or simply do not allow to create offline-first application without JavaScript.

## How?

At the heart of Disconnect lies [TeaVM](http://teavm.org/) -- ahead-of-time JVM
byte-code to JavaScript transpiler. (Well, it also does C and WASM, but that's out of scope
of this project). The most powerful features of TeaVM are metaprogramming helpers
(that allows you to emulate reflection without actual reflection) and class 
transformers, which provide a way to manipulate byte-code before transpilation. 
I use both.

_Again: this is still work in progress, the API and implementation is changing frequently,
so some of the details below might be out of sync with the reality._

## Roadmap

- Test framework integration
- Web workers authoring
- Proper documentation
- Routing
- Spring security integration
- Encrypted RPC (for the one who cares of security)
- Sky is the limit