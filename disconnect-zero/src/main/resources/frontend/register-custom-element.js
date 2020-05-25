function registerCustomElement(tagName, constructorFn, connectedFn, disconnectedFn, adoptedFn, attributeChangedFn, attributeNames) {
    var clazz = class extends HTMLElement {
        constructor() {
            super();
            constructorFn(this);
        }

        static get observedAttributes() {
            return attributeNames;
        }

        connectedCallback() {
            connectedFn(this);
        }

        disconnectedCallback() {
            disconnectedFn(this);
        }

        adoptedCallback() {
            adoptedFn(this);
        }

        attributeChangedCallback(name, oldValue, newValue) {
            attributeChangedFn(this, name, oldValue, newValue);
        }
    };
    
    customElements.define(tagName, clazz);
}

export {registerCustomElement};