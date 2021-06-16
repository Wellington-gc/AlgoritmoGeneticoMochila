public class Objeto {

    private double beneficio;
    private int peso;
    private String nome;

    public Objeto() {
    }

    public Objeto(int beneficio, int peso, String nome) {
        this.beneficio = beneficio;
        this.peso = peso;
        this.nome = nome;
    }

    public double getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(double beneficio) {

        this.beneficio = beneficio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

}
