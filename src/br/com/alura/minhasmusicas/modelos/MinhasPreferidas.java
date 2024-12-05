package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void incluir(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é sucesso absoluto!");
        } else {
            System.out.println(audio.getTitulo() + " tambem é uma boa escolha!");
        }
    }
}
