let valores = [8,9,4,2,7]

/*Cria um estrutura de repetição para não ter que ficar repetindo as chaves como
console.log(num[0])
console.log(num[1])
console.log(num[2])
etc

for(let pos=0; pos<num.length;pos++){
    console.log(num[pos])
}

*/ 

// ou pode ser usado o for in

//muito mais curto o código
for(var cont in valores){
    console.log(`A posição ${cont} tem o valor ${valores[cont]}`)
}