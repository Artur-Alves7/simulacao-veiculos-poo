public class Carro extends Veiculo {
    private int numeroDePortas;

    public Carro(String marca, String modelo, String placa) {
        super(marca, modelo, placa);
        this.numeroDePortas = 4;
    }

    public Carro(String marca, String modelo, String placa, int velocidade) {
        super(marca, modelo, placa);
        setVelocidade(velocidade);
        this.numeroDePortas = 4;
    }

    public int getNumeroDePortas() { return numeroDePortas; }
    public void setNumeroDePortas(int numeroDePortas) { this.numeroDePortas = numeroDePortas; }

    @Override
    public void ligar(String modo) {
        System.out.println(getMarca() + " " + getModelo() + " (carro) ligado no modo " + modo + ".");
    }

    @Override
    public void exibirStatus() {
        System.out.println("Carro: " + getMarca() + " " + getModelo()
                + " | Velocidade: " + getVelocidade() + " km/h"
                + " | Portas: " + numeroDePortas
                + " | Combustivel: " + getCombustivel() + "L"
                + " | Placa: " + getPlaca());
    }

    @Override
    public double calcularConsumo() {
        return 0.10;
    }

    @Override
    public String toString() {
        return "Carro: " + getMarca() + " " + getModelo() + " - Velocidade: " + getVelocidade() + " km/h";
    }
}
