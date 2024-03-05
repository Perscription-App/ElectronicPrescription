import { Link } from "react-router-dom";

const Navbar = () => {
  // put register in with the login page

  // put login button to the right most side
  // put notification as a bell icon to the left of the login button

  // have it be a navbar instead of a list
  // dashboard should be the main page
  // Patients and Medications should be hidden for users with "patient" role
  return (
    <nav className={'w-full flex items-center text-white fixed z-20'}>
      <ul style={{ display: 'flex', listStyle: 'none', margin: 0, padding: 0 }}>
        <li style={{ marginRight: '10px' }}><Link to="/">Dashboard</Link></li>
        <li style={{ marginRight: '10px' }}><Link to="/patients">Patients</Link></li>
        <li style={{ marginRight: '10px' }}><Link to="/medications">Medications</Link></li>
        <li style={{ marginRight: '10px' }}><Link to="/prescriptions">Prescriptions</Link></li>
        <li style={{ marginRight: '10px' }}><Link to="/notifications">Notifications</Link></li>
        <li><Link to="/login">Login</Link></li>
      </ul>
    </nav>
  );
}

export default Navbar