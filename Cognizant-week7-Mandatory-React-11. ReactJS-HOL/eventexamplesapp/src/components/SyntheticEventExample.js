import React from 'react';

function SyntheticEventExample() {
  const handleClick = (event) => {
    alert("I was clicked");
    console.log(event); // Synthetic Event
  };

  return (
    <div>
      <button onClick={handleClick}>Synthetic Event Button</button>
    </div>
  );
}

export default SyntheticEventExample;