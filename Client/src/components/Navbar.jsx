import { Link } from "react-router-dom";
import React, { useState, useEffect, useRef } from "react";

const Navbar = () => {
  const [ active, setActive ] = useState("");
  const [ isOpen, setOpen ] = useState(false);
  const dropdownRef = useRef(null);

  const handleMouseEnter = (link) => {
    setActive(link);
  }

  const handleMouseLeave = () => {
    setActive('');
  }

  const toggleMenu = () => {
    setOpen(!isOpen);
  }

  useEffect(() => {
    const handleClickOutside = (event) => {
      if(dropdownRef.current && !dropdownRef.current.contains(event.target)) {
        setOpen(false);
      }
    };

    document.addEventListener('mousedown', handleClickOutside);

    return () => {
      document.removeEventListener('mousedown', handleClickOutside);
    }
  }, []);

  // put register in with the login page

  // put login button to the right most side
  // put notification as a bell icon to the left of the login button

  // have it be a navbar instead of a list
  // dashboard should be the main page
  // Patients and Medications should be hidden for users with "patient" role

  // import { AuthContext } from './AuthContext';
  //const { user } = useContext(AuthContext);
  // {user && user.role === 'admin' && <li><Link to="/admin">Admin Panel</Link></li>}
  return (
    <nav className={'flex items-center justify-between text-white fixed z-20'}>
      <ul className="flex list-none p-0">
        <li className="ml-12 mr-10 sm:ml-20 lg:ml-32">
          <Link 
            to="/"
            onMouseEnter = {() => handleMouseEnter("/")}
            onMouseLeave={handleMouseLeave}
            style={{ color: active === "/" ? "blue" : "black" }}
          >
            Dashboard
          </Link>
        </li>
        <li className="mr-10">
          <Link 
            to="/patients"
            onMouseEnter = {() => handleMouseEnter("patients")}
            onMouseLeave={handleMouseLeave}
            style={{ color: active === "patients" ? "blue" : "black" }}
          >
            Patients
          </Link>
        </li>
        <li className="mr-10">
          <Link 
            to="/medications"
            onMouseEnter = {() => handleMouseEnter("medications")}
            onMouseLeave={handleMouseLeave}
            style={{ color: active === "medications" ? "blue" : "black" }}
          >
            Medications
          </Link>
        </li>
        <li className="mr-10">
          <Link 
            to="/prescriptions"
            onMouseEnter = {() => handleMouseEnter("prescription")}
            onMouseLeave={handleMouseLeave}
            style={{ color: active === "prescription" ? "blue" : "black" }}
          >
            Prescriptions
          </Link>
        </li>
        <li className="mr-12 sm:mr-24 lg:mr-28">
          <Link 
            to="/notifications"
            onMouseEnter = {() => handleMouseEnter("notification")}
            onMouseLeave={handleMouseLeave}
            style={{ color: active === "notification" ? "blue" : "black" }}
          >
            Notifications
          </Link>
        </li>
      </ul>
      <div className="relative ml-16 sm:ml-32 lg:ml-64">
        <div className="relative w-10 h-10 overflow-hidden bg-gray-100 rounded-full dark:bg-gray-600" onClick={toggleMenu}>
          <svg className="absolute w-12 h-12 text-gray-400 -left-1" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg">
            <path fillRule="evenodd" d="M10 9a3 3 0 100-6 3 3 0 000 6zm-7 9a7 7 0 1114 0H3z" clipRule="evenodd"></path>
          </svg>
        </div>

        {/* Dropdown menu */}
        {isOpen && (
          <div ref={dropdownRef} id="userDropdown" className=" dropdown-menu z-10 bg-white divide-y divide-gray-100 rounded-lg shadow w-44 dark:bg-gray-700 dark:divide-gray-600">
            <div className="px-4 py-3 text-sm text-gray-900 dark:text-white">
              <div>Bonnie Green</div>
              <div className="font-medium truncate">name@flowbite.com</div>
            </div>
            <ul className="py-2 text-sm text-gray-700 dark:text-gray-200" aria-labelledby="avatarButton">
              <li>
                <a href="#" className="block px-4 py-2 hover:bg-gray-100 dark:hover:bg-gray-600 dark:hover:text-white">Dashboard</a>
              </li>
              <li>
                <a href="#" className="block px-4 py-2 hover:bg-gray-100 dark:hover:bg-gray-600 dark:hover:text-white">Settings</a>
              </li>
              <li>
                <a href="#" className="block px-4 py-2 hover:bg-gray-100 dark:hover:bg-gray-600 dark:hover:text-white">Earnings</a>
              </li>
            </ul>
            <div className="py-1">
              <a href="#" className="block px-4 py-2 text-sm text-gray-700 hover:bg-gray-100 dark:hover:bg-gray-600 dark:text-gray-200 dark:hover:text-white">Sign out</a>
            </div>
          </div>
        )}
      </div>
    </nav>
  );
}

export default Navbar