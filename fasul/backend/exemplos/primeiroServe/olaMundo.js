var http = require("http")
//Criando um HTTP server e um escutador de request na porta 8000

http.createServer(function(request,response){
    /* Configurando o HEAD(cabeçalho) de response com um status HTTP
    e um MIME-TYPE(Tipo de conteúdo) */

    response.writeHead(200,{'-Type': 'text/plain'})
    //Mandando como response o body “Olá Mundo!”
    response.end('Olá mundo\n')
}).listen(8000, '127.0.0.1')
//Imprimindo no console do Node a URL de acesso da aplicação.
 console.log('Web server executando em http://127.0.0.1:8000/')