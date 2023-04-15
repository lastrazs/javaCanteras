public class Client {
    private String name;
    private String number;

    public Client(String name, String number) {
        this.name = name;
        this.number = number;
    }

    // Métodos getter y setter para las variables
    public String getName(){
        return this.name;
    }
    public String getNumber(){
        return this.number;
    }
    public String setName(String name){
        return this.name;
    }
    public String setnumber(String number){
        return this.number;
    }
}