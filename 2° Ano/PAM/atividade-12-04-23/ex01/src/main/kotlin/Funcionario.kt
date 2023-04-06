class Funcionario {
    var nome : String = ""

    var nascimento : Int = 0

    var salario : Double = 0.0


    fun informarSalario(){
        println("O salário é de $salario")
    }

    fun informarIdade(){
        print("Digite o ano atual: ")
        val anoAt = readLine()?.toInt()!!

        val idade = anoAt - this.nascimento
        println("A idade é de $idade anos")
    }

    fun andar(){
        println("A pessoa andou")
    }

    fun falar(){
        println("A pessoa falou")
    }

    fun beber(){
        println("A pessoa bebeu")
    }

    fun comer(){
        println("A pessoa comeu")
    }
}