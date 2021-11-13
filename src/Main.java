import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Conteudo conteudo = new Curso();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMurilo = new Dev();
        devMurilo.setNome("Murilo");
        devMurilo.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos " + devMurilo.getConteudosInscritos());

        devMurilo.progredir();
        devMurilo.progredir();

        System.out.println("**********");
        System.out.println("Conteúdos inscritos " + devMurilo.getConteudosInscritos());
        System.out.println("Conteúdos concluidos " + devMurilo.getConteudosConcluidos());
        System.out.println("XP: " + devMurilo.calcularTotalXp());

        System.out.println("-----------------------------------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos " + devJoao.getConteudosInscritos());

        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();

        System.out.println("**********");
        System.out.println("Conteúdos inscritos " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluidos " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
    }
}
