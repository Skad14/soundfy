package br.com.alura.soundfy.main;

import br.com.alura.soundfy.modelos.MinhasPreferidas;
import br.com.alura.soundfy.modelos.Musica;
import br.com.alura.soundfy.modelos.Podcast;

public class Main {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Nota Dó");
        minhaMusica.setArtista("Tz da Coro");
        minhaMusica.setAlbum("Single");
        minhaMusica.setGenero("Trap");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i <50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Flow Podcast");
        meuPodcast.setHost("Igor 3k");
        meuPodcast.setDescricao("Podcast sobre conversas em geral.");

        for (int i = 0; i < 500; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
