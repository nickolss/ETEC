import java.util.*

class Funcionario {
    var nome : String = ""
    var nascimento : Int = 0
    var salario : Double = 0.0


    fun informarSalario(){
        println("O salário é de ${this.salario}")
    }

    fun informarIdade(){
        print("Digite o ano atual: ")
        var anoAt = readLine()?.toInt()!!

        print("Digite o ano de nascimento: ")
        this.nascimento = readLine()?.toInt()!!

        val idade = anoAt - this.nascimento

        println("A idade é de $idade")
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