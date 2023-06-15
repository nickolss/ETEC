class Util {
    var salarioAtual : Double = 0.0
    var salarioComAumento : Double = 0.0
    var salarioImpostos : Double = 0.0

    private fun receberSalario(){
        print("Digite seu salário atual: ")
        salarioAtual = readLine()?.toDouble()!!
    }

    fun calcularSalarios(){
        receberSalario()
        val aumento = salarioAtual * 0.15
        salarioComAumento = salarioAtual + aumento

        val imposto = salarioAtual * 0.08
        salarioImpostos = salarioAtual - imposto

        println("O salário inicial é de $salarioAtual")
        println("O salário com aumento é de $salarioComAumento")
        println("O salário com impostos é de $salarioImpostos")
    }

}