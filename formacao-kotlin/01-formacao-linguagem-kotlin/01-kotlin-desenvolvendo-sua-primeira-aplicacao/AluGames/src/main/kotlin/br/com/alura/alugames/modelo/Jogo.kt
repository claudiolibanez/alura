package br.com.alura.alugames.modelo

data class Jogo(
    // @SerializedName("title")
    val titulo: String,

    // @SerializedName("thumb")
    val capa: String
) {

    // var titulo = ""
    // var capa = ""
    var descricao: String? = null

    override fun toString(): String {
        return "Meu Jogo: \n" +
                "Titulo: $titulo \n" +
                "Capa: $capa \n" +
                "Descricao: $descricao \n"
    }

}