import React from "react";
import '../css/header.css'

import banner from "../img/banner.jpg";

const Header = () => {
    return(
        <header>
            <div className="banner">
                <img src={banner} />
                <h1>Style Exclusive</h1>
            </div>

        </header>
    );
}

export default Header;