import React from 'react';

const IndianPlayers = () => {
  const allPlayers = ['Virat', 'Rohit', 'Dhoni', 'Sachin', 'Kohli', 'Dravid', 'Yuvraj', 'Jadeja', 'Bumrah', 'Ashwin', 'Shami'];

  const oddPlayers = allPlayers.filter((_, index) => index % 2 !== 0);
  const evenPlayers = allPlayers.filter((_, index) => index % 2 === 0);

  const T20players = ['Hardik', 'Pant', 'Chahal'];
  const RanjiTrophyPlayers = ['Pujara', 'Karun', 'Saha'];

  const mergedPlayers = [...T20players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Odd Team Players</h2>
      <ul>{oddPlayers.map((player, index) => <li key={index}>{player}</li>)}</ul>
      <h2>Even Team Players</h2>
      <ul>{evenPlayers.map((player, index) => <li key={index}>{player}</li>)}</ul>
      <h2>Merged T20 and Ranji Trophy Players</h2>
      <ul>{mergedPlayers.map((player, index) => <li key={index}>{player}</li>)}</ul>
    </div>
  );
};

export default IndianPlayers;