class Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    // Criando alguns conteúdos educacionais
    val conteudo1 = ConteudoEducacional(nome = "Kotlin Basics", duracao = 60)
    val conteudo2 = ConteudoEducacional(nome = "Kotlin Advanced", duracao = 120)
    val conteudo3 = ConteudoEducacional(nome = "Kotlin Coroutines", duracao = 90)
    
    // Criando uma formação
    val formacao = Formacao(nome = "Formação Kotlin", conteudos = listOf(conteudo1, conteudo2, conteudo3))
    
    // Criando alguns usuários
    val usuario1 = Usuario()
    val usuario2 = Usuario()
    
    // Matriculando os usuários na formação
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
    
    // Imprimindo os inscritos na formação
    println("Inscritos na formação: ${formacao.inscritos.size}")
}