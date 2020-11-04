public class TryCatchFinally {

    public static void main(String[] args) {

        int[] aluno = new int[50];
        int indice = 51;

        try { //código que corre o risco de gerar exceção...
            System.out.println(aluno[indice]);

        } catch (ArrayIndexOutOfBoundsException erro) { //ação tomada caso ocorra uma exceção em TRY..
            System.out.println("Aluno inexistente...");

        } finally { //esse comando é executado sempre...
            System.out.println("Executou o finally...");
        }
    }
}
