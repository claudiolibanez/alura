package br.com.alura.alugames.servicos

import br.com.alura.alugames.modelo.InfoJogo
import com.google.gson.Gson
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

class ConsumoApi {

    fun buscaJogo(id: String): InfoJogo {
        val endereco = "https://www.cheapshark.com/api/1.0/games?id=$id"

        val client: HttpClient = HttpClient.newHttpClient()
        val request = HttpRequest.newBuilder()
            .uri(URI.create(endereco))
            .build()
        val response = client
            .send(request, HttpResponse.BodyHandlers.ofString())

        val json = response.body()

        // println(json)

        // val meuJogo = Jogo()
        // meuJogo.titulo = "Batman: Arkham Asylum Game of the Year Edition"
        // meuJogo.capa = "https:\\/\\/cdn.cloudflare.steamstatic.com\\/steam\\/apps\\/35140\\/capsule_sm_120.jpg?t=1681938587"

        // val meuJogo = Jogo(
        //     "Batman: Arkham Asylum Game of the Year Edition",
        //     "https:\\/\\/cdn.cloudflare.steamstatic.com\\/steam\\/apps\\/35140\\/capsule_sm_120.jpg?t=1681938587"
        // )

        // println(meuJogo)

        // val novoJogo = Jogo(
        //     capa = "https:\\/\\/cdn.cloudflare.steamstatic.com\\/steam\\/apps\\/35140\\/capsule_sm_120.jpg?t=1681938587",
        //     titulo = "Batman: Arkham Asylum Game of the Year Edition"
        // )

        // println(novoJogo)

        val gson = Gson()
        val meuInfoJogo = gson.fromJson(json, InfoJogo::class.java)

        // println(meuInfoJogo)

        return meuInfoJogo
    }
}