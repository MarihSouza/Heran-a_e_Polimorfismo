
class cachorro(
     nome: String, idade: Int, var raca: String):animal(nome, idade) {

    override fun deveCorrer() {
        print(" 'Correndo atrás de um gato' ")
    }

    override fun emitirSom() {
        println(" roof roof ")
    }



}