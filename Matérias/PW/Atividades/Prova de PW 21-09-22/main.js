class Calculadora {
	somar(a, b) {
		return a + b;
	}

	subtrair(a, b) {
		return a - b;
	}

	multiplicar(a, b) {
		return a * b;
	}

	dividir(a, b) {
		return a / b;
	}
}

//Variaveis
let minhacalc = new Calculadora();

//Functions das operações
function somarn() {
	let txtn1 = document.getElementById("txtn1");
	let txtn2 = document.getElementById("txtn2");
	let n1 = Number(txtn1.value);
	let n2 = Number(txtn2.value);
	let resp = document.getElementById("resp");
	let conta = minhacalc.somar(n1, n2);
	resp.innerHTML = `A soma entre ${n1} e ${n2} é igual a ${conta}`;
}

function subtrairn() {
	let txtn1 = document.getElementById("txtn1");
	let txtn2 = document.getElementById("txtn2");
	let n1 = Number(txtn1.value);
	let n2 = Number(txtn2.value);
	let resp = document.getElementById("resp");
	let conta = minhacalc.subtrair(n1, n2);
	resp.innerHTML = `A subtração entre ${n1} e ${n2} é igual a ${conta}`;
}

function multiplicarn() {
	let txtn1 = document.getElementById("txtn1");
	let txtn2 = document.getElementById("txtn2");
	let n1 = Number(txtn1.value);
	let n2 = Number(txtn2.value);
	let resp = document.getElementById("resp");
	let conta = minhacalc.multiplicar(n1, n2);
	resp.innerHTML = `A multiplicação entre ${n1} e ${n2} é igual a ${conta}`;
}

function dividirn() {
	let txtn1 = document.getElementById("txtn1");
	let txtn2 = document.getElementById("txtn2");
	let n1 = Number(txtn1.value);
	let n2 = Number(txtn2.value);
	let resp = document.getElementById("resp");
	let conta = minhacalc.dividir(n1, n2);
	resp.innerHTML = `A divisão entre ${n1} e ${n2} é igual a ${conta}`;
}

//functions de funções

function excluir() {
	let txtn1 = document.getElementById("txtn1");
	let txtn2 = document.getElementById("txtn2");
	let resp = document.getElementById("resp");

    txtn1.value = ""
    txtn2.value = ""
    resp.innerHTML = ""
}
