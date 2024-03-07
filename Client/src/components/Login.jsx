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
  // This needs to be the first thing the user sees

  // When logged out you should come back to this screen

  // remove the navbar when finished testing
  return (
    <div className="flex">
      <div className="w-full flex justify-center items-center mt-16">
        <Navbar/>
      </div>
      <h1>Login</h1>
      <p>Please sign in to continue.</p>
      <div style={{ display: 'flex', flexDirection: 'column', gap: "10px" }}>
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
      </div>
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