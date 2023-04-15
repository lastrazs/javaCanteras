

class User{
    public String name;
    public String id;
    public boolean ingreso;
    public boolean repetidor;
    public Calificacion aprovado;

    public User(String name, String id, boolean ingreso, boolean repetidor, Calificacion aprovado){
        this.name=name;
        this.id=id;
        this.ingreso= ingreso;
        this.repetidor=repetidor;
        this.aprovado=Calificacion.Reprobado;
    }
    public String getName(){
        return  this.name;
    }
    public String getIde(){
        return this.id;
    }
    public boolean getIngreso(){
        return this.ingreso;
    }
    public boolean getRepetidor(){
        return this.repetidor;
    }
    public Calificacion getAprovado(){
        return this.aprovado;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setId(String id){
        this.id = id;
    }
    public void isIngreso(boolean ingreso){
        this.ingreso = ingreso;
    }
    public void isRepetidor(boolean repetidor){
        this.repetidor = repetidor;
    }
    public void setCalificacion(Calificacion aprovado){
        this.aprovado = aprovado;
    }
@Override
public String toString(){
    return "USUARIO{"+
        "Nombre: " + name +"\n"+
        "ID: " + id+ "\n"+
        "INGRESO: "+ ingreso + "\n"+
        "REPETIDOR: " + repetidor + "\n"+
        "ESTADO: " + aprovado.name() + "\n" + "}";
}
}
    enum Calificacion {
        Aprovado,
        Reprobado
    }

