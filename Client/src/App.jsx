import { useState } from "react";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import './App.css';
import Login from "./components/Login";
import Profile from "./components/Profile";
import Register from "./components/Register";
import Dashboard from './components/Dashboard';
import Patients from './components/Patients';
import Medications from './components/Medications';
import Notification from './components/Notifications';
import Prescriptions from './components/Prescriptions';


// import { api } from "./api";

const Home = () => {
  return <h1>Home</h1>;
};

const App = () => {
  const [user, setUser] = useState(null);

  // useEffect(() => {
  //   // Check if the user is logged in
  //   const isLoggedIn = async () => {
  //     const response = await api.get("users/me");
  //     if (response.status === 200) {
  //       setUser(response.data);
  //     }
  //   };

  //   isLoggedIn();
  // }, []);

  // if (!user) {
  //   // Redirect to the login page if the user is not logged in
  //   return <Login />;
  // }
// change the login to an icon once the user is logged in
  // in that icon, user can click on the icon to release a drop down menu
    // menu includes, profile and logout buttons

  // patients and medication will not be visible to users with role "patient"
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element = {<Dashboard />} />
        <Route path="/profile" element = {<Profile />} />
        <Route path="/register" element = {<Register />} />
        <Route path="/patients" element = {<Patients />} />
        <Route path="/medications" element = {<Medications />} />
        <Route path="/prescriptions" element = {<Prescriptions />} />
        <Route path="/notifications" element = {<Notification />} />
      </Routes>
    </BrowserRouter> 
  );
};

export default App;