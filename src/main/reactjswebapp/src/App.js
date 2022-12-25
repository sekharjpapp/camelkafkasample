import './App.css';
import ArrayListiterator from './components/ArrayListiterator';
import BasicForm from './components/BasicForm';
import CheckBoxDropDown from './components/CheckBoxDropDown';
import GetHome from './components/GetHome';
import MultipleCheckBox from './components/MultipleCheckBox';
import ShowhideFunctional from './components/ShowhideFunctional';
import Navbar from './Navbar';

function App() {
  return (
    <div className='container'>
      <Navbar />
      <BasicForm />
      <ArrayListiterator/>
      <ShowhideFunctional />
      <CheckBoxDropDown />
      <MultipleCheckBox />
      <GetHome />
    </div>
  );
}

export default App;
