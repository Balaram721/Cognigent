import React, { useState } from "react";
import CurrencyConvertor from "./components/CurrencyConverter";
import "./App.css";

function App() {

    const [count, setCount] = useState(0);

    function increment() {
        setCount(count + 1);
    }

    function decrement() {
        setCount(count - 1);
    }

    function sayHello() {
        alert("Hello! Have a Nice Day.");
    }

    function increase() {
        increment();
        sayHello();
    }

    function sayWelcome(message) {
        alert(message);
    }

    function onPress() {
        alert("I was clicked");
    }

    return (
        <div className="container">

            <h1>React Event Examples</h1>

            <h2>Counter : {count}</h2>

            <button onClick={increase}>
                Increment
            </button>

            <button onClick={decrement}>
                Decrement
            </button>

            <br /><br />

            <button onClick={() => sayWelcome("Welcome")}>
                Say Welcome
            </button>

            <br /><br />

            <button onClick={onPress}>
                OnPress
            </button>

            <hr />

            <CurrencyConvertor />

        </div>
    );
}

export default App;