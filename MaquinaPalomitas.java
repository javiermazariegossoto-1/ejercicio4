public class MaquinaPalomitas extends Maquina {
    private String produccion;
    private boolean carrito;

    public MaquinaPalomitas() {
        super();
        this.produccion = "";
        this.carrito = false;
    }

    public MaquinaPalomitas(int codigo, String marca, String modelo, double tarifa, boolean disponibilidad, int diasSolicitados, String produccion, boolean carrito) {
        super(codigo, marca, modelo, tarifa, disponibilidad, diasSolicitados);
        this.produccion = produccion;
        this.carrito = carrito;
    }

    @Override
    public double calcularTarifaFinal() {
        double total = super.calcularTarifaFinal();
        if (carrito) {
            total += (40.0 * diasSolicitados);
        }
        return total;
    }

    public String getProduccion() { return produccion; }
    public void setProduccion(String produccion) { this.produccion = produccion; }
    public boolean getCarrito() { return carrito; }
    public void setCarrito(boolean carrito) { this.carrito = carrito; }

    @Override
    public String toString() {
        return super.toString() + " | Producción: " + produccion + " | Carrito: " + carrito;
    }
}