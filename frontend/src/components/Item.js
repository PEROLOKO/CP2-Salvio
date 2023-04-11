import React from "react";

import "../css/item.css";

import bermuda from "../img/bermuda.png";
import bone from "../img/bone.png";
import cachecol from "../img/cachecol.png";
import calca_jeans from "../img/calca_jeans.png";
import calca_moletom from "../img/calca_moletom.png";
import camiseta from "../img/camiseta.png";
import camisa from "../img/camisa.png";
import casaco from "../img/casaco.png";
import chinelo from "../img/chinelo.png";
import cinto from "../img/cinto.png";
import colete from "../img/colete.png";
import gravata from "../img/gravata.png";
import meia from "../img/meia.png";
import moletom from "../img/moletom.png";
import regata from "../img/regata.png";
import shorts from "../img/shorts.png";
import sobretudo from "../img/sobretudo.png";
import sueter from "../img/sueter.png";
import tenis from "../img/tenis.png";
import touca from "../img/touca.png";
import axios from "axios";

const Item = props => {
    const {item} = props;
    var img = null;

    switch(item.tipo) {
        case "bermuda":
            img = bermuda;
            break;
        case "bone":
            img = bone;
            break;
        case "cachecol":
            img = cachecol;
            break;
        case "calca_jeans":
            img = calca_jeans;
            break;
        case "calca_moletom":
            img = calca_moletom;
            break;
        case "camisa":
            img = camisa;
            break;
        case "camiseta":
            img = camiseta;
            break;
        case "casaco":
            img = casaco;
            break;
        case "chinelo":
            img = chinelo;
            break;
        case "cinto":
            img = cinto;
            break;
        case "colete":
            img = colete;
            break;
        case "gravata":
            img = gravata;
            break;
        case "meia":
            img = meia;
            break;
        case "moletom":
            img = moletom;
            break;
        case "regata":
            img = regata;
            break;
        case "shorts":
            img = shorts;
            break;
        case "sobretudo":
            img = sobretudo;
            break;
        case "sueter":
            img = sueter;
            break;
        case "tenis":
            img = tenis;
            break;
        case "touca":
            img = touca;
            break;
    }

    const handleDelete = async () => {
        console.log(item.id);
        try {
            const response = await axios.delete(`http://localhost:8080/api/produto/${item.id}`);
            console.log(response);
            window.location.reload(false);
        } catch (error) {
            console.log(error);
        }
    }

    return (
        <div className="item">
            <img src={img} />
            <h3>{item.nome}</h3>
            <h2>R${item.preco}</h2>
            <p>{item.desc}</p>
            <input type="button" value="delete" onClick={handleDelete}/>
        </div>
    )
}

export default Item;