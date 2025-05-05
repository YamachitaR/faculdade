const Convidado = require('../model/Convidado')


// POST - Criar um novo convidado 

static cadastrarPost(req, res){
    const name = req.body.name
    const age = req.body.age
    const email = req.body.email

    const convidado = new Convidado(name, age, email)

    convidado.save()

    res.redirect('/')
}

// Cadastrar 

static cadastrar(req, res){
    res.render('cadastra', )
}