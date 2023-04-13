class Util {
    var peso : Double = 0.0
    var altura : Double = 0.0
    var imc : Double = 0.0

    fun classificarIMC(){
        print("Digite seu peso: ")
        peso = readLine()?.toDouble()!!

        print("Digite sua altura: ")
        altura = readLine()?.toDouble()!!

        imc = peso / (altura*altura)

        if (imc < 18){
            print("Seu IMC é de magreza")
        }else if (imc >= 18 && imc <= 24.9){
            print("Seu IMC é saudável")
        }else if (imc >= 25 && imc <= 29.9){
            print("Seu IMC é sobrepeso")
        }else{
            print("Seu IMC é obesidade")
        }
    }
}