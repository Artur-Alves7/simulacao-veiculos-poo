public class Garagem {
    private Veiculo[] veiculos;
    private int quantidade;

    public Garagem(int capacidade) {
        this.veiculos = new Veiculo[capacidade];
        this.quantidade = 0;
    }

    public void estacionar(Carro c) {
        if (quantidade >= veiculos.length) {
            System.out.println("Garagem cheia! Nao e possivel estacionar o carro " + c.getModelo() + ".");
            return;
        }
        veiculos[quantidade] = c;
        quantidade++;
        System.out.println("Carro " + c.getMarca() + " " + c.getModelo() + " estacionado com sucesso.");
    }

    public void estacionar(Moto m) {
        if (quantidade >= veiculos.length) {
            System.out.println("Garagem cheia! Nao e possivel estacionar a moto " + m.getModelo() + ".");
            return;
        }
        veiculos[quantidade] = m;
        quantidade++;
        System.out.println("Moto " + m.getMarca() + " " + m.getModelo() + " estacionada com sucesso.");
    }

    public void listarVeiculos() {
        if (quantidade == 0) {
            System.out.println("Garagem vazia.");
            return;
        }
        System.out.println("Veiculos na garagem (" + quantidade + "/" + veiculos.length + "):");
        for (int i = 0; i < quantidade; i++) {
            System.out.println("  " + (i + 1) + ". " + veiculos[i]);
        }
    }
}
