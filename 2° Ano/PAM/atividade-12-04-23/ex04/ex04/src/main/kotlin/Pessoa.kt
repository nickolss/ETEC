class Pessoa {
    private var nome : String = ""

    protected var rg : String = ""

    private var cpf : String = ""

    var idade : Int = 0

    var endereco : String = ""

    var foneResidencial : String = ""

    var foneComercial : String = ""

    var celular : String = ""

    protected var nomePai : String = ""

    protected var nomeMae : String = ""

    protected var nomeConjuge : String = ""

    private var sexo = ""

    fun cadastrarPessoa(){
        println("****************")
        println("CADASTRAR PESSOA")
        println("****************")

        print("Digite o nome: ")
        nome = readLine()?.toString()!!

        print("Digite o RG: ")
        rg = readLine()?.toString()!!

        print("Digite o CPF: ")
        cpf = readLine()?.toString()!!

        print("Digite o idade: ")
        idade = readLine()?.toInt()!!

        print("Digite o endereço: ")
        endereco = readLine()?.toString()!!

        print("Digite o telefone residencial: ")
        foneResidencial = readLine()?.toString()!!

        print("Digite o telefone comercial: ")
        foneComercial = readLine()?.toString()!!

        print("Digite o celular: ")
        celular = readLine()?.toString()!!

        print("Digite o nome do pai: ")
        nomePai = readLine()?.toString()!!

        print("Digite o nome da mãe: ")
        nomeMae = readLine()?.toString()!!

        print("Digite o nome do cônjuge: ")
        nomeConjuge = readLine()?.toString()!!

        print("Digite o sexo, M para masculino e F para feminino: ")
        sexo = readLine()?.toString()!!
        println("")
    }

    fun listarCadastro(){
        println("Nome cadastrado: $nome")
        println("RG cadastrado: $rg")
        println("CPF cadastrado: $cpf")
        println("Idade cadastrada: $idade")
        println("Endereço cadastrado: $endereco")
        println("Telefone Residencial cadastrado: $foneResidencial")
        println("Telefone Comercial cadastrado: $foneComercial")
        println("Celular cadastrado: $celular")
        println("Nome do pai cadastrado: $nomePai")
        println("Nome da mãe cadastrada: $nomeMae")
        println("Nome do cônjuge cadastrado: $nomeConjuge")
        println("Sexo cadastrado: $sexo")
    }
}