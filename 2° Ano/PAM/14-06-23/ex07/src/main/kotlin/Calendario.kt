class Calendario {
    var diaAtual : Int = 0
    var mesAtual : Int = 0
    var diasPassados : Int = 0

    private fun receberValores(){
        print("Digite o dia atual: ")
        diaAtual = readLine()?.toInt()!!
        print("Digite o mês atual: ")
        mesAtual = readLine()?.toInt()!!
    }

    fun calcularInicioAno(){
        receberValores()
        when{
            mesAtual == 1 -> {
                diasPassados = diaAtual
                print("Passaram $diasPassados dias do início do ano")
            }

            mesAtual == 2 -> {
                diasPassados = 30 + diaAtual
                print("Passaram $diasPassados dias do início do ano")
            }

            mesAtual == 3 -> {
                diasPassados = 60 + diaAtual
                print("Passaram $diasPassados dias do início do ano")
            }

            mesAtual == 4 -> {
                diasPassados = 90 + diaAtual
                print("Passaram $diasPassados dias do início do ano")
            }

            mesAtual == 5 -> {
                diasPassados = 120 + diaAtual
                print("Passaram $diasPassados dias do início do ano")
            }

            mesAtual == 6 -> {
                diasPassados = 150 + diaAtual
                print("Passaram $diasPassados dias do início do ano")
            }

            mesAtual == 7 -> {
                diasPassados = 180 + diaAtual
                print("Passaram $diasPassados dias do início do ano")
            }

            mesAtual == 8 -> {
                diasPassados = 210 + diaAtual
                print("Passaram $diasPassados dias do início do ano")
            }

            mesAtual == 9 -> {
                diasPassados = 240 + diaAtual
                print("Passaram $diasPassados dias do início do ano")
            }

            mesAtual == 10 -> {
                diasPassados = 270 + diaAtual
                print("Passaram $diasPassados dias do início do ano")
            }

            mesAtual == 11 -> {
                diasPassados = 300 + diaAtual
                print("Passaram $diasPassados dias do início do ano")
            }

            mesAtual == 12 -> {
                diasPassados = 330 + diaAtual
                print("Passaram $diasPassados dias do início do ano")
            }

        }

    }

}