import React from 'react';
import '../Stylesheets/mystyle.css';

function CalculateScore(props) {
  const average = (props.total / props.goal).toFixed(2);
  return (
    <div className="score-box">
      <h2>Student Name: {props.name}</h2>
      <p>School: {props.school}</p>
      <p>Total Marks: {props.total}</p>
      <p>Goal: {props.goal}</p>
      <p className="average">Average Score: {average}</p>
    </div>
  );
}

export default CalculateScore;