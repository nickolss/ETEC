function verificarChance() {
	let resiliencia = Number(document.querySelector("#resiliencia")).value;
	let inteligencia = Number(document.querySelector("#inteligencia")).value;
	let curso = Number(document.querySelector("#curso")).value;
	let faculdade = Number(document.querySelector("#faculdade")).value;

	let x = resiliencia + inteligencia;
	let y = curso + faculdade;

	if (x > y) {
		//...
	} else if (x < y) {
		var tamanhoChance = 0;
		var contador = x + 20;
		var limite = y - 20;
		for (contador; contador <= limite; contador += 20) {
			console.log(contador);
			tamanhoChance += 1;
		}
	}

	const resultados = {
		resiliencia,
		inteligencia,
		curso,
		faculdade,
	};
	
	console.log(resultados);

	//window.location.href = "http://127.0.0.1:5500/resultado.html";
}

let resiliencia = Number(document.querySelector("#resiliencia").value);
let inteligencia = Number(document.querySelector("#inteligencia").value);
let curso = Number(document.querySelector("#curso").value);
let faculdade = Number(document.querySelector("#faculdade").value);

const resultados = {
	resiliencia,
	inteligencia,
	curso,
	faculdade,
};

console.log(resultados);



// export const resultados = {
// 	resiliencia,
// 	inteligencia,
// 	curso,
// 	faculdade,
// };
