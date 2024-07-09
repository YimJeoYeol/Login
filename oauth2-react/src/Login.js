import React from 'react';

function Login() {
    const handleLogin = () => {
        window.location.href = 'http://localhost:8989/oauth2/authorization/github';
    };

    return (
        <div>
            <h1>Login Page</h1>
            <button onClick={handleLogin}>Login with GitHub</button>
        </div>
    );
}

export default Login;
