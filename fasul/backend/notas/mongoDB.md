## Docker


~~~ bash
docker run -d --name mongodb -p 27017:27017 \
  -e MONGO_INITDB_ROOT_USERNAME=admin \
  -e MONGO_INITDB_ROOT_PASSWORD=secret \
  mongo
~~~





## Boas práticas

Antes de comerçamos a conectar o bando ao node, é bom ter em mente que: 

- Desacoplar a conexão: seria criar a conexão do banco em um script à a parte pois  dá mais controle e possibilidade de reutilização;
- Testar a conectividade: realizar um teste antes de incializar as atividade   



## Instale 

 ~~~
 npm install express 
 ~~~


o principal para conectar:
~~~
npm install mongodb
~~~

**Não vai precisa alterar** `package.json`, como nós estava fazendo no outros projetos:


Criaremos arquivo de `conexao.js`
~~~js
// Importa o MongoDB
const {MongoClient} = require("mongodb");

// URI: endereço do MongoDB
//const uri = "mongodb://admin:secret@localhost:27017/processos";
const uri = "mongodb://admin:secret@localhost:27017/?authSource=admin";

// MongoClient é um função que retorna um objeto
const cliente =  new MongoClient(uri);

// A função async/await é uma função que permite a execusão de uma função assicrona 
async function  run() {
    try {
        await cliente.connect();
        console.log("conectado ao MongoDb");
    } catch(err){
        console.log(err);
    }

}

run();

// Exporta o cliente para index.js
module.exports = cliente;
~~~

