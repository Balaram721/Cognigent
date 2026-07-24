import React from "react";

function IndianPlayers() {

  const team = [
    "Virat",
    "Rohit",
    "Gill",
    "Rahul",
    "Hardik",
    "Jadeja"
  ];

  const [p1, p2, p3, p4, p5, p6] = team;

  const oddPlayers = [p1, p3, p5];
  const evenPlayers = [p2, p4, p6];

  const T20players = [
    "Surya",
    "Tilak",
    "Rinku"
  ];

  const RanjiPlayers = [
    "Pujara",
    "Rahane",
    "Sarfaraz"
  ];

  const mergedPlayers = [...T20players, ...RanjiPlayers];

  return (
    <div>

      <h2>Odd Team Players</h2>

      <ul>
        {oddPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h2>Even Team Players</h2>

      <ul>
        {evenPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h2>Merged Players</h2>

      <ul>
        {mergedPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

    </div>
  );
}

export default IndianPlayers;