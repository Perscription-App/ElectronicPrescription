import { Link } from "react-router-dom";

const Navbar = () => {
  return (
    <div className="container">
      <ul>
        <li><Link to="/login">Login</Link></li>
        <li><Link to="/register">Register</Link></li>
        <li><Link to="/dashboard">Dashboard</Link></li>
        <li><Link to="/patients">Patients</Link></li>
        <li><Link to="/medications">Medications</Link></li>
        <li><Link to="/prescriptions">Prescriptions</Link></li>
        <li><Link to="/notifications">Notifications</Link></li>
      </ul>
    </div>
  );
}

export default Navbar