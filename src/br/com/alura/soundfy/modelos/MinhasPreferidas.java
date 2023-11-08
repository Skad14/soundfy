package br.com.alura.soundfy.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " está nas suas favoritas.");
        } else {
            System.out.println(audio.getTitulo() + " foi recomendado pela comunidade.");
        }
    }
}
