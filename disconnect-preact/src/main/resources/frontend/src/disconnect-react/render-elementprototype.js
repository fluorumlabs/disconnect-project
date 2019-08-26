import React from "react"

export default function renderElementPrototype(proto) {
    if (proto[0] === '#text') {
        return proto[1].textContent;
    } else {
        return React.createElement(proto[0], proto[1], proto[2].map(function (x) {
            return renderElementPrototype(x)
        }));
    }
}