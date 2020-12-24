package EstruturaDados.HashMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Aluno> alunoList = new ArrayList<Aluno>();

        HashMap<String, List<Aluno>> map = new HashMap<String, List<Aluno>>();

        Aluno aluno1 = new Aluno();
        aluno1.setSexo("Masculino");
        Aluno aluno2 = new Aluno();
        aluno2.setSexo("Feminino");

        alunoList.add(aluno1);
        alunoList.add(aluno2);

       map.put(Genero.Masculino, new ArrayList<Aluno>());
       map.put(Genero.Feminino, new ArrayList<Aluno>());

       for (Aluno aluno : alunoList){
           if (aluno.getSexo().equalsIgnoreCase("Masculino")){
               map.get(Genero.Masculino).add(aluno);

           }else if ( aluno.getSexo().equalsIgnoreCase("Feminino")){
               map.get(Genero.Feminino).add(aluno);
           }
       }

       for (Aluno aluno : map.get(Genero.Masculino)){
           System.out.println("M: " + aluno);
       }

        for (Aluno aluno : map.get(Genero.Feminino)){
            System.out.println("F: " + aluno);
        }


    }
}
