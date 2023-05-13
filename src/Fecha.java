import java.util.Scanner;
import java.time.LocalDate;
public class Fecha {
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;
    private int second;
    private LocalDate fecha;

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
            
            do {
                System.out.println("Ingresa el día");
                this.day = entrada.nextInt();
                if (this.day<1 || this.day>29) System.out.println("Has ingresado un dato incorrecto");

            }while (this.day<1 || this.day>29);


        } else if (month==3 || month==6 || month==8 || month==10 || month==12) {
            do {
                System.out.println("Ingresa el día:");
                this.day = entrada.nextInt();
                if ((day<1 || day>30)){
                    System.out.println("Haz ingresado un valor incorrecto, intentalo de nuevo");
                }
            }while(day<1 || day>30);


        }else{
            do {

                System.out.println("Ingresa el día: ");

                this.day = entrada.nextInt();

                if (this.day<1 || this.day>31){
                    System.out.println("Has ingresado un valor incorrecto, intentalo de nuevo");
                }

            }while (this.day<1 || this.day>31);


        }


    }
    public void setHour(){
        do {
            System.out.println("Ingresa la hora: ");
            this.hour = entrada.nextInt();
            if(this.hour<0 || this.hour>59){

                System.out.println("Has ingresado un valor incorrecto, intentalo de nuevo: ");
            }
        }while(hour<1 || hour>23);


    }
    public void setMinute(){
        do {
            System.out.println("Ingresa los minutos: ");
            this.minute = entrada.nextInt();
            if(minute<0 || minute>59){

                System.out.println("Has ingresado un valor incorrecto, intentalo de nuevo: ");
            }
        }while(minute<1 || minute>59);


    }
    public void setSecond(){
        do {
            System.out.println("Ingresa los segundos: ");
            this.second = entrada.nextInt();
            if(second<0 || second>59){

                System.out.println("Has ingresado un valor incorrecto, intentalo de nuevo: ");
            }
        }while(second<0 || second>59);


    }
    public void formatoDeFecha(){
        String fechaFormateada = String.format("%d/%d/%d", this.year, this.month, this.day);
        System.out.println(fechaFormateada);
        String horaFormateada = String.format(" %d:%d:%d", this.hour, this.minute, this.second);
        System.out.println("horaFormateada = " + horaFormateada);
    }


}
