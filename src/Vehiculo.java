

import java.util.Scanner;


public class Vehiculo {

    //Declaración de atributos
    private String marca;
    private String modelo;
    private int fechaFabricacion;
    private int velMax;
    private int velActual;
    private int hour;
    private int minute;
    private int second;

    Scanner entrada = new Scanner(System.in);

    public void establecerDatos(){
        System.out.println("Agencia de vehiculos:");
        System.out.println(" ");
        System.out.println("Ingresa la marca: ");
        this.marca = entrada.nextLine();
        System.out.println("Ingresa el modelo: ");
        this.modelo= entrada.nextLine();
        System.out.println("Ingresa el año de fabricación: ");
        this.fechaFabricacion = entrada.nextInt();
        System.out.println("Ingresa la velocidad máxima: ");
        this.velMax = entrada.nextInt();
        System.out.println("Ingresa la velocidad actual: ");
        this.velActual = entrada.nextInt();
    }
    public void mostrarDatos(){

        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Año de fabricación: "+this.fechaFabricacion);
        System.out.println("Velocidad Máxima: "+this.velMax);
        System.out.println("Velocidad Actual: "+this.velActual);

    }
    public void acelerarVehiculo(){
        System.out.println("La velocidad actual es de "+ velActual);
        System.out.println("Ingresa la velocidad que quieres incrementar: ");
        int velocidadAgregada = entrada.nextInt();
        if(velActual>velMax){
            System.out.println("No puede acelerar más ha llegado a la velocidad máxima.");
        }else{
            System.out.println("La velocidad actual es de "+ (velActual+velocidadAgregada));
        }


    }
    public void frenarVehiculo(){
        System.out.println("El auto se esta frenando...");
        System.out.println(" ");
        velActual = 0;
        System.out.println("La velocidad ahora es de 0");

    }







}

