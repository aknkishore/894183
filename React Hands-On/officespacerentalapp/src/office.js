import React,{ Component } from "react";
import officeimg from './img1.jpg';

class office extends Component{
 item={Name :"DBS",Rent:500000,Address:'chennai',colors:''}
  
 
    render(){
        console.log(typeof(item));
    return(
        <div>
            
           
            <h1>Office Space, at Affordable Range</h1>
            <img src={officeimg} width="300" height="200" ></img>
            <h1>Name :{this.item.Name}</h1>
            <h3 >Rent : {this.item.Rent}</h3>
            <h3>Address :{this.item.Address}</h3>
        </div>
    )
}
}
//render(<office />,document.getElementById('root'));

export default office;
