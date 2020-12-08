package EstruturaDados.PercorrerListaObjetos;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        // criando a lista de objetos aluno
        List<Aluno> alunos = new ArrayList<Aluno>();

        // Objeto aluno 1
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Jane");
        aluno1.setIdade(17);

        // Objeto aluno 2
        Aluno aluno2 = new Aluno();
        aluno2.setNome("Jhon");
        aluno2.setIdade(18);

        // adicionando os alunos na lista
        alunos.add(aluno1);
        alunos.add(aluno2);

        // percorrendo a lista de alunos
        for (int i = 0; i < alunos.size(); i ++){
             Aluno alunoLista = alunos.get(i);

            System.out.println(alunoLista);

            /*  Output

            Aluno{nome='Jane', idade=17}
            Aluno{nome='Jhon', idade=18}

             */
        }

        // outra forma de imprimir a lista
        for (int i = 0; i < alunos.size(); i ++){

            System.out.println(alunos.get(i));

            /*  Output

            Aluno{nome='Jane', idade=17}
            Aluno{nome='Jhon', idade=18}

             */
        }
    }
}
