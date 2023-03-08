class Util {
    var base : Double = 0.0
        private set

    var altura : Double = 0.0
        private set

    fun receberValores(){
        print("Digite a base do retângulo: ")
        this.base = readLine()?.toDouble()!!

        print("Digite a altura do retângulo: ")
        this.altura = readLine()?.toDouble()!!
    }

    fun calcularArea(){
        var result = 0.0

        result = this.base * this.altura
    }
}