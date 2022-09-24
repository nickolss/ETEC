function verificar() {
	var agora = new Date();
	var anoat = agora.getFullYear();

	var fano = document.getElementById("txtanonasc");
	var resp = document.getElementById("resp");

	if (fano.value.length == 0) {
		window.alert("Digite seu ano de nascimento!");
	} else if (fano.value > anoat) {
		window.alert("O ano de nascimento digitado é maior que o ano atual.");
	} else {
		var fsex = document.getElementsByName("radsex");
		var idade = anoat - Number(fano.value);
		var gen = "";
		var img = document.createElement("img");
		img.setAttribute("id", "foto");

		if (fsex[0].checked) {
			gen = "homem";
			if (idade >= 0 && idade < 10) {
				img.setAttribute("src", "img/criança menino.png");
			} else if (idade < 21) {
				img.setAttribute("src", "img/adolescente menino.png");
			} else if (idade < 50) {
				img.setAttribute("src", "img/adulto homem.png");
			} else {
				img.setAttribute("src", "img/idoso homem.png");
			}
		} else if (fsex[1]) {
			gen = "mulher";
			if (idade >= 0 && idade < 10) {
				img.setAttribute("src", "img/criança menina.png");
			} else if (idade < 21) {
				img.setAttribute("src", "img/adolescente menina.png");
			} else if (idade < 50) {
				img.setAttribute("src", "img/adulto mulher.png");
			} else {
				img.setAttribute("src", "img/idosa mulher.png");
			}
		}

		resp.style.textAlign = "center";
		resp.innerHTML = `Detectamos ${gen} com ${idade} anos.`;
		resp.appendChild(img);
	}
}
