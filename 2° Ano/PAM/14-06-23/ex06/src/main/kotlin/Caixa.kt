class Caixa {
    val valorCamisaP : Double = 10.0
    val valorCamisaM : Double = 12.0
    val valorCamisaG : Double = 15.0
    var precoFinal : Double = 0.0

    var quantidaCamisaP : Int = 0
    var quantidaCamisaM : Int = 0
    var quantidaCamisaG : Int = 0

    private fun receberValores(){
        print("Digite a quantidade de camisetas pequenas: ")
        quantidaCamisaP = readLine()?.toInt()!!
        print("Digite a quantidade de camisetas média: ")
        quantidaCamisaM = readLine()?.toInt()!!
        print("Digite a quantidade de camisetas grandes: ")
        quantidaCamisaG = readLine()?.toInt()!!
    }

    fun calcularValor(){
        receberValores()

        val resultado = (quantidaCamisaP * valorCamisaP) + (quantidaCamisaM * valorCamisaM) + (quantidaCamisaG * valorCamisaG)
        print("O resultado final da compra é $resultado")
    }
}