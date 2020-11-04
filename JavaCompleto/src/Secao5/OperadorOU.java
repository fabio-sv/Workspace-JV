package Secao5;

public class OperadorOU {
    public static void main(String[] args) {

          /* TABELA VERDADE OPERADOR &&
        A / B ==== A || B
        F / F ====   F
        F / V ====   V
        V / F ====   V
        V / V ====   V
         */

        int x = 5;

        System.out.println(x == 10 || x < 20); // true
                            //f       //v

        System.out.println(x > 0 || x != 3); //true
                            //v       //v

        System.out.println(x <= 0 || x != 3 || x != 5); ;//true
                            //f        //v        //f
    }
}
