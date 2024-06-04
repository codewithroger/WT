
import React, { useState } from 'react';
import ItemList from './components/ItemList';
import './App.css';

function App() {
    const [items, setItems] = useState([]);
    const [inputValue, setInputValue] = useState('');

    const handleAddItem = () => {
        if (inputValue.trim() !== '') {
            setItems([...items, inputValue.trim()]);
            setInputValue('');
        }
    };

    const handleRemoveItem = (index) => {
        const newItems = items.filter((item, i) => i !== index);
        setItems(newItems);
    };

    return (
        <div className="App">
            <h1>Simple React TodoList App</h1>
            <div className="input-container">
                <input
                    type="text"
                    value={inputValue}
                    onChange={(e) => setInputValue(e.target.value)}
                    placeholder="Add a new item"
                />
                <button onClick={handleAddItem}>Add</button>
            </div>
            <ItemList items={items} onRemoveItem={handleRemoveItem} />
        </div>
    );
}

export default App;
