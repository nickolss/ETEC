function contar() {
	var txtinic = document.getElementById("txtinic");
	var txtfim = document.getElementById("txtfim");
	var txtpasso = document.getElementById("txtpasso");

	var resp = document.getElementById("resp");

	if (
		txtinic.value.length == 0 ||
		txtfim.value.length == 0 ||
		txtpasso.value.length == 0
	) {
		window.alert("Faltam Dados");
		resp.innerHTML = "Impossível Contar!";
	} else {
		resp.innerHTML = "Contando: <br>";
		var inic = Number(txtinic.value);
		var fim = Number(txtfim.value);
		var passo = Number(txtpasso.value);

		if (passo <= 0) {
			window.alert("Impossível contar com passo 0. Convertendo para passo 1");
			passo = 1;
		}

		if (inic < fim) {
			//contagem crescente
			for (var c = inic; c <= fim; c += passo) {
				resp.innerHTML += ` ${c} \u{1F449}`;
			}
		} else if (fim < inic) {
			//contagem decrescente
			for (var c = inic; c >= fim; c -= passo) {
				resp.innerHTML += ` ${c} \u{1F449}`;
			}
		}

		resp.innerHTML += `\u{1F3C1}`;
	}
}
