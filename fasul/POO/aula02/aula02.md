
## Tipos de variável 

### Primitiva 
- boolean: booleano (verdadeiro/falso): boolean.
- byte, short, int e long: inteiros.
- float e double: numéricos decimais.
- char: caracter; 


###  Não primitivos

-  String.
- Enumerações.
- Arrays.
-  Objeto 

## Tipo de tipagem 

Existe dois tipos  de tipagem 

###  Explicita

Na hora de declara dizemos tambem o tipo:

~~~java
int idade;
string nome = "Ricardo";
~~~

### Implícita 

Quando definimos o tipo da variável atraves do atributo, por outro lado, você é obrigado a indicar o valor, repare na palavra chave **var**

~~~
var idade = 35
var nome = "Ricardo" 
~~~

## Constante 

Para ser uma constante, ou seja, para uma variável assumir um valor e não puder mais alterar, usamos a palavra chave **final**


## Casting

Seria mudar o tipo de variável 

## Tipos literais

~~~java
var longNum = 12L; //Essa variável é do tipo long
var intNum = 1_250; //intNum vale 1250
var doze = 0xB; //B em hexadecimal equivale a 12 em decimal
var nove = 011; //11 em octal equivale a 9 em decimal
var floatNum = .5f; //O tipo é float e o valor 0.5
var doubleNum = 1_2___5.; //O tipo é double e o valor é 125.0
var onze = 0b1010; //1011 em binário equivale a 11 em decimal
~~~~