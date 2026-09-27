public class MaquinaAlgodon extends Maquina {
    private int potencia;

    public MaquinaAlgodon() {
        super();
        this.potencia = 0;
    }

    public MaquinaAlgodon(int codigo, String marca, String modelo, double tarifa, boolean disponibilidad, int diasSolicitados, int potencia) {
        super(codigo, marca, modelo, tarifa, disponibilidad, diasSolicitados);
        this.potencia = potencia;
    }

    @Override
    public double calcularTarifaFinal() {
        double total = super.calcularTarifaFinal();
        if (potencia > 1000) {
            total += 60.0;
        }
        return total;
    }

    public int getPotencia() { return potencia; }
    public void setPotencia(int potencia) { this.potencia = potencia; }

    @Override
    public String toString() {
        return super.toString() + " | Potencia: " + potencia + "W";
    }
}