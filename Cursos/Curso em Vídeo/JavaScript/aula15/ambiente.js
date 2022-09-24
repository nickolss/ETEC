var num = [5,8,4,7,2,6]

num.push(1) //adiciona um valor a ultima casa
num.sort() //coloca os elementos em ordem crescente

console.log(`O vetor tem ${num.length} posições`) //fala quantos elementos tem o array

console.log(`Os números são ${num}`) //mostra o vetor

var posi = num.indexOf(5)
console.log(`O número 5 está na posição ${posi}`)