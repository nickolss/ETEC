let amigo = {nome:'Pedro', sexo:'Masculino', peso:58.4, engordar(p=0){
    console.log('Engordou')
    this.peso += p
}}

amigo.engordar(5)

console.log(`${amigo.nome} pesa ${amigo.peso}Kg`)
