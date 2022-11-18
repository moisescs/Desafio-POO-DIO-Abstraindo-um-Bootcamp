import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

import br.com.dio.desafio.abstraindo.bootcamp.Bootcamp;
import br.com.dio.desafio.abstraindo.bootcamp.Conteudo;
import br.com.dio.desafio.abstraindo.bootcamp.Curso;
import br.com.dio.desafio.abstraindo.bootcamp.Dev;
import br.com.dio.desafio.abstraindo.bootcamp.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java 1");
        curso1.setDescricao( "Descrição do Curso java 1");
        curso1.setCargaHoraria(8);
        System.out.println("Curso 01 " + curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java 2");
        curso2.setDescricao( "Descrição do Curso java 2");
        curso2.setCargaHoraria(4);
        System.out.println("Curso 02 " + curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição da Metoria Java");
        mentoria1.setData(LocalDate.now());
        System.out.println(mentoria1);

        Conteudo conteudo1 = new Curso();
        Conteudo conteudo2 = new Mentoria();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java developer");
        bootcamp.setDescricao("Conteudos a java para iniciantes em progração");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        /* 
        Set<Conteudo> conteudos = new LinkedHashSet<>();
        conteudos.add(curso1);
        conteudos.add(curso2);
        bootcamp.setConteudos(conteudos);
        */
        
       


        System.out.println("#################################################");

        Dev dev1 = new Dev();
        dev1.setNome("Moisés");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Dev1 " + dev1.getConteudosInscritos() );
        dev1.progredir();
        dev1.progredir();        
        System.out.println("Conteudos Inscritos Dev1 " + dev1.getConteudosInscritos() );
        System.out.println("Conteudos concluidos Dev1 " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        System.out.println();

        Dev dev2 = new Dev();
        dev2.setNome("Daiane");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Dev2 " + dev2.getConteudosInscritos() );
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteudos Inscritos Dev2 " + dev2.getConteudosInscritos() );
        System.out.println("Conteudos concluidos Dev2 " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());

    }
}
