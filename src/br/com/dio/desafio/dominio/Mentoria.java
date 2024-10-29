package br.com.dio.desafio.dominio;


import java.time.LocalDate;

public class Mentoria extends Conteudos {

    //atritbuto

    private LocalDate data;

    @Override
    public double calcularXp() {
        return 0;
    }

    @Override
    public double calcularxp(double xp_padrao) {
        return xp_padrao + 20;
    }

    public Mentoria(){

    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;

    }



    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}


