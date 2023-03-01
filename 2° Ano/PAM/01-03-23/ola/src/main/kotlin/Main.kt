import java.util.Scanner

fun main(args: Array<String>) {
    var teclado = Scanner(System.`in`)
    println("Digite seu nome: ")
    val nome = teclado.next()
    println("Olá, $nome")

    //Exemplo de Boolean
    val b1 = false;
    val b2 = true

    val c1 = b1.and(b2)
    val c2 = b1.or(b2)
    val c3 = b1.not()

    println("$c1 $c2 $c3")

    
}