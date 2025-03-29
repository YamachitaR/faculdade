**CommonJS** é um padrão de módulos para JavaScript, desenvolvido inicialmente para fornecer um sistema de modulação em ambientes fora do navegador, especialmente no **Node.js**. Antes da introdução dos módulos ES6 (ECMAScript Modules), o CommonJS era o padrão dominante para gerenciar módulos em JavaScript.

---

### **Principais Características do CommonJS:**

1. **Sistema de Módulos Sincrônico:**  
   - A importação de módulos no CommonJS é **sincrônica**, ou seja, os módulos são carregados na ordem em que aparecem no código. Isso funciona bem no **Node.js**, onde o código é executado no servidor e o carregamento de arquivos é rápido.  
   - No entanto, isso não é adequado para navegadores, que precisam carregar arquivos assíncrona e dinamicamente.

---

2. **Função `require`:**  
   - No CommonJS, você importa módulos usando a função **`require`**:
     ```javascript
     const fs = require('fs');  // Importa o módulo nativo de sistema de arquivos do Node.js
     const myModule = require('./meuModulo');  // Importa um módulo local
     ```

3. **Objeto `module.exports`:**  
   - Para exportar funcionalidades ou objetos de um módulo, você usa **`module.exports`**:
     ```javascript
     // Exemplo: Exportando uma função
     function soma(a, b) {
         return a + b;
     }

     module.exports = soma;
     ```

   - Em outro arquivo, você pode importar essa função usando `require`:
     ```javascript
     const soma = require('./soma');  
     console.log(soma(2, 3));  // Saída: 5
     ```

---

### **Exemplo Completo:**

**Arquivo `math.js`:**
```javascript
// Exportação de múltiplas funções
function soma(a, b) {
    return a + b;
}

function subtracao(a, b) {
    return a - b;
}

module.exports = { soma, subtracao };
```

**Arquivo `app.js`:**
```javascript
// Importando as funções do módulo math.js
const { soma, subtracao } = require('./math');

console.log(soma(10, 5));         // Saída: 15
console.log(subtracao(10, 5));    // Saída: 5
```

---

### **Por que CommonJS é Importante no Node.js?**
- **Node.js foi construído usando CommonJS** como sistema padrão de módulos.  
- A modularidade do CommonJS permitiu que os desenvolvedores pudessem dividir o código em arquivos menores e reutilizáveis.  
- **Módulos Nativos:** O Node.js possui módulos nativos que seguem o padrão CommonJS, como `fs`, `http`, e `path`.

---

### **Diferenças entre CommonJS e ES Modules (ESM):**

| **Aspecto**             | **CommonJS**                     | **ES Modules (ESM)**                |
|-------------------------|----------------------------------|-------------------------------------|
| **Importação**          | `const fs = require('fs');`      | `import fs from 'fs';`              |
| **Exportação**          | `module.exports = algo;`         | `export default algo;` ou `export`  |
| **Sincronia**           | Sincrônica                       | Assíncrona                          |
| **Suporte em Node.js**   | Padrão antes do ES6              | Padrão moderno (mas precisa de configuração específica em arquivos `.mjs` ou `type: "module"` no `package.json`) |

---

### **Quando Usar CommonJS ou ES Modules?**
- Se você estiver trabalhando com projetos legados ou módulos do Node.js que ainda não migraram para ES6, **CommonJS** ainda é muito relevante.
- Em projetos mais novos ou front-end moderno, é preferível usar **ES Modules**.

---

Se você precisar de ajuda com algum caso prático de CommonJS ou como configurá-lo em um projeto, posso detalhar mais!


## Exemplo 1

[exemplo](../exemplos/CommonJS/index.js) rode com `node index.js`

