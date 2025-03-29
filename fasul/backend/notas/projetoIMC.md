# Projeto IMC

Vamos criar o famoso Índice Massa Corporal (IMC)


~~~ js
npm istall express --save
~~~

Não esqueça de configurar
~~~json
{
  "dependencies": {
    "express": "^4.21.2"
  }, // adicione virgula
  "type":"module"  //adicione
}
~~~

Olhe [Projeto](../projetoIMC/index.js)

Daqui temos a parte interessante:

~~~js
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
~~~

Do [html](../projetoIMC/public/index.html), a parte mais interesante:

~~~html
        <form action="/res-imc">
            <fieldset>
                <legend>IMC</legend>
                <div>
                    <label>Peso</label>
                    <input type="number" name="pesoUser" placeholder="Peso">
                </div>
                <div>
                    <label>Altura</label>
                    <input type="number" name="alturaUser" placeholder="Altura">
                </div>
                <div>
                    <input type="submit"  value="PROCESSAR" > 
                </div>
            </fieldset> 
        </form>
~~~

