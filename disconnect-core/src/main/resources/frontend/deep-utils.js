function deepCopy(value) {
    if (value === null || value === undefined) {
        return null;
    } else if (typeof value === 'string' || value instanceof String
        || typeof value === 'number' || value instanceof Number
        || typeof value === 'boolean' || value instanceof Boolean) {
        return value;
    } else if (Array.isArray(value)) {
        return value.filter(v => typeof v !== 'function').map((v) => deepCopy(v));
    } else {
        let result = {};
        Object.keys(value).forEach((key) => {
            let fieldValue = value[key];
            if (fieldValue === null || fieldValue === undefined) {
                result[key] = null;
            } else if (typeof fieldValue === 'string' || fieldValue instanceof String
                || typeof fieldValue === 'number' || fieldValue instanceof Number
                || typeof fieldValue === 'boolean' || fieldValue instanceof Boolean) {
                result[key] = fieldValue;
            } else if (typeof fieldValue !== 'function') {
                result[key] = deepCopy(fieldValue);
            }
        });
        return result;
    }
}

function deepEquals(value1, value2) {
    if (value1 === null || value1 === undefined) {
        return (value2 === null || value2 === undefined);
    } else if (value2 === null || value2 === undefined) {
        return false;
    } else if (typeof value1 === 'string' || value1 instanceof String
        || typeof value1 === 'number' || value1 instanceof Number
        || typeof value1 === 'boolean' || value1 instanceof Boolean) {
        return value1 === value2;
    } else if (Array.isArray(value1)) {
        if (!Array.isArray(value2)) {
            return false;
        }
        if (value1.length !== value2.length) {
            return false;
        }
        return value1.filter(v => typeof v !== 'function').every((value, index) => value === value2[index]);
    } else {
        return Object.keys(value1).filter(key => typeof value1[key] !== 'function').every((key) => {
            let fieldValue1 = value1[key];
            let fieldValue2 = value2[key];
            if (fieldValue1 === null || fieldValue1 === undefined) {
                return (fieldValue2 === null || fieldValue2 === undefined);
            } else if (typeof fieldValue1 === 'string' || fieldValue1 instanceof String
                || typeof fieldValue1 === 'number' || fieldValue1 instanceof Number
                || typeof fieldValue1 === 'boolean' || fieldValue1 instanceof Boolean) {
                return fieldValue1 === fieldValue2;
            } else {
                return deepEquals(fieldValue1, fieldValue2);
            }
        });
    }
}

export {deepCopy, deepEquals}