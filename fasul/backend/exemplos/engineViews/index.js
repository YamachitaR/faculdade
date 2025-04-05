// parte da configuração
const express = require("express")
const conn = require("./db/conexao")

// Adicionado nessa aula
const exphbs = require("express-handlebars") 
const bodyparser = require("body-parser") 

// Parte da requisição 
const app = express ()
const port = 3000

app.use("/public", express.static(__dirname + "/public")) //add



// Configurar o template  engine
app.engine("hbs", exphbs.engine({extname:".hbs" })) //add Faz com que em vez a extensão seja .handlebars =: .hubs
app.set("view engine", "hbs")


// Rota 1
app.get("/", (req, res)=>{
    res.render("home")
})

// Rota 2
app.get("/hi", (req, res)=>{
    res.render('hi')
})


app.listen(port,  () => console.log(`Conexao na porta:${port}`))
