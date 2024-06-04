import React from 'react';

function Item({ item, index, onRemoveItem }) {
    return (
        <li>
            {item}
            <button onClick={() => onRemoveItem(index)}>Delete</button>
        </li>
    );
}

export default Item;
