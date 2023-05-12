

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

    public void establecerTiempo(){
        //validate hour, minute and second

        if ((hour >= 0 && hour < 24)&&(minute >= 0 && minute < 60)&&( second>=0 && second < 60)){
            this.hour = hour;
            this.minute = minute;
            this.second= second;


        }else
            throw new IllegalArgumentException("hora, minuto y/o segundo estaban fuera de tiempo");
        //fin del método establecerTiempo


    }

    public String aStringUniversal(){
        return String.format("%d:%02d:%02d %s",( ( hour == 0 || hour == 12 ) ? 12 : hour % 12 ), minute, second, ( hour < 12 ? "AM" : "PM" ));

    }
    public void establecerValores(){

        do {
            System.out.println("Ingresa la hora:");
            hour = entrada.nextInt();
        }while ( (hour<=0 || hour>23) || (minute<0 || minute>59)||(second<0 || second>59) );

    }

    public void setHour() {

    }

}

