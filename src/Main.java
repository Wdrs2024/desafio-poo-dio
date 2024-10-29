import br.com.dio.desafio.dominio.Conteudos;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria( 8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria( 4);

        Conteudos conteudos = new Curso();
        Conteudos conteudos1 = new Mentoria();

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());



        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Bootcap Java Developer");
        bootCamp.setDescricao("Descrição BootCamp Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria1);

        Dev devWesley = new Dev();
        devWesley.setNome("Wesley");
        devWesley.increverBootCamp(bootCamp);
        System.out.println("Conteúdos Inscritos Wesley:" + devWesley.getContedosInscrito());
        devWesley.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Wesley:" + devWesley.getContedosInscrito());
        System.out.println("Conteúdos Concluido Wesley:" + devWesley.getConteudosConcluido());
        System.out.println("XP:" + devWesley.calcularTotalxp());




        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.increverBootCamp(bootCamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getContedosInscrito());
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getContedosInscrito());
        System.out.println("Conteúdos Concluido Camila:" + devCamila.getConteudosConcluido());
        System.out.println("XP:" + devCamila.calcularTotalxp());


    }
}
