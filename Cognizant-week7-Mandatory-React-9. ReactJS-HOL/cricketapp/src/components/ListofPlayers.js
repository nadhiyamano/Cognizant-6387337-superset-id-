import React from 'react';

const ListofPlayers = () => {
  const players = [
    { name: 'Virat', score: 80 },
    { name: 'Rohit', score: 65 },
    { name: 'Dhoni', score: 90 },
    { name: 'Sachin', score: 85 },
    { name: 'Kohli', score: 45 },
    { name: 'Dravid', score: 60 },
    { name: 'Yuvraj', score: 70 },
    { name: 'Jadeja', score: 75 },
    { name: 'Bumrah', score: 50 },
    { name: 'Ashwin', score: 35 },
    { name: 'Shami', score: 95 },
  ];

  const filteredPlayers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>
      <h2>Filtered Players (Score &lt; 70)</h2>
      <ul>
        {filteredPlayers.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;