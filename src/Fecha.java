import java.util.Scanner;

public class Fecha {
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;
    private int second;

    Scanner entrada = new Scanner(System.in);
    public void setYear() {
        do {
            System.out.println("Ingresa el anio de creación del auto: ");
            this.year = entrada.nextInt();
            if(this.year<1886 || this.year>2023){
                System.out.println("Has ingresado un anio incorrecto");
            }
        }while (this.year<1886 || this.year>2023);
    }
    public void setMonth(){
    do {
        System.out.println("Ingresa el mes: ");
        this.month = entrada.nextInt();
        if(month<1 || month>12){
            System.out.println("Has ingresado un mes incorrecto, intentalo de nuevo: ");
        }
    }while(month<1 || month>12);
    }
    public void setDay(){

        if(month==2){
            
            


        } else if (month==3 || month==6 || month==8 || month==10 || month==12) {
            do {
                System.out.println("Ingresa el día:");
                if ((day<1 || day>30)){
                    System.out.println("Haz ingresado un valor incorrecto, intentalo de nuevo");
                }
            }while(day<1 || day>30);


        }


    }

}
