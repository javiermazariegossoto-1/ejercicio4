import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sistema sistema = new Sistema();
        
        sistema.maquinas.add(new MaquinaPalomitas(101, "Palomitas", "1", 100.0, true, 0, "150 porciones/h", true));
        sistema.maquinas.add(new MaquinaAlgodon(201, "Algodon", "1", 120.0, true, 0, 1200));
        sistema.maquinas.add(new MaquinaChocolate(301, "Chocolate", "1", 150.0, true, 0, 2.5));

        boolean salir = false;

        System.out.println("--- Bienvenido a Dulce Estación ---");
        
        while (!salir) {
            System.out.println("\n1. Ver inventario");
            System.out.println("2. Rentar máquina");
            System.out.println("3. Ver resumen");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            try {
                int opcion = Integer.parseInt(scanner.nextLine());
                
                switch (opcion) {
                    case 1:
                        for (Maquina m : sistema.maquinas) {
                            System.out.println(m.toString());
                        }
                        break;
                    case 2:
                        System.out.print("Ingrese el código de la máquina: ");
                        int codigo = Integer.parseInt(scanner.nextLine());
                        
                        if (sistema.comprobarDisponibilidad(codigo)) {
                            System.out.print("Ingrese los días a solicitar: ");
                            int dias = Integer.parseInt(scanner.nextLine());
                            if (dias > 0) {
                                sistema.rentarMaquina(codigo, dias);
                            } else {
                                System.out.println("Los días deben ser mayores a cero.");
                            }
                        } else {
                            System.out.println("Máquina no disponible o inexistente.");
                        }
                        break;
                    case 3:
                        System.out.println("Máquinas disponibles: " + sistema.totalDisponibles());
                        System.out.println("Máquinas rentadas: " + sistema.totalRentados());
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor ingrese un número válido entero sin letras ni símbolos.");
            } catch (Exception e) {
                System.out.println("Ocurrió un error inesperado. Intente de nuevo.");
            }
        }
        scanner.close();
    }
}