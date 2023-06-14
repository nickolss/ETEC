class Util {
    var nome : String = ""
    var idade : Int = 0
    var diasVividos : Int = 0

    private fun receberDados(){
        print("Digite seu nome: ")
        nome = readLine()?.toString()!!

        print("Digite sua idade: ")
        idade = readLine()?.toInt()!!
    }

    fun calcularDias(){
        receberDados()

        diasVividos = idade * 365

        print("$nome, você já viveu $diasVividos dias")
    }

}