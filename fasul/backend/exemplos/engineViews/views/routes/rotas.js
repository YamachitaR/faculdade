// Importando o Express
const express = require('express')

// Importando a Classe de Rotas
const  RoutesController = require('./RoutersController')

// Importando o Router objeto do express para rotas 
const router = express.Router()


// Criando Rotas
router.get('/', RoutesController.home)
router.get('/guest', RoutesController.guest)
router.get('/hi', RoutesController.hi)

module.exports = router