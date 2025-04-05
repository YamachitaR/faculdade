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
