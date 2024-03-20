package br.com.alura.screenmatch;

import br.com.alura.screenmatch.model.DadosEpisodio;
import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.model.DadosTemporada;
import br.com.alura.screenmatch.principal.Principal;
import br.com.alura.screenmatch.service.ConsumoApi;
import br.com.alura.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreenMatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenMatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/* var consumoApi = new ConsumoApi();
		var json = consumoApi.objterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=d237a4f1");

		System.out.println(json);

		ConverteDados conversor = new ConverteDados();
		DadosSerie dadosSerie = conversor.obterDados(json, DadosSerie.class);

		System.out.println(dadosSerie);

		json = consumoApi.objterDados("https://www.omdbapi.com/?t=gilmore+girls&season=1&episode=2&apikey=d237a4f1");

		DadosEpisodio dadosEpisodio = conversor.obterDados(json, DadosEpisodio.class);

		System.out.println(dadosEpisodio);

		List<DadosTemporada> temporadas = new ArrayList<>();

		for (int i = 1; i <= dadosSerie.totalTemporadas(); i++) {
			json = consumoApi.objterDados("https://www.omdbapi.com/?t=gilmore+girls&season=" + i + "1&apikey=d237a4f1");

			DadosTemporada dadosTemporada =conversor.obterDados(json, DadosTemporada.class);
			temporadas.add(dadosTemporada);
		}

		temporadas.forEach(System.out::println);*/

		Principal principal = new Principal();
		principal.exibeMenu();
	}
}
