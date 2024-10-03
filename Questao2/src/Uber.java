public class Uber {
    private double distancia, tarifaBase, fatorDemanda;
    private int espera;

    public Uber(double distancia, double tarifaBase, double fatorDemanda, int espera) {
        this.distancia = distancia;
        this.tarifaBase = tarifaBase;
        this.fatorDemanda = fatorDemanda;
        this.espera = espera;
    }

    public double calcularCorrida() {
        double valorFinal = (distancia * 2) + (espera * 0.5) + tarifaBase * fatorDemanda;
        return valorFinal;
    }

    public void exibirDetalhes() {
        System.out.println("Distancia: " + distancia
        + "\nTempo de espera: " + espera
        + "\nTarifa base: " + tarifaBase
        + "\nDemanda: " + fatorDemanda
        + "\nValor final: " + calcularCorrida());
    }
}
