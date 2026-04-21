public class Veiculo {
    private String marca;
    private String modelo;
    private int velocidade;
    private double combustivel;
    private String placa;

    public Veiculo(String marca, String modelo, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.velocidade = 0;
        this.combustivel = 0;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getVelocidade() { return velocidade; }
    public void setVelocidade(int velocidade) { this.velocidade = velocidade; }

    public double getCombustivel() { return combustivel; }
    public void setCombustivel(double combustivel) { this.combustivel = combustivel; }

    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public void acelerar() {
        if (combustivel <= 0) {
            System.out.println("Sem combustivel! Abasteca o veiculo antes de acelerar.");
            return;
        }
        velocidade += 10;
    }

    public void acelerar(int incremento) {
        if (combustivel <= 0) {
            System.out.println("Sem combustivel! Abasteca o veiculo antes de acelerar.");
            return;
        }
        velocidade += incremento;
    }

    public void frear() {
        velocidade -= 10;
        if (velocidade < 0) velocidade = 0;
    }

    public void frear(int decremento) {
        velocidade -= decremento;
        if (velocidade < 0) velocidade = 0;
    }

    public void ligar() {
        System.out.println(marca + " " + modelo + " ligado.");
    }

    public void ligar(String modo) {
        System.out.println(marca + " " + modelo + " ligado no modo " + modo + ".");
    }

    public void exibirStatus() {
        System.out.println("Veiculo: " + marca + " " + modelo
                + " | Velocidade: " + velocidade + " km/h"
                + " | Combustivel: " + combustivel + "L"
                + " | Placa: " + placa);
    }

    public void interagir(Veiculo outro) {
        System.out.println(marca + " " + modelo + " interagiu com "
                + outro.getMarca() + " " + outro.getModelo() + ".");
    }

    public void interagir(Caminhao c) {
        if (this.velocidade > c.getVelocidade()) {
            System.out.println(marca + " " + modelo + " ultrapassou o caminhao "
                    + c.getMarca() + " " + c.getModelo() + ".");
        } else {
            System.out.println(marca + " " + modelo + " nao conseguiu ultrapassar o caminhao "
                    + c.getMarca() + " " + c.getModelo() + ". Risco de colisao!");
        }
    }

    public void abastecer(double litros) {
        combustivel += litros;
        System.out.println(marca + " " + modelo + " abastecido com " + litros + "L. Total: " + combustivel + "L");
    }

    public void abastecer(double litros, String tipoCombustivel) {
        combustivel += litros;
        System.out.println(marca + " " + modelo + " abastecido com " + litros + "L de "
                + tipoCombustivel + ". Total: " + combustivel + "L");
    }

    public double calcularConsumo() {
        return 0.10;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Veiculo)) return false;
        Veiculo outro = (Veiculo) obj;
        return this.placa.equals(outro.placa);
    }

    @Override
    public int hashCode() {
        return placa.hashCode();
    }

    @Override
    public String toString() {
        return "Veiculo: " + marca + " " + modelo + " - Velocidade: " + velocidade + " km/h";
    }
}
