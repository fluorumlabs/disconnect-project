function cloneData(data) {
    return {
        ...(data.class !== undefined && {class: Object.assign({}, data.class)}),
        ...(data.style !== undefined && {style: Object.assign({}, data.style)}),
        ...(data.attrs !== undefined && {attrs: Object.assign({}, data.attrs)}),
        ...(data.props !== undefined && {props: Object.assign({}, data.props)}),
        ...(data.domProps !== undefined && {domProps: Object.assign({}, data.domProps)}),
        ...(data.on !== undefined && {on: Object.assign({}, data.on)}),
        ...(data.nativeOn !== undefined && {nativeOn: Object.assign({}, data.nativeOn)}),
        ...(data.directives !== undefined && {directives: [...data.directives]}),
        ...(data.slot !== undefined && {slot: data.slot}),
        ...(data.ref !== undefined && {ref: data.ref}),
        ...(data.key !== undefined && {key: data.key})
    };
}

export default function renderElementPrototype(h, proto) {
    if (proto.data && proto.data.beforeRender) {
        Object.keys(proto.data.beforeRender).forEach(function (key) {
            proto.data.beforeRender[key].call();
        })
    }
    if (proto.definition === '#text') {
        return proto.data.domProps.textContent;
    } else {
        return h(proto.definition, cloneData(proto.data), proto.children.filter(x => x !== null && x.data.visible).map(function (x) {
            return renderElementPrototype(h, x)
        }));
    }
}