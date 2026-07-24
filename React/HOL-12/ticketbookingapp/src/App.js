import React, { useState } from "react";
import Guest from "./components/Guest";
import User from "./components/User";
import Login from "./components/Login";
import Logout from "./components/Logout";
import "./App.css";

function App() {

    const [isLoggedIn, setIsLoggedIn] = useState(false);

    const login = () => {
        setIsLoggedIn(true);
    };

    const logout = () => {
        setIsLoggedIn(false);
    };

    return (
        <div className="container">

            {isLoggedIn ? (
                <>
                    <User />
                    <Logout logout={logout} />
                </>
            ) : (
                <>
                    <Guest />
                    <Login login={login} />
                </>
            )}

        </div>
    );
}

export default App;