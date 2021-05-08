package modulo13_ArrayMatrizes;

public class Aula05 {
    public static void main(String[] args) {

        String[] valores = new String[4];

        valores[0] = "jane";
        valores[1] = "90";
        valores[2] = "Curso java";
        valores[3] = "contato@jdevtreinamento.com.br";

        String[] valores2 = {"jhoe", "60", "curso PHP", "contato@gmail.com"};


        for(int i = 0; i < valores.length; i++){
            System.out.println("Valor na posição " + i + " = " + valores[i]);
        }

        System.out.println("----------------------------------");

        for (int i = 0; i < valores2.length; i++){
            System.out.println("Valor da posição " + i  + " = " + valores2[i]);
        }

    }
}
