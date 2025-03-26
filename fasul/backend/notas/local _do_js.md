
# referencia

Seria como inserir o javascript 

## Arquivo separado 
~~~html

    <script src="./js/script.js"></script>
~~~

## No memso local

~~~html
<script>
    var nome="Ricardo"
    console.log(nome)
</script>
~~~


# Local de carga

Depende do local onde javascript é inserido ele vai carregar mais rápido ou devagar do que html


## mais rapido  do que html
~~~ html
<head>
    <script src="./js/script.js"></script>
</head>
~~~

ou 
~~~ html
<head>
    <script>
    Codigo do js 
    </script>
</head>
~~~

## js  mais devagar do que html

~~~ html
<body>
    deixa no final 
    <script src="./js/script.js"></script>
</body>
~~~

ou 
~~~ html
<body>
    deixa no final 
    <script>
    Codigo do js 
    </script>
</body>
~~~

Pdemos utilizar **defer**


~~~ html
<head>
    <script defer src="./js/script.js"></script>
</head>
~~~


# Armazenamento dos arquvos javascript

é uma boa práticar chamar o diretório de `js` 

