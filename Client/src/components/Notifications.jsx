import Navbar from "./Navbar";

const Notifications = () => {
  // notify users with role "patient" when there is a new prescription given
  // notify users when an appointment is upcoming
  // notify user if their profile was changed
  return (
    <div>
      <div className="w-full flex justify-center items-center mt-16">
        <Navbar/>
      </div>
      <h1 className="mt-12">Notifications</h1>
      <p className="mt-8">This is the notifications component.</p>
    </div>
  );
};

export default Notifications;