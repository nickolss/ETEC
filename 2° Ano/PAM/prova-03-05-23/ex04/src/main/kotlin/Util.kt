class Util {
    var num1 : Double = 0.0
    var num2 : Double = 0.0
    var num3 : Double = 0.0

    private fun receberDados(){
        print("Digite o primeiro valor: ")
        num1 = readLine()?.toDouble()!!

        print("Digite o segundo valor: ")
        num2 = readLine()?.toDouble()!!

        print("Digite o terceiro valor: ")
        num3 = readLine()?.toDouble()!!
    }

    fun verificarMaior(){
        receberDados()
        when{
            num1 > num2 && num1 > num3 -> print("O número $num1 é o maior")
            num2 > num1 && num2 > num3 -> print("O número $num2 é o maior")
            num3 > num1 && num3 > num2 -> print("O número $num3 é o maior")

            else -> print("Ocorreu algum erro. Por favor não apresenta valores iguais.")
        }

    }
}