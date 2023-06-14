class Util {
    var horaInicio: Int = 0
        private set
    private fun receberValor(){
        print("Digite a hora de início: ")
        horaInicio = readLine()?.toInt()!!
    }

    fun determinarHorario(){
        receberValor()
        when{
            horaInicio>= 5 && horaInicio <=12.59 -> print("Seu turno é Manhã")

            horaInicio>= 13 && horaInicio<=20.59 -> print("Seu turno é Tade")

            horaInicio>=21 || horaInicio<=4.59 -> print("Seu turno é Noite")
        }

    }


}