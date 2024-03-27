import { useState } from 'react';
import './Register.css';
import Navbar from './Navbar';

const Register = () => {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');

  function handleSignUp() {
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
// remove the navbar after testing
// should only come here when the user is signed out
  return (
    <div>
      <div className="w-full flex justify-center items-center mt-16">
        <Navbar/>
      </div>
      <h1 className="mt-12">Welcome to our App!</h1>
      <p className="mt-8">Please enter a username and password.</p>
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
      <input
      className='input'
        type="password"
        placeholder="confirm password"
        value={password}
        onChange={(e) => setPassword(e.target.value)}
      />
      <span>
      <span>
    I am a
  <label>
  <input
  className='input'
    type="radio"
    value='patient'
  />
  Patient
  </label>
  <label>
  <input
  className='input'
    type="radio"
    value='Doctor'
  />
  Doctor
  </label>
  <label>
  <input
  className='input'
    type="radio"
    value='Pharmacist'
  />
  Pharmacist
  </label>
  </span>
      </span>
      <button onClick={() => handleSignUp}>Sign Up</button>
    </div>
  );
}

export default Register