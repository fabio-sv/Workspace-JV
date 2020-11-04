package Modulo3.ClassesObjetosMetodosStrings.Ex16;

public class HeartRates {

    private String nome;
    private String sobrenome;
    private int dia;
    private int mes;
    private int ano;
    private int idade;
    private int maxima;


    public HeartRates(String nome, String sobrenome, int dia, int mes, int ano){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // calcula a idade(atualizar ano)
    public int idade (){
        this.idade = 2020 - this.ano;
        return this.idade;
    }

    // calcula a frequência maxíma
    public int frequenciaMaxima(){
        maxima = 220 - this.idade();
        return this.maxima;
    }

    //calcula a frequência alto
    public double frequenciaAlvo(){
        return maxima * 0.7;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
}
