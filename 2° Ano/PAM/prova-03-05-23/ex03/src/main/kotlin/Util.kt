class Util {
    var nota1 : Double = 0.0
    var nota2 : Double = 0.0
    var nota3 : Double = 0.0
    var media : Double = 0.0
    var mediaAProveitamento : Double = 0.0
    var quantidadeDeExercicio : Int = 0

    private fun receberValores(){
        println("Calculadora de Média")

        print("Digite a primeira nota: ")
        nota1 = readLine()?.toDouble()!!

        print("Digite a segubnda nota: ")
        nota2 = readLine()?.toDouble()!!

        print("Digite a terceira nota: ")
        nota3 = readLine()?.toDouble()!!

        print("Digite a quantidade de exercícios: ")
        quantidadeDeExercicio = readLine()?.toInt()!!
    }

    fun calcularMedia(){
        receberValores()
        media = (nota1 + nota2 + nota3) / quantidadeDeExercicio
        mediaAProveitamento = ((nota1 + (nota2 * 2) + (nota3 * 3)) + media)/7

        if(mediaAProveitamento >= 9){
            println("A média de aprovamento é A")
        }else if(mediaAProveitamento >=7.5 && mediaAProveitamento <9){
            println("A média de aprovamento é B")
        }else if (mediaAProveitamento >= 6 && mediaAProveitamento <7.5){
            println("A média de aprovamento é C")
        }else if (mediaAProveitamento < 6){
            println("A média de aprovamento é D")
        }
    }
}