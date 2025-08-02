import React from 'react';
import Counter from './components/Counter';
import WelcomeButton from './components/WelcomeButton';
import SyntheticEventExample from './components/SyntheticEventExample';
import CurrencyConvertor from './components/CurrencyConvertor';

function App() {
  return (
    <div style={{ padding: '20px' }}>
      <h1>React Event Handling Examples</h1>
      <Counter />
      <WelcomeButton />
      <SyntheticEventExample />
      <CurrencyConvertor />
    </div>
  );
}

export default App;