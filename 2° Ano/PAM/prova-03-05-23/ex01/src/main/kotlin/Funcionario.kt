class Funcionario {
    var salario : Double = 0.0
    var comissao : Double = 0.0
    var bonusPorVenda : Double = 0.0
    var quantidadeCarrosVendidos : Int = 0
    var salarioFinal :Double = 0.0
    var valorTotalDeVendas : Double = 0.0

    private fun receberValores(){
        println("Calcular Salário Final de Funcionário")

        print("Digite o salário fixo: ")
        salario = readLine()?.toDouble()!!

        print("Digite a comissão por carros vendidos: ")
        comissao = readLine()?.toDouble()!!

        print("Digite a quantidade de carros vendidos: ")
        quantidadeCarrosVendidos = readLine()?.toInt()!!

        print("Digite o valor total de vendas: ")
        valorTotalDeVendas = readLine()?.toDouble()!!
    }

    fun calculoSalario(){
        receberValores()
        var precoComissao = comissao * quantidadeCarrosVendidos
        bonusPorVenda = valorTotalDeVendas * 0.05

        salarioFinal = salario + precoComissao + bonusPorVenda

        println("O salário final do funcionário é $salarioFinal")
    }
}