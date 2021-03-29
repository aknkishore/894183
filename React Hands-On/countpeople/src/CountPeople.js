import React, { Component } from 'react'
import './CountPeople.css'
export default class CountPeople extends Component {
    state={
        entrycount:0,
        exitcount:0,
        c:0
    };
updateEntry=()=>{
    this.setState({
        entrycount:this.state.entrycount+1,
        c:this.state.c++
    });

}

updateExit=()=>{
    this.setState({
        exitcount:this.state.exitcount+1,
        c:this.state.c++
    });
}

    render() {
        return (
            <div className="people">
                <div>
                    <button onClick={this.updateEntry}>Login</button><span id="entrycount"> {this.state.entrycount} People Entered!!!</span>
                </div>
                <div>
                    <button onClick={this.updateExit}>Exit</button><span id="exitcount"> {this.state.exitcount} People Left!!!</span>
                </div>

            </div>
        )
    }
}

