import React from 'react';

const Login = () => {
    return (
      <div>
        <h1>Welcome to our App!</h1>
        <p>Please sign in to continue.</p>
        <button onClick={handleSignIn}>Sign In</button>
      </div>
    );

    function handleSignIn() {
      alert('Sign In button clicked.');
    }
  };
  
  export default Login;
  
  