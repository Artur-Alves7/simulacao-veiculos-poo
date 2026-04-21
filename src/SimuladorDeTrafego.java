public class SimuladorDeTrafego {
    private Veiculo[] pista;
    private int quantidade;

    public SimuladorDeTrafego(int capacidade) {
        this.pista = new Veiculo[capacidade];
        this.quantidade = 0;
    }

    public void adicionarVeiculo(Veiculo v) {
        if (quantidade >= pista.length) {
            System.out.println("Pista cheia! Nao e possivel adicionar " + v.getMarca() + " " + v.getModelo() + ".");
            return;
        }
        pista[quantidade] = v;
        quantidade++;
        System.out.println(v.getMarca() + " " + v.getModelo() + " adicionado a pista.");
    }

    public void iniciarSimulacao() {
        System.out.println("\n--- Iniciando simulacao ---");
        for (int i = 0; i < quantidade; i++) {
            pista[i].ligar();
            pista[i].acelerar();
            pista[i].acelerar(20);
        }
    }

    public void simularInteracoes() {
        System.out.println("\n--- Simulando interacoes entre veiculos ---");
        for (int i = 0; i < quantidade; i++) {
            for (int j = i + 1; j < quantidade; j++) {
                if (pista[j] instanceof Caminhao) {
                    pista[i].interagir((Caminhao) pista[j]);
                } else {
                    pista[i].interagir(pista[j]);
                }
            }
        }
    }

    public void exibirPista() {
        System.out.println("\n--- Estado atual da pista ---");
        if (quantidade == 0) {
            System.out.println("Nenhum veiculo na pista.");
            return;
        }
        for (int i = 0; i < quantidade; i++) {
            pista[i].exibirStatus();
        }
    }

    public void compararVeiculos(int indiceA, int indiceB) {
        if (indiceA < 0 || indiceA >= quantidade || indiceB < 0 || indiceB >= quantidade) {
            System.out.println("Indices invalidos para comparacao.");
            return;
        }
        if (pista[indiceA].equals(pista[indiceB])) {
            System.out.println(pista[indiceA].getModelo() + " e " + pista[indiceB].getModelo()
                    + " sao o mesmo veiculo (mesma placa).");
        } else {
            System.out.println(pista[indiceA].getModelo() + " e " + pista[indiceB].getModelo()
                    + " sao veiculos diferentes.");
        }
    }
}
