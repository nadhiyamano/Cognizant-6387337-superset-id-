import React from 'react';
import img from './img.jpg';
import img1 from './img1.jpg';
import img2 from './img2.jpg';

const offices = [
  {
    name: 'SpaceOne',
    rent: 55000,
    address: 'Mumbai',
    image: img
  },
  {
    name: 'WorkHub',
    rent: 75000,
    address: 'Bangalore',
    image: img1
  },
  {
    name: 'CozySpace',
    rent: 60000,
    address: 'Chennai',
    image: img2
  }
];

const App = () => {
  const heading = <h1 style={{ textAlign: 'center' }}>Office Space Rental Listings</h1>;

  return (
    <div>
      {heading}
      {offices.map((office, index) => (
        <div key={index} style={{ border: '1px solid #ccc', margin: '10px', padding: '10px' }}>
          <img src={office.image} alt={office.name} style={{ width: '150px' }} />
          <h2>{office.name}</h2>
          <p>Address: {office.address}</p>
          <p style={{ color: office.rent > 60000 ? 'green' : 'red' }}>
            Rent: ₹{office.rent}
          </p>
        </div>
      ))}
    </div>
  );
};

export default App;