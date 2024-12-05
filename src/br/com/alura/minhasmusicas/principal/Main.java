package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Main {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setCantor("Tupac");
        minhaMusica.setGenero("Rap");
        minhaMusica.setTitulo("All eyes on me");

        for (int i = 0; i < 2500; i++) {
            minhaMusica.reproduzir();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Paciente 63");
        meuPodcast.setApresentador("Seu Jorge");
        meuPodcast.setDescricao("Historia de ficção cientifica sobre viagem no tempo para salvar o mundo");

        for (int i = 0; i < 350; i++) {
            meuPodcast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.incluir(minhaMusica);
        preferidas.incluir(meuPodcast);
    }
}