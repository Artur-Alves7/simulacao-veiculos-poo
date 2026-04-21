public class Main {

    public static void main(String[] args) {

        System.out.println("========== PARTE 1: O Primeiro Motor ==========\n");

        Carro carro1 = new Carro("Toyota", "Corolla", "ABC-1234");
        Carro carro2 = new Carro("Honda", "Civic", "DEF-5678", 30);

        carro1.abastecer(50);
        carro2.abastecer(40);

        carro1.acelerar();
        carro1.acelerar(20);
        carro1.frear();
        System.out.println(carro1);

        carro2.acelerar(15);
        carro2.frear(5);
        System.out.println(carro2);

        System.out.println();
        Garagem garagem = new Garagem(4);
        garagem.estacionar(carro1);
        garagem.estacionar(carro2);
        garagem.listarVeiculos();

        System.out.println("\n========== PARTE 2: A Frota Diversificada ==========\n");

        Moto moto1 = new Moto("Yamaha", "MT-07", "GHI-9012", 600);
        Moto moto2 = new Moto("Honda", "CB 500", "JKL-3456");

        moto1.abastecer(20, "Gasolina");
        moto2.abastecer(15);

        moto1.acelerar();
        moto1.acelerar(30);
        System.out.println(moto1);

        System.out.println();
        carro1.ligar("Economico");
        moto1.ligar("Esportivo");

        System.out.println();
        garagem.estacionar(moto1);
        garagem.estacionar(moto2);
        garagem.listarVeiculos();

        System.out.println();
        carro1.exibirStatus();
        moto1.exibirStatus();

        System.out.println("\n========== PARTE 3: O Simulador de Trafego ==========\n");

        Caminhao caminhao1 = new Caminhao("Volvo", "FH 460", "MNO-7890", 12000);
        caminhao1.abastecer(200, "Diesel");

        SimuladorDeTrafego simulador = new SimuladorDeTrafego(5);
        simulador.adicionarVeiculo(carro1);
        simulador.adicionarVeiculo(moto1);
        simulador.adicionarVeiculo(caminhao1);

        simulador.iniciarSimulacao();
        simulador.simularInteracoes();
        simulador.exibirPista();

        System.out.println("\n--- Consumo por km ---");
        System.out.println("Carro:    " + carro1.calcularConsumo() + " L/km");
        System.out.println("Moto:     " + moto1.calcularConsumo() + " L/km");
        System.out.println("Caminhao: " + caminhao1.calcularConsumo() + " L/km");

        System.out.println("\n--- Comparacao por placa (equals e hashCode) ---");
        Carro carroMesmaPlaca = new Carro("Ford", "Ka", "ABC-1234");
        System.out.println("carro1 placa: " + carro1.getPlaca() + " | carroMesmaPlaca placa: " + carroMesmaPlaca.getPlaca());
        System.out.println("carro1.equals(carroMesmaPlaca): " + carro1.equals(carroMesmaPlaca));
        System.out.println("carro1.equals(carro2): " + carro1.equals(carro2));

        simulador.compararVeiculos(0, 1);

        System.out.println("\n--- Teste de robustez: veiculo sem combustivel ---");
        Carro carroSemCombustivel = new Carro("Fiat", "Uno", "ZZZ-0000");
        carroSemCombustivel.acelerar();
        carroSemCombustivel.acelerar(50);

        System.out.println("\n--- Teste de robustez: pista cheia ---");
        SimuladorDeTrafego pistaPequena = new SimuladorDeTrafego(1);
        pistaPequena.adicionarVeiculo(carro1);
        pistaPequena.adicionarVeiculo(moto1);
    }
}
