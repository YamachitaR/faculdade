module.exports =class RoutesController{
    
  


    // Rota 1
    static  home(req, res){
        res.render("home",{nomeView:"Sou valor que é passado no fooot"})
    }

    // Rota 2
    static hi (req, res){
        res.render('hi',{nomeView:"tchauuuuuu"} )
    }

    // Rota 3
    static guest (req, res){
        const user = {
            name: 'Joao',
            age: '20',
            email: 'joa@email.com',
            nomeView: 'View: guest.hbs'

        }
        res.render('guest',{user:user})
    }

}