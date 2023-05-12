import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Coche coche1 = new Coche();
        Vehiculo v1 = new Vehiculo();
        System.out.println("Ingresa la hora de creación: ");
        v1.establecerTiempo(1,2,3);
        System.out.println("Creación:"+ v1.aStringUniversal());
        coche1.establecerDatos();
        coche1.mostrarDatos();
        int eleccion;

        do{
            System.out.println("\nAcciones del vehiculo:"
                    + "\n1) Acelerar el vehiculo"
                    + "\n2) Frenar el vehiculo"
                    + "\n3) Salir del simulador");
            eleccion = entrada.nextInt();
            switch(eleccion){

                case 1:
                    coche1.acelerarVehiculo();
                    break;
                case 2:
                    coche1.frenarVehiculo();
                    break;
                case 3:
                    System.oimport java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Coche coche1 = new Coche();
        Vehiculo v1 = new Vehiculo();
        System.out.println("Ingresa la hora de creación: ");
        v1.establecerTiempo(1,2,3);
        System.out.println("Creación:"+ v1.aStringUniversal());
        coche1.establecerDatos();
        coche1.mostrarDatos();
        int eleccion;

        do{
            System.out.println("\nAcciones del vehiculo:"
                    + "\n1) Acelerar el vehiculo"
                    + "\n2) Frenar el vehiculo"
                    + "\n3) Salir del simulador");
            eleccion = entrada.nextInt();
            switch(eleccion){

                case 1:
                    coche1.acelerarVehiculo();
                    break;
                case 2:
                    coche1.frenarVehiculo();
                    break;
                case 3:
                    System.out.println("Has salido del simulador");
                    break;
                default:
                    System.out.println("Algo salió mal");
                    break;

            }
        }while(eleccion!=3);
    }}

ut.println("Has salido del simulador");
                    break;
                default:
                    System.out.println("Algo salió mal");
                    break;

            }
        }while(eleccion!=3);
    }}

