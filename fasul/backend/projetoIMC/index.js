import express from 'express'
import path from 'path'
import { fileURLToPath } from 'url'


const app = express()

//Constante que armazena dinâmicamente o caminho padrão
const __dirname = path.dirname(fileURLToPath(import.meta.url))


app.get('/', (req , res) =>{
 res.sendFile('public/index.html', { root: __dirname });
})



app.get('/res-imc', (req , res) =>{
    //Campos do Formulário
    let peso = req.query.pesoUser
    let altura = req.query.alturaUser

    // Calculo 
    let imc = peso / (altura * altura)


    let pagina = '<div>'
    pagina += '<h1>VERIFIQUE SEU IMC</h1>'
    pagina += '<nav>'
    pagina += '<ul>'
    pagina += '<li><a href=”/”>Home</a></li>'
    pagina += '</ul>'
    pagina += '</nav>'
    pagina += '</div>'
    pagina += `<h1>O seu IMC é : ${imc}</h1>`
    res.send(pagina);

})


app.listen(8000,"localhost")