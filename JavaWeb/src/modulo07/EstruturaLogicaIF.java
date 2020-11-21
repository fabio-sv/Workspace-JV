package modulo07;

public class EstruturaLogicaIF {
    public static void main(String[] args) {

        int media = 70;
        String nome = "Jhon";

        if (media >= 70 && nome.equals("Jhon")){
            System.out.println("Parabens você está aprovado");

        }
        else if (media < 70){
            System.out.println("Você está reprovado");
        }
        else {
            System.out.println("Aluno não encontrado");
        }
    }
}
