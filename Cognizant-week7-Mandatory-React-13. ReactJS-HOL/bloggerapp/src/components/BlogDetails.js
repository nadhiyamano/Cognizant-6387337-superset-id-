import React from 'react';

const BlogDetails = () => {
  const blogs = ['React Patterns', 'Hooks Deep Dive', 'Performance Tips'];

  return (
    <div>
      <h2>Blog Details</h2>
      <ul>
        {blogs.map((blog, index) => <li key={index}>{blog}</li>)}
      </ul>
    </div>
  );
};

export default BlogDetails;