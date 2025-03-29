
# Instalando 

~~~ bash 
npm  install express --save
~~~

~~~ bash 
npm  install cookie-parse --save
~~~

~~~ bash 
npm  install multer --save
~~~

## Importando 

Crie um arquivo `index.js` (na raiz)

adicione a seguinte linha 
~~~ js
import express from "express"
~~~
 
 Ao exercutar

~~~ bash 
node index.js
~~~
vai da erro de exportação, para resolver:

vá no `package.json`
~~~js
. . .
   "multer": "^1.4.5-lts.2"
  },  //adicionado 
  "type":"module" //adicionado 
}
~~~


## Criando nosso primeiro servidor

~~~js
import express from "express"


const app = express()

app.listen(3000, ()=>{
    console.log("servidor iniciado na porta 3000")

})

app.get("/ola",(req,res)=>{
    res.send("<p>Criado servidor com sucesso </p>")
})
~~~


## Rota dinamica

~~~js
app.get("/usuario/:nome", (req, res)=>{
    res.send("<h1>seu nome é "+ req.params.nome+"</h1>")
})
~~~

## Conseguindo enviar pelo Get
~~~js
app.get(`/user2`, (req, res)=>{
    res.send(`<h1>Envio do usuario por GET</h1><a href="/view-usuario?nmUser=Joao">Enviar</a>`)
})

app.get('/view-usuario', (req, res) => {
    let nomeUsuario = req.query.nmUser
    res.send(`<h1>Usuario:${nomeUsuario}</h1>`)
})
~~~