# Processamento e otimização de consultas

## Custo de uma consulta 

- Tempo;
- Quantidade de leitura/gravação no BD;
- consulta = query = atualização/leitura

## Motivo para Análise

- Quanto mais leitura/gravações no BD para um mesmo comando SQL, mais degradação de perfomance existe;
- Existe a possibilidade de otimizar um mesmo comando SQL para reduzir o custo e gerar o mesmo resultado;


## Avaliação do custo

- Não está na responsabilidade do programador;
- Atividade do Administrador de banco de dados;


### Método 

Existe dois métodos, será falado mais profundamente mais tarde.
- Regras heurísticas;
- Dados históricos armazenamendos;


## Regras Heurísticas 

### Álgebra Relacional 

- Regra simples(sempre aplicáveis)
- Regra Básica (invenção, substituição)

- Serão aplicado pelo SGBD 
    - Linguagem declarativas transformadas em linguagem procedimentais;

### Exemplo 

Vamos supor que temo seguinte conjunto  

- A = {a, e, i, o, u}
- B = {1 , 2, 3}

A combinação dela resulta:

- C = {a1, a2, a3, e1, e2, e3, ..., u1, u2, u3}

Agora vamos supor que queremos fazer a operação Combinar A e B e depois selecionar somente que vogal "a":

- D = {a1, a2, a3}

Por outro, lado se nos inverter a ordem, quemos selecionar somente a vogal "a" e depois fazer a combinação, também vai dá o mesmo resultado.
Porém, com menor gasto.

## Dados Históricos 

- Dados de tabelas (volumes, variedade de dados etc)
- Dados de custos de consulta anteriores;
- frequência de uso de uma consulta etc ..

### Exemplo 
SQL:  consulta os nomes de todos os funcionários e o estado no qual nasceram 

**Dados obtidos e armazenados após a consulta para  uso  estático**

- Total de registro na tabela FUNCIONARIOS = 1300;
- Total de registro na tabela ESTADO = 27;
- Consulta executada =  muito frequentemente 

## Medidas

- Custo de acesso a disco 
- Tempo de CPU
- Custo de comunicação
- Tempo de avaliação;
- Custo de armazenamento temporário;

# Avaliação de Expressões

- Regras de álgebra relacional;
- Comandos SQL declarativos;
- Definição de estrátegia de acesso;


