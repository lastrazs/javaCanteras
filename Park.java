import java.util.Date;

public class Park extends Client {
    public String placa;
    public String marca;
    public Date fechaIngreso;
    private EstadoVehiculo estado;

    public Park(String name,String number, String placa, String marca, Date fechaIngreso, EstadoVehiculo estado){
        super(name, number);
        this.placa = placa;
        this.marca = marca;
        this.fechaIngreso = fechaIngreso;
        this.estado = EstadoVehiculo.Estacionado;
    }
    public String getPlaca(){
        return this.placa;
    }
    public String getmarca(){
        return this.marca;
    }
    public Date getFechai(){
        return this.fechaIngreso;
    }
    public EstadoVehiculo getEstado(){
        return this.estado;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setfechaI(Date fechaIngreso){
         this.fechaIngreso = fechaIngreso;
    }
    public void setEstado(EstadoVehiculo estado){
        this.estado = estado;
    }
    @Override
    public String toString(){
        return "Parqueadero{"+
        "Placa: "+ placa + "\n"+
        "Marca: "+marca+ "\n"+
        "Ingreso: "+ fechaIngreso+ "\n"+
        "Estado: " + estado.name() + "\n"+
        "Cliente: "+ getName() + "\n"+
        "Numero: "+ getNumber() + "\n"+ "}";
        }
    }
    enum EstadoVehiculo{
        Estacionado,
        Salida,
        Retirado
    }


