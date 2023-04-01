import React from "react";

import "../css/lista.css"
import Item from "./Item";

const Lista = () => {
    return (
        <div className="content">
            <h1>Nossos Produtos</h1>
            <div className="lista">
                <Item/>
                <Item/>
                <Item/>
                <Item/>
                <Item/>
                <Item/>
                <Item/>
                <Item/>
            </div>
        </div>
    )
}

export default Lista;