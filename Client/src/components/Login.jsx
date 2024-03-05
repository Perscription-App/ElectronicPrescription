import React, { useState } from 'react';
import './Login.css';
import { Link } from 'react-router-dom';
import Navbar from './Navbar';

const Login = () => {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');
/*
  const handleSignIn = () => {
    console.log("Signing in with: ", username, password);
  }

  const handleCreateAccount = () => {
    console.log("Creating account with: ", username, password);
  }*/
  return (
    <div>
      <div className="relative"  style={{ marginTop: '50px' }}>
        <Navbar/>
      </div>
      <h1>Login</h1>
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