import React from 'react'

export default function createReactComponent(name, instantiator) {
    let C = class extends React.Component {
        constructor(props) {
            super(props);
            instantiator(this);
        }
    };

    // Set the class name
    Object.defineProperty (C, 'name', {value: name});

    return C;
}