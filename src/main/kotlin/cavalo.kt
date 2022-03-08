

class cavalo (nome: String, idade: Int): animal(nome, idade){

    var tipoDaCrina= ""

    override fun deveCorrer() {
        println(" 'Trotando até a arvore de maça' ")
    }

    override fun emitirSom() {
        println("Hiin in in")
    }
}