import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class ciclos {
   public static final Logger LOGGER = Logger.getLogger("");
   static ArrayList<Park> parqueadero = new ArrayList<>();
   public static boolean stopApp = false;
   static ArrayList<Contact> contacts = new ArrayList<>();
   static ArrayList<User> users = new ArrayList<>();
   public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         LOGGER.info("BIENVENIDO");
         showMenu(sc);
    }
    public static void showMenu(Scanner sc){
      LOGGER.info("INGRESE EL NUMERO DEL EJERCICIO QUE DESEA VISUALIZAR");
      int option = sc.nextInt();
      handleMenu(option, sc);
    }
    public static void handleMenu(int option, Scanner sc){
      while (!stopApp){
         switch(option){
          case 1: piramide1(sc);
          break;
          case 2: piramide2(sc);
          break;
          case 3: tablamultiplicar(sc);
          break;
          case 4: menuOption(sc);
          break;
          case 5: contactApp(sc,contacts);
          break;
          case 6: parqueadero(sc, parqueadero);
          break;
          case 7: elMaestro(users, sc);
         }
      }
    }
    public static void piramide1(Scanner sc) {
          int filas = 10;
          for (int i = 0; i < filas; i++) {
              for (int j = 0; j <= i; j++) {
                  System.out.print("*");
              }
              System.out.println();
      }
  }
  public static void piramide2(Scanner sc){
    int filas = 10;

        for (int i = 0; i < filas; i++) {

            // Imprimir espacios en blanco
            for (int j = 0; j < filas - i - 1; j++) {
                System.out.print(" ");
            }

            // Imprimir asteriscos
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void tablamultiplicar(Scanner sc){
        for (int i = 1; i<=10; i++) {
            for (int j = 1; j <=10; j++){
            System.out.println(i+ " x "+ j+" = "+ i*j);
        }
    }
    System.out.println(" ");
}
public static void menuOption(Scanner sc){
    String name = "";
    boolean stopApp = false;
    System.out.println("MENU DE USUARIO");
    System.out.println("1.CAPTURA NOMBRE");
    System.out.println("2.SALUDAR PERSONA");
    System.out.println("3.SALIR DEL SISTEMA");
    while (!stopApp)
    try{
        int option = sc.nextInt();
        sc.nextLine();
    switch (option){
        case 1:{
            System.out.println("INGRESE SU NOMBRE");
            name= sc.nextLine();
        }break;
        case 2:{
            if(name.isEmpty()){
                System.out.println("NO HAS INGRESADO NOMBRE");
            }else{
                System.out.println("HOLA "+ name + ".");
            }
        }break; 
        case 3: stopApp= true;
        break;
        default:
        System.out.println("OPCION INVALIDA");
    }
    System.out.println("\033[H\033[2J");
        }catch(InputMismatchException e){
            System.out.println("INGRESA UN NUMERo");
                sc.next();
                }
        }
    public static void contactApp(Scanner sc, ArrayList<Contact> contacts){
        System.out.println("BIENVENIDO");
        while(!stopApp){
        System.out.println("ELIJA UNA OPCIÓN");
        System.out.println("1. AGREGAR CONTACTO");
        System.out.println("2. BUSCAR CONTACTO");;
        System.out.println("3. ELIMINAR CONTACTO");;
        System.out.println("4. SALIR");;
        int option = sc.nextInt();
        sc.nextLine();
        switch (option){
            case 1:
            addContact(sc, contacts);
            break;
            case 2:
            searchContact(sc, contacts);
            break;
            case 3:
            removeContact(sc, contacts);
            break;
            case 4: stopApp= true;
            System.out.println("ADIOS");
            break;
            default:
            System.out.println("OPCION INVALIDA");

        }
    }
        System.out.println("ADIOS");
  }
     public static void addContact(Scanner sc, ArrayList<Contact> contacts){
    System.out.println("INGRESE EL NOMBRE");
    String name = sc.nextLine();
    System.out.println("INGRESE EL NUMEOR DE TELEFONO");
    String number = sc.nextLine();
    System.out.println("INGRESE LA EMPRESA");
    String company = sc.nextLine();
    if (contactExists(name, contacts)){
        System.out.println("EL CONTACTO YA EXISTE");
        return;
    }
    Contact contact = new Contact(name, number, company);
    contacts.add(contact);
    System.out.println("EL CONTACTO HA SIDO AGREGADO CON EXITO");
    printContactList(contacts);
  }
  private static void searchContact(Scanner sc, ArrayList<Contact> contacts){
    System.out.println("INGRESE EL NOMBRE DEL CONTACTO QUE DESEA BUSCAR");
    String name = sc.nextLine();

    for (Contact contact : contacts){
        if (contact.getName().equals(name)){
            System.out.println("INFORMACION DEL CONTACTO: ");
            printContactInfo(contact);
            return;
        }
    }
    System.out.println("EL CONTACTO NO EXISTE");
  }
private static void removeContact(Scanner scanner, ArrayList<Contact> contacts) {
    // Pedimos el nombre del contacto a eliminar
    System.out.println("Ingrese el nombre del contacto que desea eliminar:");
    String name = scanner.nextLine();

    // Buscamos el contacto en la lista
    for (Contact contact : contacts) {
        if (contact.getName().equals(name)) {
            // Eliminamos el contacto de la lista
            contacts.remove(contact);
            System.out.println("El contacto ha sido eliminado de la lista de contactos.");
            printContactList(contacts);
            return;
        }
    }

    // Si no se encontró el contacto, mostramos un mensaje
    System.out.println("El contacto no se encontró en la lista de contactos.");
}

private static boolean contactExists(String name, ArrayList<Contact> contacts) {
    // Verificamos si existe un contacto con el mismo nombre en la lista
    for (Contact contact : contacts) {
        if (contact.getName().equals(name)) {
            return true;
        }
    }
    return false;
}

private static void printContactList(ArrayList<Contact> contacts) {
    // Mostramos la lista de contactos actual
    if (contacts.isEmpty()) {
        System.out.println("La lista de contactos está vacía.");
    } else {
        System.out.println("Lista de contactos:");
        for (Contact contact : contacts) {
            System.out.println("- " + contact.getName());
        }
    }
}

private static void printContactInfo(Contact contact) {
    // Mostramos la información del contacto dado
    System.out.println("- Nombre: " + contact.getName());
    System.out.println("- Teléfono: " + contact.getNumber());
    System.out.println("- Empresa: " + contact.getCompany());
}
public static void parqueadero(Scanner sc, ArrayList<Park> parqueadero){
           while(!stopApp){
           System.out.println("BIENVENIDO");
           System.out.println("1. INGRESAR VEHICULO");
           System.out.println("2. LISTAR VEHICULOS");
           System.out.println("3. MODIFICAR ESTADO DE UN VEHICULO");
           System.out.println("4. BORRAR VEHICULO");
           System.out.println("5. SALIR");
           int option = sc.nextInt();

           switch(option){
               case 1: addVehicule(sc, parqueadero);
               break;
               case 2: listVehiculos(parqueadero);
               break;
               case 3: modifyStatus(sc, parqueadero);
               break;
               case 4: removeVehicule(sc, parqueadero);
               break;
               case 5: stopApp = true;
               System.out.println("ADIOS");
               break;
               default:
               System.out.println("INGRESE UNA OPCION VALIDA");
               break;
           }
   }
}
   public static void addVehicule(Scanner sc, ArrayList<Park> parqueadero) {
       EstadoVehiculo estado = EstadoVehiculo.Estacionado;
       System.out.println("INGRESE EL NOMBRE DEL CLIENTE");
       String name = sc.nextLine();
       sc.nextLine();
       System.out.println("INGRESE EL NUMERO DE TELEFONO");
       String number = sc.nextLine();
       sc.nextLine(); 
       System.out.println("INGRESE LA PLACA");
       String placa = sc.nextLine();
       System.out.println("INGRESE LA MARCA");
       String marca = sc.nextLine();
       System.out.println("INGRESE LA FECHA DE INGRESO");
       String fechaIngreso = sc.nextLine();
       System.out.println();
           SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
           dateFormat.setLenient(false);
           try {
               Date parseDate = dateFormat.parse(fechaIngreso);
               String formattedDate = dateFormat.format(parseDate);
                   if(!formattedDate.equals(fechaIngreso)){
                       System.out.println("La fecha ingresada no cumple con el formato dd/MM/yyyy.");
                       return;
                   }
                   if (parkExists(placa, parqueadero)){
                       System.out.print("EL AUTO YA EXISTE");
                       return;
                   }
                   Park park = new Park(name, number, placa, marca, parseDate, estado);
                   parqueadero.add(park);
           } catch (ParseException e) {
               System.out.println("La fecha ingresada no cumple con el formato dd/MM/yyyy.");
               return;
           }        
}
   public static boolean parkExists(String placa, ArrayList<Park> parqueadero){
       for (Park park : parqueadero){
           if (park.getPlaca().equals(placa)){
               return true;
           }
       }
       return false;
   }
   public static void listVehiculos(ArrayList<Park> parqueadero){
       System.out.println("LISTA DE VEHICULOS");
       System.out.println("---------------------");
       for (Park park : parqueadero){
           System.out.println(park.toString());
           System.out.println("---------------------");

       }
   }
   public static void modifyStatus(Scanner sc, ArrayList<Park> parqueadero) {
       System.out.println("INGRESE LA PLACA DEL VEHICULO PARA CAMBIAR SU ESTADO: ");
       String placa = sc.nextLine();
       boolean encontrado = false;
       for (Park park : parqueadero) {
           if (park.getPlaca().equalsIgnoreCase(placa)) {
               park.setEstado(EstadoVehiculo.Retirado);
               System.out.println("EL ESTADO DEL VEHICULO CON PLACA " + placa + " ha sido cambiado a off");
               encontrado = true;
               break; // Salir del bucle for ya que encontramos el vehículo
           }
       }
       if (!encontrado) {
           System.out.println("NO SE ENCONTRO NINGUN VEHICULO CON LA PLACA INGRESADA");
       }
   }
   
   private static void removeVehicule(Scanner sc, ArrayList<Park> parqueadero) {
       System.out.println("INGRESE LA PLACA DEL AUTO A ELIMINAR:");
       String placa = sc.nextLine();
   
       boolean encontrado = false;
       // Buscamos el contacto en la lista
       for (Park park : parqueadero) {
           if (park.getPlaca().equals(placa)) {
               // Eliminamos el contacto de la lista
               parqueadero.remove(park);
               System.out.println("El vehículo ha sido eliminado del parqueadero.");
               printParks(parqueadero);
               encontrado = true;
               break; // Salir del bucle for ya que eliminamos el vehículo
           }
       }
       if (!encontrado) {
           System.out.println("NO SE ENCONTRO NINGUN VEHICULO CON LA PLACA INGRESADA");
       }
   }
public static void printParks(ArrayList<Park> parqueadero) {
   System.out.println("----- VEHÍCULOS ESTACIONADOS -----");
   for (Park park : parqueadero) {
       System.out.println("Placa: " + park.getPlaca() + " | Nombre del cliente: " + park.getName() + " | Número del cliente: " + park.getNumber());
   }
}
public static void elMaestro(ArrayList<User> users, Scanner sc){
while(!stopApp){
System.out.println("BIENVENIDO");
System.out.println("||INGRESE UNA OPCION||");
System.out.println("1. AGREGAR USUARIO");
System.out.println("2. LISTAR USUARIOS");
System.out.println("3. CALIFICAR USUARIOS");
System.out.println("4. SALIR");
while (!sc.hasNextLine()){
    System.err.println("INGRESE UNA OPCION VALIDA");
    sc.next();
}
int option = sc.nextInt();
sc.nextLine();
    switch(option){
        case 1: addUser(sc, users);
        break;
        case 2: userList(users);
        break;
        case 3: modifyUser(sc, users);
        break;
        case 4: stopApp = true;
        System.out.println("ADIOS");
        break;
        default:
        System.err.println("INGRESE UNA OPCION VALIDA");
        break;
    }
    
}
}
public static void addUser(Scanner sc, ArrayList<User>users){
Calificacion aprovado = Calificacion.Reprobado;
System.out.println("INGRESE EL NOMBRE DEL USUARIO");
String name = sc.nextLine();
System.out.println("INGRESE LA IDENTIFICACION DEL USUSARIO");
String id = sc.nextLine();
System.out.println("EL USUARIO ESTA REPITIENDO EL CURSO?");
boolean repetidor= sc.nextBoolean();
sc.nextLine();
boolean ingreso = true;
if(userExist(id, users)){
    System.out.println(" EL USUARIO YA EXISTE ");
    return;
}
User user = new User(name, id, repetidor,ingreso, aprovado);
users.add(user);
}

public static boolean userExist(String id, ArrayList<User> users){
for (User user: users){
    if (user.getIde().equals(id)){
        return true;
    }
}
return false;
}
public static void userList(ArrayList<User> users){
System.out.println("LISTA DE USUARIOS");
for (User user : users){
    System.out.println(user.toString());
    System.out.println("---------------------");

}
}
public static void modifyUser(Scanner sc, ArrayList<User> users) {
System.out.println("INGRESE LA ID del USUARIO A CALIFICAR: ");
String id = sc.nextLine();
boolean encontrado = false;
for (User user : users) {
    if (user.getIde().equalsIgnoreCase(id)) {
        user.setCalificacion(Calificacion.Aprovado);
        System.out.println("LA CALIFICACION DEL USUARIO CON ID: " + id + " HA SIDO APROVADO");
        encontrado = true;
        break; // Salir del bucle for ya que encontramos el usuario
    }
}
if (!encontrado) {
    System.out.println("NO SE ENCONTRO NINGUN USUARIO CON ESA ID");
}
}
}












  
 