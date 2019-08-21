export function renderElementPrototype(h, proto) {
    if (proto[0] === '#text') {
        return proto[1].domProps.textContent;
    } else {
        return h(proto[0], proto[1], proto[2].map(function (x) {
            return renderElementPrototype(h, x)
        }));
    }
}