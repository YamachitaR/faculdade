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
