import React,{Component} from 'react';
import LoginController from './Controller/LoginController';
import './App.css';
class App extends Component{
   render(){
    return (
      <div className="App">
        <LoginController />
      </div>
    )
  }
}
export default App;