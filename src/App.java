import java.time.LocalDate;

import br.com.dio.desafio.abstraindo.bootcamp.br.com.dio.desafio.abstraindo.Curso;
import br.com.dio.desafio.abstraindo.bootcamp.br.com.dio.desafio.abstraindo.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao( "Descrição do Curso java");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição da Metoria Java");
        mentoria1.setData(LocalDate.now());
        System.out.println(mentoria1);

    }
}
