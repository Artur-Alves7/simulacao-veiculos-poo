public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, String placa) {
        super(marca, modelo, placa);
        this.cilindradas = 150;
    }

    public Moto(String marca, String modelo, String placa, int cilindradas) {
        super(marca, modelo, placa);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() { return cilindradas; }
    public void setCilindradas(int cilindradas) { this.cilindradas = cilindradas; }

    @Override
    public void acelerar() {
        if (getCombustivel() <= 0) {
            System.out.println("Sem combustivel! Abasteca o veiculo antes de acelerar.");
            return;
        }
        setVelocidade(getVelocidade() + 15);
    }

    @Override
    public void ligar(String modo) {
        System.out.println(getMarca() + " " + getModelo() + " (moto) ligada no modo " + modo + ".");
    }

    @Override
    public void exibirStatus() {
        System.out.println("Moto: " + getMarca() + " " + getModelo()
                + " | Velocidade: " + getVelocidade() + " km/h"
                + " | Cilindradas: " + cilindradas + "cc"
                + " | Combustivel: " + getCombustivel() + "L"
                + " | Placa: " + getPlaca());
    }

    @Override
    public double calcularConsumo() {
        return 0.05;
    }

    @Override
    public String toString() {
        return "Moto: " + getMarca() + " " + getModelo() + " - Velocidade: " + getVelocidade() + " km/h";
    }
}
