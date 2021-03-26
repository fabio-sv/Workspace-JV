package aula07;

import java.util.ArrayList;
import java.util.List;

public class InteracoesEx02 {
    public static void main(String[] args) {

        List<String> profissoes = new ArrayList<String>();
        profissoes.add("Programador");
        profissoes.add("Testador");
        profissoes.add("Gerente de Projetos");
        profissoes.add("Gerente de Qualidade");

        profissoes.stream()
                .filter(prof -> prof.startsWith("Gerente"))
                .forEach(System.out::println);
    }
}
