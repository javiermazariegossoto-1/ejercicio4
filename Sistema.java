import java.util.ArrayList;

public class Sistema {
    private String cliente;
    public ArrayList<Maquina> maquinas;

    public Sistema() {
        this.cliente = "";
        this.maquinas = new ArrayList<>();
    }

    public Sistema(String cliente) {
        this.cliente = cliente;
        this.maquinas = new ArrayList<>();
    }

    public boolean comprobarDisponibilidad(int codigo) {
        for (Maquina m : maquinas) {
            if (m.getCodigo() == codigo) {
                return m.getDisponibilidad();
            }
        }
        return false;
    }

    public void rentarMaquina(int codigo, int dias) {
        for (Maquina m : maquinas) {    
            if (m.getCodigo() == codigo && m.getDisponibilidad()) {
                m.setDisponibilidad(false);
                m.setDiasSolicitados(dias);
                System.out.println("Máquina rentada con éxito. Total a pagar: Q" + String.format("%.2f", m.calcularTarifaFinal()));
                return;
            }
        }
        System.out.println("La máquina no existe o no está disponible.");
    }

    public int totalRentados() {
        int contador = 0;
        for (Maquina m : maquinas) {
            if (!m.getDisponibilidad()) contador++;
        }
        return contador;
    }

    public int totalDisponibles() {
        int contador = 0;
        for (Maquina m : maquinas) {
            if (m.getDisponibilidad()) contador++;
        }
        return contador;
    }

    public String getCliente() { return cliente; }
    public void setCliente(String cliente) { this.cliente = cliente; }

    @Override
    public String toString() {
        return "Sistema operando para el cliente: " + cliente + " | Máquinas registradas: " + maquinas.size();
    }
}