import './App.css';
import ArrayListiterator from './components/ArrayListiterator';
import BasicForm from './components/BasicForm';
import ShowhideFunctional from './components/ShowhideFunctional';

function App() {
  return (
    <div className='container'>
      <h1>Apache Camel && Kafka </h1>
      <BasicForm />
      <ArrayListiterator/>
      <ShowhideFunctional />
    </div>
  );
}

export default App;
