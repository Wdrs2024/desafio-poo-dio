package br.com.dio.desafio.dominio;


import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudos> contedosInscrito = new LinkedHashSet<>();
    private Set<Conteudos> conteudosConcluido = new LinkedHashSet<>();

    public void increverBootCamp(BootCamp bootCamp) {
        this.contedosInscrito.addAll(BootCamp.getConteudos());
        bootCamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        Optional<Conteudos> conteudo = this.contedosInscrito.stream().findFirst();
            if(conteudo.isPresent()) {
                this.conteudosConcluido.add(conteudo.get());
                this.contedosInscrito.remove(conteudo.get());

            }else {
                System.out.println("Você não está matriculado em nenhum conteúdo");
            }
    }

    public Double calcularTotalxp() {
        double xp_padrao =0;
        return
                this.conteudosConcluido.stream().mapToDouble(conteudo -> conteudo.calcularxp(xp_padrao)).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudos> getContedosInscrito() {
        return contedosInscrito;
    }

    public void setContedosInscrito(Set<Conteudos> contedosInscrito) {
        this.contedosInscrito = contedosInscrito;
    }

    public Set<Conteudos> getConteudosConcluido() {
        return conteudosConcluido;
    }

    public void setConteudosConcluido(Set<Conteudos> conteudosConcluido) {
        this.conteudosConcluido = conteudosConcluido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(contedosInscrito, dev.contedosInscrito) && Objects.equals(conteudosConcluido, dev.conteudosConcluido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, contedosInscrito, conteudosConcluido);
    }

}
