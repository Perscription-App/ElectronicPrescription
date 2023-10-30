import React, { useState } from 'react';

const Login = () => {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');

  return (
    <div>
      <h1>Welcome to our App!</h1>
      <p>Please sign in to continue.</p>
      <input
        type="text"
        placeholder="Username"
        value={username}
        onChange={(e) => setUsername(e.target.value)}
      />
      <input
        type="password"
        placeholder="Password"
        value={password}
        onChange={(e) => setPassword(e.target.value)}
      />
      <button onClick={handleSignIn}>Sign In</button>
    </div>
  );

  function handleSignIn() {
    fetch('/login', {
      method: 'POST',
      headers: {

      },
      body: 'username=${username}&password=${password}',
    })
    .then((response) => {
      if (response.status === 200) {
        alert("success");
      } else {
        alert("failed");
      }
    })
    .catch((error) => {
      alert(error);
    })
  }
};
  
export default Login;
  
  