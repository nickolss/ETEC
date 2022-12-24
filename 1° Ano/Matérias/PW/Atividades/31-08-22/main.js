console.log("Meu main ja carregou")

class Carro{
    constructor (cor){
        this.cor = cor
    }

    acelerar(){
        console.log(`Carro ${this.cor} -> VRUMMMMMMMM`)
    }
}
var cV = new Carro("Vermelho")
var cA = new Carro("Azul")
cV.acelerar()
cA.acelerar()
console.log(cV)
