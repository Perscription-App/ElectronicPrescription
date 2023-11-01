import React, { useState } from 'react';
import './Login.css';
import { Link } from 'react-router-dom';

const Login = () => {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');

  return (
    <div className="container">
      <h1>Welcome to our App!</h1>
      <p>Please sign in to continue.</p>
      <input
      className='input'
        type="text"
        placeholder="username"
        value={username}
        onChange={(e) => setUsername(e.target.value)}
      />
      <input
      className='input'
        type="password"
        placeholder="password"
        value={password}
        onChange={(e) => setPassword(e.target.value)}
      />
      <span>
      <button onClick={handleSignIn}>Sign In</button>
      <Link to="/register">or click here to register.</Link>
      </span>
    </div>
  );

  function handleSignIn() {
    fetch('/login', {
      method: 'POST',
      body: {
        username: username,
        password: password
      }
    })
    .then((response) => {
      if (response.status === 200) {
        alert("success");
      } else {
        alert(response.status);
      }
    })
    .catch((error) => {
      alert(error);
    })
  }
};
  
export default Login;
  
  