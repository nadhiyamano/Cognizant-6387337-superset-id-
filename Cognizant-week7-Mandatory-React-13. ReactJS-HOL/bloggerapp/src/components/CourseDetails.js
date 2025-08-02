import React from 'react';

const CourseDetails = () => {
  const courses = ['React for Beginners', 'React and TypeScript', 'Testing React Apps'];

  return (
    <div>
      <h2>Course Details</h2>
      <ul>
        {courses.map((course, index) => <li key={index}>{course}</li>)}
      </ul>
    </div>
  );
};

export default CourseDetails;