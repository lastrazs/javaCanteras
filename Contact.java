class Contact{
    public String name;
    public String number;
    public String company;

    public Contact(String name, String number, String company){
    this.name = name;
    this.number=number;
    this.company=company;
}
public String getName(){
    return this.name;
}
public String getNumber(){
    return this.number;
}
public String getCompany(){
    return this.company;
}
public String setName(String name){
    return this.name;
}
public String setNumber(String number){
        return this.number;
}
 public String setCompany(String company){
    return this.company;
}
public String toString(){
    return "Nombre: "+ this.name + "\n"+
            "Telefono: "+ this.number + "\n"+
            "Empresa: "+ this.company + "\n";
}
}