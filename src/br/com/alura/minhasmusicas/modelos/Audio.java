package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int totalDeReproducoes;
    private int totalCurtidas;
    private int classificacao;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curtir() {
        this.totalCurtidas++;
        //System.out.println("Adicionado nas suas curtidas");
    }

    public void reproduzir() {
        this.totalDeReproducoes++;
        //System.out.println("Tocando...");
    }
}
