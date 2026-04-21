public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String marca, String modelo, String placa) {
        super(marca, modelo, placa);
        this.capacidadeCarga = 5000;
    }

    public Caminhao(String marca, String modelo, String placa, double capacidadeCarga) {
        super(marca, modelo, placa);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() { return capacidadeCarga; }
    public void setCapacidadeCarga(double capacidadeCarga) { this.capacidadeCarga = capacidadeCarga; }

    @Override
    public void ligar(String modo) {
        System.out.println(getMarca() + " " + getModelo() + " (caminhao) ligado no modo " + modo + ".");
    }

    @Override
    public void exibirStatus() {
        System.out.println("Caminhao: " + getMarca() + " " + getModelo()
                + " | Velocidade: " + getVelocidade() + " km/h"
                + " | Carga max: " + capacidadeCarga + "kg"
                + " | Combustivel: " + getCombustivel() + "L"
                + " | Placa: " + getPlaca());
    }

    @Override
    public double calcularConsumo() {
        return 0.30;
    }

    @Override
    public String toString() {
        return "Caminhao: " + getMarca() + " " + getModelo() + " - Velocidade: " + getVelocidade() + " km/h";
    }
}
