import React from "react";
import officeImg from "./office.webp";
import "./App.css";

function App() {

  const offices = [
    {
      id: 1,
      name: "Tech Park",
      rent: 55000,
      address: "Hyderabad"
    },
    {
      id: 2,
      name: "Cyber Towers",
      rent: 75000,
      address: "Bangalore"
    },
    {
      id: 3,
      name: "Smart Workspace",
      rent: 45000,
      address: "Chennai"
    },
    {
      id: 4,
      name: "Business Hub",
      rent: 90000,
      address: "Pune"
    }
  ];

  return (
    <div className="container">

      <h1>Office Space Rental App</h1>

      <img
        src={officeImg}
        alt="Office"
        width="500"
        height="300"
      />

      <hr />

      {offices.map((office) => (

        <div key={office.id} className="card">

          <h2>{office.name}</h2>

          <p>
            <strong>Address:</strong> {office.address}
          </p>

          <p
            style={{
              color: office.rent < 60000 ? "red" : "green",
              fontWeight: "bold"
            }}
          >
            Rent : ₹{office.rent}
          </p>

        </div>

      ))}

    </div>
  );
}

export default App;