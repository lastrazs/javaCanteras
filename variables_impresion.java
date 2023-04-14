import java.util.Scanner;
import java.util.logging.Logger;

public class variables_impresion {
    public static final Logger LOGGER = Logger.getLogger("");
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            LOGGER.info("BIENVENIDO");
            LOGGER.info("INGRESE SU NOMBRE");
            String name = sc.next();
            LOGGER.info("INGRESE SU APELLIDO");
            String lastName = sc.next();
            LOGGER.info("INGRESE SU EDAD");
            int age = sc.nextInt();
            LOGGER.info("INGRESE EL NOMBRE DE SU PADRE");
            String father = sc.next();
            LOGGER.info("INGRESE EL NOMBRE DE SU MADRE");
            String mother = sc.next();
            LOGGER.info("INGRESE SU PAIS DE RESIDENCIA");
            String country = sc.next();
            LOGGER.info("INGRESE SU CIUDAD DE RESIDENCIA");
            String city = sc.next();
            LOGGER.info("TIENE UNA MASCOTA??");
            LOGGER.info("0. SI 1. NO");
            int petCondition = sc.nextInt();
            if (petCondition == 0){
                LOGGER.info("QUE TIPO DE MASCOTA TIENE?");
                String petType = sc.next();
                LOGGER.info("INGRESE EL NOMBRE DE SU MASCOTA");
                String petName = sc.next();
                LOGGER.info("INGRESE LA EDAD DE SU MASCOTA");
                int petAge = sc.nextInt();
                LOGGER.info("YO " + name +" "+ lastName + " TENGO "+ age+ " AÑOS, Y "+
                        " SOY HIJO DE: "+ father + " Y "+ mother + " VIVO EN: "+ country +" "+ city+
                        " Y TENGO UNA MASCOTA QUE ES UN: " +petType + " SE LLAMA "+ petName+"Y TIENE "+ petAge+ " AÑOS");
            }else {
                LOGGER.info("YO " + name +" "+ lastName + " TENGO "+ age+ " AÑOS, Y "+
                        " SOY HIJO DE: "+ father + " Y "+ mother + " VIVO EN: "+ country +" "+ city+" Y NO TENGO UNA MASCOTA");
            }
        }

    }

}