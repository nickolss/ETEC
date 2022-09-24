function carregar() {
	var msg = document.getElementById("msg");
	var img = document.getElementById("imagem");
    
	var agora = new Date();
	var horaat = agora.getHours();
    
	msg.innerHTML = `Agora são ${horaat} horas`;

	if (horaat >= 0 && horaat < 12) {
		img.src = "img/manha.png";
        document.body.style.backgroundColor = '#fd9552'
	} else if (horaat >= 12 && horaat < 18) {
		img.src = "img/tarde.png";
        document.body.style.backgroundColor = '#b34026'
	} else {
		img.src = "img/noite.png";
        document.body.style.backgroundColor = '#342842'
	}
}
