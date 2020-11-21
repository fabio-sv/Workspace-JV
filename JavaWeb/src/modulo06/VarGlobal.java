package modulo06;

public class VarGlobal {

    // variável Global
    static int valor2 = 20;

    public static void main(String[] args) {

        // variável Local
        int valor = 10;
        System.out.println("O valor da variável local = " + valor);


        func();
    }
    public static void func(){
        System.out.println("Valor da váriavel Global = " + valor2);

    }
}
