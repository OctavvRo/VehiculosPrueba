


public class Coche extends Vehiculo{
    private int cantidadPuertas;

    @Override
    public void establecerDatos() {
        super.establecerDatos();
        System.out.println("Ingresa la cantidad de puertas: ");
        cantidadPuertas = entrada.nextInt();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Cantidad puertas: "+ cantidadPuertas);
    }

    @Override
    public void acelerarVehiculo() {
        super.acelerarVehiculo();
    }

    @Override
    public void frenarVehiculo() {
        super.frenarVehiculo();
    }

}
