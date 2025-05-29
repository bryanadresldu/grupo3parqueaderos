import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Registrar Auto");
            System.out.println("2. Registrar Camioneta");
            System.out.println("3. Registrar Camioneta 4x4");
            System.out.println("4. Mostrar Tarifas");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            op = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (op) {
                case 1:
                    System.out.print("Ingrese placa: ");
                    String placaA = sc.nextLine();
                    Auto a = new Auto(placaA);
                    a.registrarEntrada(placaA);
                    lista.add(a);
                    break;

                case 2:
                    System.out.print("Ingrese placa: ");
                    String placaC = sc.nextLine();
                    Camioneta c = new Camioneta(placaC);
                    c.registrarEntrada(placaC, "10:00 AM");
                    lista.add(c);
                    break;

                case 3:
                    System.out.print("Ingrese placa: ");
                    String placa4x4 = sc.nextLine();
                    Camioneta4x4 c4x4 = new Camioneta4x4(placa4x4);
                    c4x4.registrarEntrada();
                    lista.add(c4x4);
                    break;

                case 4:
                    System.out.println("\n--- Tarifas ---");
                    for (Vehiculo v : lista) {
                        System.out.println("Placa: " + v.getPlaca() + " | Tarifa diaria: $" + v.tarifaDiaria());
                    }
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (op != 5);
    }


}