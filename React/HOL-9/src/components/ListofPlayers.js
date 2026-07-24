import React from "react";

function ListofPlayers() {

  const players = [
    { name: "Virat Kohli", score: 98 },
    { name: "Rohit Sharma", score: 85 },
    { name: "KL Rahul", score: 65 },
    { name: "Shubman Gill", score: 74 },
    { name: "Hardik Pandya", score: 69 },
    { name: "Ravindra Jadeja", score: 80 },
    { name: "R Ashwin", score: 55 },
    { name: "Mohammed Shami", score: 72 },
    { name: "Jasprit Bumrah", score: 60 },
    { name: "Mohammed Siraj", score: 77 },
    { name: "Kuldeep Yadav", score: 50 }
  ];

  const lowScorers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>List of Players</h2>

      <table border="1" cellPadding="8">
        <thead>
          <tr>
            <th>Player</th>
            <th>Score</th>
          </tr>
        </thead>

        <tbody>
          {players.map((player, index) => (
            <tr key={index}>
              <td>{player.name}</td>
              <td>{player.score}</td>
            </tr>
          ))}
        </tbody>
      </table>

      <h2>Players with Score Below 70</h2>

      <ul>
        {lowScorers.map((player, index) => (
          <li key={index}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>

    </div>
  );
}

export default ListofPlayers;