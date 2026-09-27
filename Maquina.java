public abstract class Maquina {
    protected int codigo;
    protected String marca;
    protected String modelo;
    protected double tarifa;
    protected boolean disponibilidad;
    protected int diasSolicitados;

    public Maquina() {
        this.codigo = 0;
        this.marca = "";
        this.modelo = "";
        this.tarifa = 0.0;
        this.disponibilidad = true;
        this.diasSolicitados = 0;
    }

    public Maquina(int codigo, String marca, String modelo, double tarifa, boolean disponibilidad, int diasSolicitados) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.tarifa = tarifa;
        this.disponibilidad = disponibilidad;
        this.diasSolicitados = diasSolicitados;
    }

    public double calcularTarifaFinal() {
        return tarifa * diasSolicitados;
    }

    public String fichaDatos() {
        return "Código: " + codigo + " | " + marca + " " + modelo + " | Tarifa diaria: Q" + tarifa + " | Disponible: " + disponibilidad;
    }

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public double getTarifa() { return tarifa; }
    public void setTarifa(double tarifa) { this.tarifa = tarifa; }
    public boolean getDisponibilidad() { return disponibilidad; }
    public void setDisponibilidad(boolean disponibilidad) { this.disponibilidad = disponibilidad; }
    public int getDiasSolicitados() { return diasSolicitados; }
    public void setDiasSolicitados(int diasSolicitados) { this.diasSolicitados = diasSolicitados; }

    @Override
    public String toString() {
        return fichaDatos();
    }
}