import React, { useEffect, useState } from "react";
import axios from 'axios';

import "../css/lista.css"
import Item from "./Item";

const Lista = () => {

    const [items, setItems] = useState([]);

    const fetchData = async () => {
        try {
            const response = await axios.get("http://localhost:8080/api/produto");
            console.log(response.data);
            setItems(response.data);
        } catch (error) {
            console.log(error);
        }
    }

    useEffect(()=>{
        fetchData();
    }, []);
    

    return (
        <div className="content">
            <h1>Nossos Produtos</h1>
            <div className="lista">
                {items.map(item => (
                    <Item item={item} key={item.id} />
                ))}
            </div>
        </div>
    )
}

export default Lista;