let txtnum = document.getElementById("txtnum");
let lista = document.querySelector("select#tabe");
let resp = document.getElementById("resp");
let valores = [];

function isNumero(n) {
	if (Number(n) >= 1 && Number(n) <= 100) {
		return true;
	} else {
		return false;
	}
}

function isLista(n, lis) {
	if (lis.indexOf(Number(n)) != -1) {
		return true;
	} else {
		return false;
	}
}

function adicionar() {
	if (isNumero(txtnum.value) && !isLista(txtnum.value, valores)) {
        valores.push(Number(txtnum.value))
        var op = document.createElement("option")
        op.text = `Valor ${txtnum.value} adicionado`
        lista.appendChild(op)
        resp.innerHTML = ""
    } else {
		window.alert("Valor Inválido ou ja encontrado na lista");
	}
    txtnum.value = ""
    txtnum.focus()
}


function finalizar(){
    if(valores.length==0){
        window.alert('Adicione valores antes de finalizar')
    }else{
        var tot = valores.length
        var maior = valores[0]
        var menor = valores[0]
        var soma = 0
        var media = 0
        for (let pos in valores){
            soma += valores[pos]
            
            if(valores[pos] > maior){
                maior = valores[pos]
            }else if(valores[pos] < menor){
                menor = valores[pos]
            }
        }
        media = soma/tot
        resp.innerHTML = ''
        resp.innerHTML += `<p>Ao todo, temos ${tot} números cadastrados</p>`
        resp.innerHTML += `<p>O maior valor informado foi ${maior}</p>`
        resp.innerHTML += `<p>O menor valor informado foi ${menor}</p>`
        resp.innerHTML += `<p>Somando todos os valores temos ${soma}</p>`
        resp.innerHTML += `<p>A média dos valores é ${media}</p>`

    }

}