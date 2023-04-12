class Calendario {
    var numeroDoMes = 0

    fun definirMes(){
        print("Digite o número do mês: ")
        numeroDoMes = readLine()?.toInt()!!

        when{
            numeroDoMes == 1 -> print("O mês é Janeiro")
            numeroDoMes == 2 -> print("O mês é Fevereiro")
            numeroDoMes == 3 -> print("O mês é Março")
            numeroDoMes == 4 -> print("O mês é Abril")
            numeroDoMes == 5 -> print("O mês é Maio")
            numeroDoMes == 6 -> print("O mês é Junho")
            numeroDoMes == 7 -> print("O mês é Julho")
            numeroDoMes == 8 -> print("O mês é Agosto")
            numeroDoMes == 9 -> print("O mês é Setembro")
            numeroDoMes == 10 -> print("O mês é Outubro")
            numeroDoMes == 11 -> print("O mês é Novembro")
            numeroDoMes == 12 -> print("O mês é Dezembro")

            else -> print("Não há um mês correspondente")
        }
    }
}