package Secao5;

public class OperadorEE {
    public static void main(String[] args) {

        /* TABELA VERDADE OPERADOR &&
        A / B ==== A && B
        F / F ====   F
        F / V ====   F
        V / F ====   F
        V / V ====   V
         */

        int a = 5;

        //Operador "E"
        System.out.println(a <= 20 && a == 10); //false
                             //v       //f

        System.out.println(a > 0 && a != 3); //true
                            //v     //v

        System.out.println(a <= 20 && a == 10 && a != 3); //false
                            //v        //f        //v
    }
}
