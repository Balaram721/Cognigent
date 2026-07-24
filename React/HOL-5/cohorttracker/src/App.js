import './App.css';
import { CohortsData } from './Cohort';
import CohortDetails from './CohortDetails';

function App() {
  return (
    <div className="page">
      <h1>Cohorts Details</h1>
      <div className="cohort-list">
        {CohortsData.slice(0, 3).map((cohort) => (
          <CohortDetails key={cohort.cohortCode} cohort={cohort} />
        ))}
      </div>
    </div>
  );
}

export default App;