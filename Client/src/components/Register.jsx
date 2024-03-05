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

  return (
    <div>
      <div className="relative"  style={{ marginTop: '50px' }}>
        <Navbar/>
      </div>
      <h1>Welcome to our App!</h1>
      <p>Please enter a username and password.</p>
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