// Importnado a conexão com banco de dados
const conn = require("./db/conexao")
const express = require("express")

// Criando  o app com o express
const app = express ()

// Importando Hanslebars
const exphbs = require("express-handlebars") 

// Importnaod o body parses
const bodyparser = require("body-parser") 

// Criando uma variavel para o porta do servidor
const port = 3000

// Importando a Rota
const rotas  = require('./routes/rotas')

// Deixando a extensão do handlebars como .hbs para ficar mais amigavel 
app.engine("hbs", exphbs.engine({extname:".hbs" })) //add Faz com que em vez a extensão seja .handlebars =: .hubs

// Definindo qual Engine vamos utilizar 
app.set("view engine", "hbs")

// Executado as Rotas
app.use('/', rotas) 

// Criando uma variável para o caminho da pasta publica  utilizando  o dicionario do projeto 
app.use("/public", express.static(__dirname + "/public")) 


app.listen(port,  () => console.log(`Conexao na porta:${port}`))
