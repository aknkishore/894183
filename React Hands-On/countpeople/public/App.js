import React, { Component } from 'react';
import Content from './content/Content';
import Persons from './persons/Persons';
import styles from './App.module.css';
class App extends Component {

  state = {
    persons: [
      { pid: 1, name: 'prasad', address: 'Tirupati' },
      { pid: 2, name: 'prasanth', address: 'Vellore' },
      { pid: 3, name: 'rohith', address: 'Hyderabad' },
    ],
    showPersons: false
  }
  togglePersonsHandler = () => {
    this.setState({
      showPersons: !this.state.showPersons
    });
  }
  deletePersonHandler = id => {
    const personIndex = this.state.persons.findIndex(person => person.pid === id);
    const localPersons = [...this.state.persons];
    localPersons.splice(personIndex, 1);
    this.setState({
      persons: localPersons
    });
  }
  render() {
    return (
      <div className={styles.App}>
        <Content click={this.togglePersonsHandler} />
        <Persons
          delete={this.deletePersonHandler}
          showPersons={this.state.showPersons}
          persons={this.state.persons} />
      </div>
    )
  }
}
export default App;