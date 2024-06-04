import React from 'react';
import Item from './Item';

function ItemList({ items, onRemoveItem }) {
    return (
        <ul>
            {items.map((item, index) => (
                <Item key={index} item={item} index={index} onRemoveItem={onRemoveItem} />
            ))}
        </ul>
    );
}

export default ItemList;
