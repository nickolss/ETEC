function fatorial (num){
    let fat = 1
    for (var cont=num; cont>1; cont--){
        fat *= cont
    }
    return fat
}

console.log(fatorial(5))