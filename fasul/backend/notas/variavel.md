# O que é variável?

Variáveis são locais na memória do computador onde podemos armazenar valores para serem usados em nossos programas


# Nome de Variável 

Não é permitido declarar nomes de variáveis iniciando com números, espaços e/ou caracteres especiais, e só podem ter seus identificadores iniciados por caracteres minúsculos. Por exemplo:
-  Identificadores corretos: nome, pessoaJuridica, carro, veiculo, produto, jogador, cliente.
-  Identificadores incorretos: $nome, pessoa Júridica, auto-móveis, caminhão, 20base

## Convenção de nome de variável 

Utilizamos  o camelCase tem a primeira palavra iniciada em minúsculo, e se o identificador possuir um nome composto, este inicia em maiúsculo, e assim sucessivamente. Exemplos de identificadores em camelCase: contaCorrente, notaFiscal, veiculoCliente.


## Palavras reservadas e palavras chaves

São palavras js "pega para ela", que já existe um significado e que você não pode utilizar como variável 

## Diferença entre let e var

- let: é local 
- var: é global 


Outra diferença é o caso de hoisting
~~~ js
        console.log(algo)
        var algo = "que estranho não deu erro"

        console.log(vai)
        let vai = "da erro"
~~~

## Constante

~~~js
const diaSemana = {“seg”, “ter”, “qua”, “qui”, “sex”,
“sab”, “dom”}
~~~

