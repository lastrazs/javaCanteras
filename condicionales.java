import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;


public class condicionales {

    public static final Logger LOGGER = Logger.getLogger("");
    public static boolean stopApp = false;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        LOGGER.info("BIENVENIDO");
            showMenu(sc);
    }

    public static void  showMenu(Scanner sc){
        LOGGER.info("INGRESE EL # EJERCICIO QUE DESEA VISUALIZAR");
        int option =sc.nextInt();
        handleMenu(option, sc);
    }
    public static void handleMenu(int option, Scanner sc) {
        while (!stopApp) {
            switch (option) {
                case 1:
                    partyAge(sc);
                    break;
                case 2:
                    movieMenu(sc);
                    break;
                case 3:
                    drogueriaSuba(sc);
                    break;
                case 4:
                    maquinistaTaller(sc);
                    break;
                case 5:
                    imcCalculator(sc);
                    break;
                case 6:
                    pastelero(sc);
                    break;
                case 7:
                    geometry(sc);
                    break;
                case 8:
                    bancoFiel(sc);
                    break;
                case 9:
                    stopApp = true;
                    break;
                default:
                    LOGGER.info("OPCIÓN INVÁLIDA");
                    break;
            }
            if (!stopApp) {
                LOGGER.info("DESEA HACER OTRO EJERCICIO? (1. SÍ, 2. NO)");
                int optionC = sc.nextInt();
                if (optionC == 2) {
                    stopApp = true;
                } else {
                    LOGGER.info("INGRESE EL # EJERCICIO QUE DESEA VISUALIZAR");
                    option = sc.nextInt();
                }
            }
        }
    }
    
    public static void partyAge(Scanner sc){
        LOGGER.info("Age confirmation");
        LOGGER.info("INGRESE SU NOMBRE");
        String name = sc.next();
        LOGGER.info("INGRESE SU EDAD");
        int age = sc.nextInt();

        if (age > 18) {
            LOGGER.info(name + "USTED ES MAYOR DE EDAD, POR LO TANTO PUEDE ENTRAR A LA FIESTA");
        }else {
            LOGGER.info(name + "USTED ES MENOR DE EDAD VAYASE PARA SU CASA");
        }
    }
    public static void movieMenu(Scanner sc){
        LOGGER.info ("SELECCIONE UNA OPCION");
        LOGGER.info("1.ALQUILAR PELICULA");
        LOGGER.info("2.LISTAR PELICULA");
        LOGGER.info("3. RECIBIR PELICULA EN LA TIENDA");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                rentMovie(sc);
            case 2: {
                LOGGER.info("LAS PELICULAS DISPONIBLES SON: ");
                LOGGER.info("1.PARASYTE 2.MANINBLACK 3.INTERSTELLAR");
            }
            case 3: outMovie(sc);
        }

    }

    public static void rentMovie(Scanner sc){
        LOGGER.info("INGRESE SU NOMBRE DE USUARIO");
        String name = sc.next();
        LOGGER.info("SELECCIONE LA PELICULA QUE DESEA ALQUILAR:");
        LOGGER.info("1.PARASYTE 2.MANINBLACK 3.INTERSTELLAR");
        int movieOption = sc.nextInt();
        LOGGER.info("LA PELICULA "+ movieOption + "HA SIDO ALQUILADA POR EL USUARIO"+ name);
    }
    public static void  outMovie(Scanner sc){
        LOGGER.info("INGRESE EL NOMBRE DEL USUARIO");
        String name = sc.next();
        LOGGER.info("QUE PELICULA DESEA DEVOLVER?");
        LOGGER.info("1.PARASYTE 2.MANINBLACK 3.INTERSTELLAR");
        int movieOption = sc.nextInt();
        LOGGER.info("¿HA HABIDO ALGÚN DAÑO O NOVEDAD CON LA PELICULA?");
        LOGGER.info("INGRESE SUS ANOTACIONES");
        String anotaciones = sc.next();
    LOGGER.info("LA PELICULA #"+ movieOption+" HA SIDO DEVUELTA POR EL USUARIO "+ name +
            "CON LAS SIGUIENTE ANOTACION: " + anotaciones);

    }
    /**
     * @param sc
     */
    public static void drogueriaSuba(Scanner sc){
        LOGGER.info ("SELECCIONE UNA OPCION");
        LOGGER.info("1.COMPRAR PRODUCTO");
        LOGGER.info("2.CONSULTAR PRECIOS");
        LOGGER.info("3. REALIZAR DEVOLUCION");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                    buyProduct(sc);
            case 2: {
                LOGGER.info("LOS PRECIOS POR PRODUCTO SON: ");
                /* AQUI SE MOSTRARA UNA LISTA DEL PRECIO DE PRODUCTOS*/
            }
            case 3: {LOGGER.info("DEVOLUCIONES");
            LOGGER.info("INGRESE EL NOMBRE DEL CLIENTE");
            String name = sc.next();
            LOGGER.info("QUE PRODUCTO DESEA DEVOLVER?");
            String product = sc.next();
            LOGGER.info("CANTIDAD A DEVOLVER??");
            String cantidad = sc.next();
            LOGGER.info("INGRESA LOS COMENTARIOS ACERCA DE POR QUE LA DEVOLUCION");
            String comentarios = sc.next();
            LOGGER.info( name +" PRODUCTO DEVUELVO: "+ product + "CANTIDAD: "+ cantidad +
                    "COMENTARIOS: "+ comentarios  );
            }
        }
    }
    public static void buyProduct(Scanner sc){
        LOGGER.info("INGRESE EL NOMBRE DEL CLIENTE");
        String username = sc.next();
        LOGGER.info("INGRESE EL PRODUCTO A COMPRAR");
        String product = sc.next();
        LOGGER.info("CANTIDAD QUE DESEA COMPRAR:");
        int cantidad = sc.nextInt();
        LOGGER.info("EL PRECIO TOTAL ES DE $5000");
        LOGGER.info(username+" PRODUCTO COMPRADO: "+ product+" CANTIDAD: "+ cantidad +"PRECIO: 5000$");
    }
    public static void maquinistaTaller(Scanner sc){
        Map<String, String[]> servicios = new HashMap<String, String[]>();
        LOGGER.info ("SELECCIONE UNA OPCION");
        LOGGER.info("1.REGISTRAR SERVICIO");
        LOGGER.info("2.CONSULTAR SERVICIO");
        LOGGER.info("3.REGISTRAR SALIDA");
        String username = "";
        String placa = "";
        String fechaI = "";
        String observaciones = "";
        int option = sc.nextInt();

        switch (option) {
            case 1:{
                
            LOGGER.info("INGRESE EL NOMBRE DEL CLIENTE:");
                username = sc.next();
            LOGGER.info("INGRESE LA PLACA DE LA MOTOCICLETA");
                placa = sc.next();
            LOGGER.info("INGRESE LA FECHA DE INGRESO");
                fechaI = sc.next();
            LOGGER.info("INGRESE OBSERVACIONES");
                observaciones = sc.next();
            LOGGER.info("REGISTRO DE SERVICIO PARA: "+ username + "CON LA MOTO IDENTIFICADA CON: "+ placa 
            + "EN FECHA:" + fechaI + "CON LAS SIGUIENTES OBSERVACIONES: " + observaciones);
            String[] servicio = new String[]{username, fechaI, observaciones};
            servicios.put(placa, servicio);
            }
            case 2: {
                LOGGER.info("INGRESE EL NUMERO DE LA PLACA");
                String placaOp =sc.next();
                String[] servicio = servicios.get(placaOp);
                    LOGGER.info("SERVICIOS ENCONTRADOS PARA LA PLACA: " + placaOp);
                    LOGGER.info("CLIENTE: "+ servicio[0]);
                    LOGGER.info("FECHA DE INGRESO: "+ servicio[1]);
                    LOGGER.info("OBSERVACIONES: "+ servicio[2]);


            }
            case 3: {LOGGER.info("DEVOLUCIONES");
               LOGGER.info("REGISTRAR SALIDA PARA EL CLIENTE #1,#2,#3,#4,#5 ?");
               int exitClient = sc.nextInt();
               LOGGER.info("EL CLIENTE #"+ exitClient + "HA SALIDO DEL TALLER");

            }
        }
    }
    public static void imcCalculator(Scanner sc){
        LOGGER.info("INGRESE SU NOMBRE");
        String name = sc.next();
        LOGGER.info("INGRESE SU PESO:");
        float weight = sc.nextFloat();
        LOGGER.info("INGRESE SU ALTURA");
        float height = sc.nextFloat();
        float imc = weight/(height*height);
        LOGGER.info("SU INDICE DE MASA CORPORAL ES: "+ imc);
        if(imc<18){
            LOGGER.info( name+" BAJO DE PESO");
        }else if (imc >= 18.5 && imc<= 24){
            LOGGER.info( name+" PESO NORMAL");
        }else if (imc >= 25 && imc <= 30){
            LOGGER.info( name+" SOBREPESO");
        }else{
            LOGGER.info( name+" OBESO");
        }
    }
    public static void pastelero(Scanner sc){
        LOGGER.info("BIENVENIDO A LA PASTELERIA");
        LOGGER.info("1. REGISTRAR UN PEDIDO");
        LOGGER.info("2.INVENTARIO");
        LOGGER.info("3.VENTAS DE HOY");
        int option = sc.nextInt();
        switch(option){
            case 1:{
                LOGGER.info("INGRESE SU NOMBRE");
                String name = sc.next();
                LOGGER.info("INGRESE EL SABOR DE PREFERENCIA");
                String flavor = sc.next();
                LOGGER.info("INDIQUE EL TAMAÑO DE LA TORTA");
                String width = sc.next();
                switch (width) {
                    case "mediano":
                        int price = 10;
                        LOGGER.info("EL PRECIO DEL PASTEL ES "+price+"$  Y TRAE 10 PORCIONES");
                        
                    case "pequeño":
                        LOGGER.info("");
                
                    default:
                }
            }
            case 2:{
                LOGGER.info("LAS TORTAS DISPONIBLES SON: ");
                LOGGER.info("Medianas de chocolate:0");
                LOGGER.info("pequeñas de chocolate:5");
                LOGGER.info("grandes de chocolate:20");
                LOGGER.info("pequeñas de zanahoria:0");
                LOGGER.info("medianas de zanahoria:0");
                LOGGER.info("Grandes de zanahoria:1");
                LOGGER.info("Pequeñas red velvet: 2");
                LOGGER.info("Medianas redvelvet:3");
                LOGGER.info("Grandes red velvet:1");
                LOGGER.info("Tortas medianas envinadas:3");

            }
            case 3:{
                LOGGER.info("AQUI SE MOSTRARAN LAS VENTAS DEL DIA.");
            }
        }
    }
    public static void geometry(Scanner sc){
        LOGGER.info("BIENVENIDO, QUE OPERACION DESEA REALIZAR");
        LOGGER.info("1. AREA RECTANGULO");
        LOGGER.info("2. AREA TRIANGULO");
        LOGGER.info("3. AREA TRAPECIO");
        int option = sc.nextInt();
        switch(option){
            case 1:{
                LOGGER.info("INGRESE LA BASE");
                int base = sc.nextInt();
                LOGGER.info("INGRESE LA ALTURA");
                int altura = sc.nextInt();
                int area = base*altura;
                LOGGER.info("EL AREA DEL RECTANGULO ES: "+ area);
            }
            case 2:{
                LOGGER.info("INGRESE LA BASE");
                int base = sc.nextInt();
                LOGGER.info("INGRESE LA ALTURA");
                int altura = sc.nextInt();
                int area = (base*altura)/2;
                LOGGER.info("EL AREA DEL TRIANGULO ES: "+ area);
            }
            case 3:{
                LOGGER.info("INGRESE LA BASE MAYOR");
                int baseM = sc.nextInt();
                LOGGER.info("INGRESE LA BASE MENOR");
                int basem = sc.nextInt();
                LOGGER.info("INGRESE LA ALTURA");
                int altura = sc.nextInt();
                int area = ((baseM + basem)*altura)/2;
                LOGGER.info("EL AREA DEL TRAPECIO ES: "+ area);
            }
        }
    }
    public static void bancoFiel(Scanner sc) {
        LOGGER.info("BIENVENIDO AL BANCO");
        LOGGER.info("SELECCINA UNA OPCION");
        LOGGER.info("1.INGRESAR DINERO");
        LOGGER.info("2.RETIRAR DINERO");
        LOGGER.info("3.VER SALDO DISPONIBLE");
        int option = sc.nextInt();
        int cuenta = 180000;
        switch (option){
            case 1: 
                LOGGER.info("QUE VALOR DESEA INGRESAR: ");
                    int monto = sc.nextInt();
                    if (monto>0){
                        LOGGER.info("NO SE PUEDE INGRESAR VALORES NEGATIVOS");
                    }else{
                        LOGGER.info("TRANSFERENCIA REALIZADA");
                    }
            case 2:{
                LOGGER.info("CUANTO DESEA RETIRAR");
                monto = sc.nextInt();
                if(monto<cuenta){
                    LOGGER.info("EL VALOR A RETIRAR ES MAYOR QUE LO DISPONIBLE");
                }else{
                    cuenta = cuenta - monto;
                    LOGGER.info("EL VALOR DE LA CUENTA SE HA ACTUALIZADO" + cuenta);
                }
            }
                
        }
    }
    
}
