class Externa {
    private val x = 7

    fun instanciaInterna() {
        val interno = Interna() //instancia interna
        interno.imprimeExterna() //invoca método da interna
    }

    inner class Interna {
        fun imprimeExterna() {
            println("x vale $x")
        }
    } //fim da classe interna

    fun main(args: Array<String>) {
        val ex = Externa() //instancia externa
        ex.instanciaInterna() //invoca método da externa
    }
}



