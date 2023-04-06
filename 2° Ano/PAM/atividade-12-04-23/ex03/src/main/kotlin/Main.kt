fun main(args: Array<String>) {
    var ex = Externa()
    ex.instanciaInterna()
}

class Externa{
    private var x : Int = 7

    fun instanciaInterna(){
        var interna = Interna()
        interna.imprimeExterna()
    }

}

class Interna{
    fun imprimeExterna(){
        println("X vale $x")
    }
}