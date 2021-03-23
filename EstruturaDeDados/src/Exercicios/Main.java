package Exercicios;

public class Main {
    public static void main(String[] args) {

        palindromo("ana");

    }
    public static void palindromo(String txt){
        int qtdIndex = txt.length();
        boolean check = false;

        for (int i = 0; i < qtdIndex; i++){
            char index = txt.charAt(i);

            for(int j = i + 2; j < qtdIndex; j++){
                char indexAux = txt.charAt(j);
                if(index == indexAux){
                    check = true;
                }
            }
        }
        if (check == true){
            System.out.println("Palindromo");
        }
        else {
            System.out.println("Não Palindromo");
        }

    }
}
