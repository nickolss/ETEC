class CalculadoraTabuada {
    var numero = 8

    fun calcularTabuada(){
        for (i in 1 .. 10){
            var result = numero * i
            println("8 x $i = $result")
        }

    }
}