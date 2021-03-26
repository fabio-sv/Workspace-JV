package aula04;  //Memoization

import java.util.HashMap;
import java.util.Map;

public class RecursiviidadeEx03 {
    static Map<Integer, Integer> MAPA_FATORIAL = new HashMap<>();

    public static void main(String[] args) {

        long timer1 = System.nanoTime();
        System.out.println(fatorialComMomoization(5));
        long timer2 = System.nanoTime();
        System.out.println("FATORIAL 1 " + (timer2 - timer1));

        timer1 = System.nanoTime();
        System.out.println(fatorialComMomoization(5));
        timer2 = System.nanoTime();
        System.out.println("FATORIAL 2 " + (timer2 - timer1));
    }

    public static Integer fatorialComMomoization(Integer valor) {
        if (valor == 0) {
            return valor;
        } else {
            if (MAPA_FATORIAL.containsKey(valor)) {
                return MAPA_FATORIAL.get(valor);
            } else {
                Integer resultado = valor * fatorialComMomoization(valor - 1);
                MAPA_FATORIAL.put(valor, resultado);
                return resultado;
            }
        }
    }
}
