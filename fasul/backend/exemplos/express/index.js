import express from "express"
import path from "path"
import {fileURLToPath} from 'url'

const __dirname = path.dirname(fileURLToPath(import.meta.url))

const app = express()

app.listen(3000, ()=>{
    console.log("servidor iniciado na porta 3000")
})

app.get("/", (req, res)=>{
    res.sendFile('public/index.html', {root: __dirname});
})

app.get("/ola",(req,res)=>{
    res.send("<p>Criado servidor com sucesso </p>")
})

app.get("/usuario/:nome", (req, res)=>{
    res.send("<h1>seu nome é "+ req.params.nome+"</h1>")
})

app.get(`/user2`, (req, res)=>{
    res.send(`<h1>Envio do usuario por GET</h1><a href="/view-usuario?nmUser=Joao">Enviar</a>`)
})

app.get('/view-usuario', (req, res) => {
    let nomeUsuario = req.query.nmUser
    res.send(`<h1>Usuario:${nomeUsuario}</h1>`)
})
