package br.com.dio.desafio.dominio;



public abstract class Conteudos {

    protected static final double XP_PADRAO = 10; // Corrigido para maiúsculas

    private String titulo;
    private String descricao;

    // Método abstrato que deve ser implementado nas subclasses
    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract double calcularxp(double xp_padrao);
}
