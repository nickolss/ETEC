import java.text.DecimalFormat

class Caixa {
    var peso : Double = 0.0
    var precoPorQuilo : Double = 12.00
    var precoFinal : Double = 0.0

    private fun receberValores(){
        print("Digite o peso da comida: ")
        peso = readLine()?.toDouble()!!
    }

    fun calcularValor(){
        receberValores()

        precoFinal = peso * precoPorQuilo
        val formatadorNum = DecimalFormat("##.##")

        print("O preõ final ficou em R\$${formatadorNum.format(precoFinal)}")
    }

}