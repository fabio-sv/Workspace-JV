package EstruturaDados;

public class teste {
    public static void main(String[] args) {

        double peso = 70;
        double altura = 1.80;
        byte idade = 25;
        boolean sexo = true;

        double imc = peso / (altura * altura);
        System.out.println("imc: " + imc);

        //(1,20 x IMC) + (0,23 x idade) – (10,8 x sexo) – 5.4 //25.812

        if (sexo == false){
            double bfFeminino = ((1.20 * imc) + (0.23 * idade) - (10.8 * 0))- 5.4;
            System.out.println(bfFeminino);

        }else if (sexo == true){
            double bfMAsculino = ((1.20 * imc) + (0.23 * idade)) - (10.8 * 1) - 5.4;
            System.out.println(bfMAsculino);
        }



    }

}
