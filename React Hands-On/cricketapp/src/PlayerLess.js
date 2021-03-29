import React, { Component } from 'react';
import PLAYERS from './data/players';
class  Player extends Component{
    render(){
        const{name,score}=this.props.player;
    return(
        <span>
            <li>{name} {score}</li>
        </span>
    )
    }
    
}
class PlayerLess extends Component{
    render(){
        return(
            <div>
                  <h2>Players List</h2>
                    <div>{
                       PLAYERS.map(PLAYER =>{
                           if(PLAYER.score<=70){
                    return(
                        <Player key={PLAYER.id} player={PLAYER} />
                    );
                           }
                       }
                       )
                    }
                    </div>

                
            
            </div>
        );
    }
}
export default PlayerLess;