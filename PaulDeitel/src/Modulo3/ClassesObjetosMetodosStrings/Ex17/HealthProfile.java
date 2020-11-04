package Modulo3.ClassesObjetosMetodosStrings.Ex17;

public class HealthProfile {

    private String nome;
    private String sobrenome;
    private String sexo;
    private int dia;
    private int mes;
    private int ano;
    private double peso;
    private double altura;
    private boolean validaSexo = false;

    public HealthProfile() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {

        this.sobrenome = sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
        // validade se o usúario digitou Masculino ou Feminino
        if (this.sexo.equals("Masculino") || this.sexo.equals("Feminino")) {
            this.validaSexo = true;
        }
    }

    // validade se o usúario digitou Masculino ou Feminino
    public boolean getValidaSexo() {
        return validaSexo;

    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int idade() {
        int valor = 2020 - this.ano;
        return valor;
    }

    public int frequenciaMaxima() {
        int maxima = 220 - idade();
        return maxima;
    }

    public double frequenciaAlvo() {
        int maxima = 220 - idade();
        double alvo = maxima * 0.7;
        return alvo;
    }

    public double imc() {
        double imc = peso / (altura * altura);
        return imc;
    }
}
//String.format("%.1f", valor);