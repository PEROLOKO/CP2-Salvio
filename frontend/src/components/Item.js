import React from "react";

import "../css/item.css";

import camiseta from "../img/camiseta.png"

const Item = () => {
    return (
        <div className="item">
            <img src={camiseta} />
            <h3>Item</h3>
            <h2>R$99,99</h2>
            <p>descrição</p>
        </div>
    )
}

export default Item;