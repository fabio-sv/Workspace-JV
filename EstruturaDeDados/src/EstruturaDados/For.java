public class For {
    public static void main(String[] args) {


        //For convêncional
        /*int valor = 10;

        for (int i = 0; i <= valor; i++){
            System.out.println(i);

        }

        System.out.println();

        //For em vetores simples
        int[] vetor = new int[] {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i >= vetor.length; i++){
            System.out.println(i);
        }

        System.out.println();*/

        int[][] vetMult = new int[2][2];

        vetMult[0][0] = 10;
        vetMult[0][1] = 2;
        vetMult[1][0] = 3;
        vetMult[1][1] = 4;

        for (int i = 0; i < vetMult.length; i++){
            System.out.println(i);
        }
    }
}
