public class MaquinaChocolate extends Maquina {
    private double capacidadMaxima;

    public MaquinaChocolate() {
        super();
        this.capacidadMaxima = 0.0;
    }

    public MaquinaChocolate(int codigo, String marca, String modelo, double tarifa, boolean disponibilidad, int diasSolicitados, double capacidadMaxima) {
        super(codigo, marca, modelo, tarifa, disponibilidad, diasSolicitados);
        this.capacidadMaxima = capacidadMaxima;
    }

    @Override
    public double calcularTarifaFinal() {
        double total = super.calcularTarifaFinal();
        total += (20.0 * capacidadMaxima * diasSolicitados);
        return total;
    }

    public double getCapacidadMaxima() { return capacidadMaxima; }
    public void setCapacidadMaxima(double capacidadMaxima) { this.capacidadMaxima = capacidadMaxima; }

    @Override
    public String toString() {
        return super.toString() + " | Capacidad: " + capacidadMaxima + "kg";
    }
}