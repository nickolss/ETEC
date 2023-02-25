import java.util.Scanner
class Util {
    var teclado = Scanner(System.`in`)
    var numero : Int = 0


    fun verificarNumeroPar(){
        print("Digite um número: ")
        this.numero = teclado.nextInt()
        when{
            this.numero % 2 == 0 -> println("O número é par")
            else -> println("O número é impar")
        }
    }
}