import React, {useState, useEffect} from 'react';
import './App.css';

function App() {
    const [info, setInfo] = useState("");

    useEffect(() => {
        fetch('/api/serverinfo')
            .then(response => response.text())
            .then(text => setInfo(text));
    }, [])

    return (
        <div className="App">
            <h1>Server info</h1>
            <p>{info}</p>
        </div>
    )
}

export default App;