import React from 'react';

const GuestPage = ({ onLogin }) => {
  return (
    <div>
      <h2>Welcome Guest</h2>
      <p>Flight details are available for viewing.</p>
      <button onClick={onLogin}>Login to Book Tickets</button>
    </div>
  );
};

export default GuestPage;