import Navbar from "./Navbar";

const Patients = () => {
    return (
      <div>
        <div className="w-full flex justify-center items-center mt-16">
          <Navbar/>
        </div>
        <h1 className="mt-12">Patients</h1>
        <p className="mt-8">This is the patients component.</p>
      </div>
    );
  };
  
  export default Patients;