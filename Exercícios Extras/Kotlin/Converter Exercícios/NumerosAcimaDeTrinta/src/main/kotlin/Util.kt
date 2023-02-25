import javax.swing.JOptionPane
class Util {
    var numeros: Int = 0
        private set

    var numerosAcimaDeTrinta : Int = 0
        private set

    fun validador(){
        for (i in 0 .. 15){
            this.numeros = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "))
            if (this.numeros >= 30){
                this.numerosAcimaDeTrinta++
            }
        }

        JOptionPane.showMessageDialog(null, "Os números acima de 30 foram $numerosAcimaDeTrinta")
    }
}