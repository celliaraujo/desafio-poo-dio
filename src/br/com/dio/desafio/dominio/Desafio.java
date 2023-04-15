package br.com.dio.desafio.dominio;

public class Desafio extends Conteudo{
    private int nivelDificuldade;

    public Desafio() {
    }

    public Desafio(String titulo, String descricao, int nivelDificuldade) {
        this.setTitulo(titulo);
        this.nivelDificuldade = nivelDificuldade;
    }

    public int getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(int nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }

    @Override
    public double calcularXp() {
        return (XP_PADRAO + 10) * nivelDificuldade;
    }

    @Override
    public String toString() {
        return "Desafio{" +
                "tituloDesafio=" + getTitulo() +
                "Descrição=" + getDescricao() +
                "nivelDificuldade=" + nivelDificuldade +
                '}';
    }
}
