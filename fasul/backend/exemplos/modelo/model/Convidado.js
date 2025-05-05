const conn  = require("./db/conn")


class Convidado{
    constructor (name, age, email){
        this.nanme = name 
        this.age = age
        this.email  = email 
    }



    save(){
        const guest = conn.db().collection('convidados').insertOne({
            name: this.name, 
            age: this.age,
            email: this.email,
        })
        return guest
    }
}