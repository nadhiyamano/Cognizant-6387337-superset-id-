
import React from 'react';
import styles from './CohortDetails.module.css';

const CohortDetails = () => {
  const cohorts = [
    { id: 1, name: 'React Basics', status: 'ongoing', batch: 'June 2025' },
    { id: 2, name: 'Spring Boot Advanced', status: 'completed', batch: 'May 2025' },
  ];

  return (
    <div>
      {cohorts.map((cohort) => (
        <div key={cohort.id} className={styles.box}>
          <h3 style={{ color: cohort.status === 'ongoing' ? 'green' : 'blue' }}>{cohort.name}</h3>
          <dl>
            <dt>Status</dt>
            <dd>{cohort.status}</dd>
            <dt>Batch</dt>
            <dd>{cohort.batch}</dd>
          </dl>
        </div>
      ))}
    </div>
  );
};

export default CohortDetails;
