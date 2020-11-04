package Modulo3.ClassesObjetosMetodosStrings.Ex16;

public class Program {
    public static void main(String[] args) {

        HeartRates heart = new HeartRates("Jhon", "Blue", 21, 04,1995);

        System.out.println("Nome: " + heart.getNome() + " " + heart.getSobrenome());
        System.out.println("Data de Nascimento: " + heart.getDia() + "-" + heart.getMes() + "-" +
                heart.getAno());
        System.out.println("Frequência cardiaca maxíma: " + heart.frequenciaMaxima());
        System.out.println("Frequência cardiaca alvo: " + heart.frequenciaAlvo());
    }
}
