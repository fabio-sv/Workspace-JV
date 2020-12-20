package EstruturaDados.OverRide;

public class Program {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Jane");
        aluno.setIdade(17);
        aluno.setMatricula("q54b58m65");

        System.out.println(aluno.toString() +  aluno.maiorIdade());

        // out -> Aluno{matricula='q54b58m65', nome='Jane', idade=17}false

        System.out.println();

        Diretor diretor = new Diretor();
        diretor.setNome("Mario");
        diretor.setIdade(40);
        diretor.setInstituicao("Havard");

        System.out.println(diretor.toString() +  diretor.maiorIdade());

        // out -> Diretor{instituicao='Havard', nome='Mario', idade=40}true

        System.out.println();

        Secretario secretario = new Secretario();
        secretario.setNome("Jhon");
        secretario.setIdade(32);
        secretario.setSetor("ADM");

        System.out.println(secretario.toString() + secretario.maiorIdade());

        // out -> Secretario{nome='Jhon', idade=32, setor='ADM'}true

    }
}
