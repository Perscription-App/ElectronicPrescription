import Navbar from "./Navbar";

const Profile = () => {
  return (
    <div>
      <div className="w-full flex justify-center items-center mt-16">
        <Navbar/>
      </div>
      <h1 className="mt-12">Profile</h1>
      <p className="mt-8">This is the profile component.</p>
    </div>
  );
}

export default Profile;