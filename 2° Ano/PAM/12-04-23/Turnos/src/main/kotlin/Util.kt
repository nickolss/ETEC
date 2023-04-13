class Util {
    var horarioDeEntrada : Double = 0.0

    fun recebeHorarioEntrada(){
        print("Digite seu horário de entrada: ")
        horarioDeEntrada = readLine()?.toDouble()!!

        verificaHorario()
    }

    fun verificaHorario(){
        if (horarioDeEntrada >= 5 && horarioDeEntrada <=12.59){
            println("Seu período é matutino")
        }else if(horarioDeEntrada >= 13 && horarioDeEntrada <= 20.59){
            println("Seu período é vespertino")
        }else if(horarioDeEntrada >= 21 || horarioDeEntrada <= 4.59){
            println("Seu período é noturno")
        }
    }
}