const express = require("express")
const conn = require("./conexao")


const app = express ()
const port = 3000


// Rota
app.get("/", (req, res)=>{
    res.send('Bem vindo!')
})


// Escultando na porta 3000
app.listen(port,  () => console.log(`Conexao na porta:${port}`))