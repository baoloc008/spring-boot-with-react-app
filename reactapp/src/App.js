import React, {useState, useEffect} from 'react';
import './App.css';

function App() {
    const [info, setInfo] = useState({});

    useEffect(() => {
        fetch('/api/serverinfo')
            .then(response => response.json())
            .then(jsonResponse => setInfo(jsonResponse));
    }, [])

    return (
        <div className="App">
            <h1>Server info</h1>
            <p>Name: {info.name}</p>
            <p>Time: {info.time}</p>
            <p>Environment: {info.environment}</p>
        </div>
    )
}

export default App;