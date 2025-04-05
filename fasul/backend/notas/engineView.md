# Engine View - Handlebars 


 O **Handlebars** é um **template engine** — ou seja, uma ferramenta que ajuda a gerar **HTML dinamicamente** usando dados do seu backend.

---

### 🛠️ **O que o Handlebars faz?**
Ele permite escrever HTML com placeholders (marcadores) que são substituídos por dados na hora da renderização. Por exemplo:

```handlebars
<h1>Olá, {{nome}}!</h1>
```

Se você passar `{ nome: "Bruno" }`, o HTML final será:

```html
<h1>Olá, Bruno!</h1>
```

---

### 📦 **Como usar com Node.js (exemplo básico com Express)**

1. Instale o Handlebars:
```bash
npm install express express-handlebars
```

2. Estrutura correta de diretórios
Certifique-se de ter essa estrutura:

~~~
handlebars/
├── index.js
└── views/
    ├── home.handlebars
    └── layouts/
        └── main.handlebars
~~~

3. Conteúdo de exemplo para views/home.handlebars:

~~~ html
<h1>Olá, {{nome}}!</h1>
~~~


4. Conteúdo de exemplo para views/layouts/main.handlebars:

~~~html
<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <title>Exemplo Handlebars</title>
</head>
<body>
  {{{body}}}
</body>
</html>
~~~

5. E o seu index.js (em ES Module):


~~~js

import express from 'express';
import { engine } from 'express-handlebars';
import { dirname, join } from 'path';
import { fileURLToPath } from 'url';

const app = express();
const __dirname = dirname(fileURLToPath(import.meta.url));

app.engine('handlebars', engine());
app.set('view engine', 'handlebars');
app.set('views', join(__dirname, 'views'));

app.get('/', (req, res) => {
  res.render('home', { nome: 'Ricardo' });
});

app.listen(3000, () => {
  console.log('Servidor rodando em http://localhost:3000');
});
~~~

---

### 💡 Vantagens do Handlebars

- Fácil de aprender
- Separação entre lógica e visual (MVC)
- Compatível com front e backend (Node, ou diretamente no browser)

Se quiser um exemplo rodando ou comparação com outros template engines (tipo EJS ou Pug), posso te mostrar também.

# Continuando nosso projeto 

## Instale 

~~~
 npm install express-handlebars
~~~

~~~
npm install body-parser
~~~


## Organização

Coleque `conexao.js` no diretório `db`


