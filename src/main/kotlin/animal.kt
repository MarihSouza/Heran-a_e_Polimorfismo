
   open class animal  (val nome: String, var idade: Int) {

       var sexo = ""


      open fun emitirSom(){
          println("emitindo som")
      }
        open fun deveCorrer(){
          println(" correndo")
        }

          open fun subirEmArvores(){
              println("Subindo")
          }



}