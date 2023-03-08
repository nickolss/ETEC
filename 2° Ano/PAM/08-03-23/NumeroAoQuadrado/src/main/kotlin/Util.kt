class Util {
    var n1 : Double = 0.0
        private set
    var n2 : Double = 0.0
        private set


    fun receberValores(){
        print("Digite o primeiro número: ")
        this.n1 = readLine()?.toDouble()!!

        print("Digite o segundo número: ")
        this.n2 = readLine()?.toDouble()!!
    }

    fun calcularValores(){
        var result = 0.0

        result = Math.pow((this.n1 * this.n2), 2.0)
        println("O resultado é ${result}")
    }
}