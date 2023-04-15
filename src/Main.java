import br.com.dio.desafio.dominio.*;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Curso curso1 = new Curso("Programação em Java","Descrição do Curso",6);
        Curso curso2 = new Curso("Orientação a Objetos","Descrição do Curso",4);
        Desafio desafioCodigo1 = new Desafio("Desafio Iniciante","",1);
        Desafio desafioCodigo2 = new Desafio("Desafio Intermediario","",3);
        Mentoria mentoria = new Mentoria("Pirâmide de Testes", "Descrição da Mentoria", LocalDate.of(2023,05,20));

        Bootcamp bootcampJava1 = new Bootcamp("Bootcamp Java Developer","Descrição do Bootcamp");


//        System.out.println(curso1);
//        System.out.println(mentoria);

        bootcampJava1.getConteudos().add(curso1);
        bootcampJava1.getConteudos().add(curso2);
        bootcampJava1.getConteudos().add(desafioCodigo1);
        bootcampJava1.getConteudos().add(mentoria);
        bootcampJava1.getConteudos().add(desafioCodigo2);


        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcampJava1);
        System.out.println("Conteudos Inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteudos Inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluídos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcampJava1);
        System.out.println("Conteudos Inscritos João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteudos Inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluídos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());


    }

}
