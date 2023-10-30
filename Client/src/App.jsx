import { useState, useEffect } from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import  Login  from "./components/Login";
import Dashboard from "./components/Dashboard";
import Patients from "./components/Patients";
import Medications from "./components/Medications";
import Prescriptions from "./components/Prescriptions";
import Notifications from "./components/Notifications";

// import { api } from "./api";

const Home = () => {
  <Login/>
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

  return (
    <Router>
      <Routes>
        <Route path="/" element={<Home />} />

        <Route path="/dashboard" element={<Dashboard />} />
        <Route path="/patients" element={<Patients />} />
        <Route path="/medications" element={<Medications />} />
        <Route path="/prescriptions" element={<Prescriptions />} />
        <Route path="/notifications" element={<Notifications />} />
      </Routes>
    </Router>
  );
};

export default App;
