public class Formatacao {
    public static void main(String[] args) {

        double valor = 10.5687;

        // Formato de duas casas após a virgula...
        System.out.printf("valor %.2f%n", valor);

        double numero = 45.445684;

        //Formatando com String.format...
        System.out.println("Valor " + String.format("%.2f", numero));
    }

}
