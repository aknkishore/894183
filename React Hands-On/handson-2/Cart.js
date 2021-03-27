import React from 'react';
const Cart=props => {
    let items=props.item.map(item=>{
        return(
            <tr>
                <td>{item.itemname}</td>
                <td>{item.price}</td>
            </tr>
        )
    });
    return(
        <table border="1" className="item">
            <tr>
                <th>Name</th>
                <th>Price</th>
            </tr>
            {items}
        </table>
    )
}

export default Cart;