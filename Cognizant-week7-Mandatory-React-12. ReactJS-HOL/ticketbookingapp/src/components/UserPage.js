import React from 'react';

const UserPage = ({ onLogout }) => {
  return (
    <div>
      <h2>Welcome User</h2>
      <p>You can now book tickets!</p>
      <button onClick={onLogout}>Logout</button>
    </div>
  );
};

export default UserPage;