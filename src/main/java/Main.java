import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(10);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(7);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descricao de mentoria Java");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + devGabriel.getConteudosInscritos());
        devGabriel.progredir();
        System.out.println("----------------------");
        System.out.println("Conteudos concluidos" + devGabriel.getConteudosConcluidos());
        System.out.println("XP: " + devGabriel.calcularTotalXP());

        System.out.println("----------------------");

        Dev devCarol = new Dev();
        devCarol.setNome("Carol");
        devCarol.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + devCarol.getConteudosInscritos());
        devCarol.progredir();
        devCarol.progredir();
        devCarol.progredir();
        System.out.println("----------------------");
        System.out.println("Conteudos concluidos" + devCarol.getConteudosConcluidos());
        System.out.println("XP: " + devCarol.calcularTotalXP());
    }
}
