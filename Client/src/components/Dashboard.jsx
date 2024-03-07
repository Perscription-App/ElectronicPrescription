import Navbar from "./Navbar";

const Dashboard = () => {
  // prescription history
  // Scheduled appointments
  // action center (Messages about update in profile, new prescriptions etc.)
  return (
    <div>
      <div className="w-full flex justify-center items-center mt-16">
        <Navbar/>
      </div>
      <p className="mt-2">This is the dashboard component.</p>
    </div>
  );
}

export default Dashboard;

