import React, { useState } from "react";
import '../css/footer.css';
import axios from "axios";

const Footer = () => {
    const [nome, setNome] = useState("");
    const [tipo, setTipo] = useState("");
    const [desc, setDesc] = useState("");
    const [preco, setPreco] = useState();

    const handleSubmit = async () => {
        const produto = {
            "nome":nome,
            "tipo":tipo,
            "desc":desc,
            "preco":preco,
        };
        console.log(produto);

        try {
            const response = await axios.post('http://localhost:8080/api/produto',produto);
            console.log(response);
            window.location.reload(false);
        } catch (error) {
            console.log(error);
        }
    }

    return (
        <footer>
            <div className="footer">
                <h1>Adicione um Produto</h1>
                <label htmlFor="nome">Nome do produto:</label>
                <input type="text" name="nome" id="nome" onChange={({ target: { value } }) => setNome(value)} value={nome}/>
                <label htmlFor="tipo">Tipo do produto:</label>
                <select name="tipo" id="tipo" onChange={({ target: { value } }) => setTipo(value)} value={tipo}>
                    <option>selecione o tipo</option>
                    <option value="bermuda">bermuda</option>
                    <option value="bone">bone</option>
                    <option value="cachecol">cachecol</option>
                    <option value="calca_jeans">calca_jeans</option>
                    <option value="calca_moletom">calca_moletom</option>
                    <option value="camiseta">camiseta</option>
                    <option value="camisa">camisa</option>
                    <option value="casaco">casaco</option>
                    <option value="chinelo">chinelo</option>
                    <option value="cinto">cinto</option>
                    <option value="colete">colete</option>
                    <option value="gravata">gravata</option>
                    <option value="meia">meia</option>
                    <option value="moletom">moletom</option>
                    <option value="regata">regata</option>
                    <option value="shorts">shorts</option>
                    <option value="sobretudo">sobretudo</option>
                    <option value="sueter">sueter</option>
                    <option value="tenis">tenis</option>
                    <option value="touca">touca</option>
                </select>
                <label htmlFor="desc">Descrição do produto:</label>
                <textarea id="desc" name="desc" rows={5} cols={33} onChange={({ target: { value } }) => setDesc(value)} value={desc}/>
                <label htmlFor="preco">Preço do produto:</label>
                <input type="number" step="any" onChange={({ target: { value } }) => setPreco(value)} value={preco}/>
                <input type="button" value="Enviar" onClick={handleSubmit}/>
            </div>

        </footer>
    );
}

export default Footer;