public abstract class Vehiculo {
   private String matricula;
   private String modelo;
   private String marca;
   private int kmsRecorridos;
   private double precioPorDia;
   private TipoMotor tipoMotor;
   private TipoVehiculo tipoVehiculo;




   public Vehiculo(String matricula, String modelo, String marca, int kmsRecorridos, double precioPorDia, TipoMotor tipoMotor, TipoVehiculo tipoVehiculo) {
       this.matricula = matricula;
       this.modelo = modelo;
       this.marca = marca;
       this.kmsRecorridos = kmsRecorridos;
       this.precioPorDia = precioPorDia;
       this.tipoMotor = tipoMotor;
       this.tipoVehiculo = tipoVehiculo;
   }
   public String getMatricula() {
       return matricula;
   }

   public void setMatricula(String matricula) {
       this.matricula = matricula;
   }

   public String getModelo() {
       return modelo;
   }

   public void setModelo(String modelo) {
       this.modelo = modelo;
   }

   public String getMarca() {
       return marca;
   }

   public void setMarca(String marca) {
       this.marca = marca;
   }

   public int getKmsRecorridos() {
       return kmsRecorridos;
   }

   public void setKmsRecorridos(int kmsRecorridos) {
       this.kmsRecorridos = kmsRecorridos;
   }

   public double getPrecioPorDia() {
       return precioPorDia;
   }

    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }

    public void setPrecioPorDia(double precioPorDia) {
        this.precioPorDia = precioPorDia;
    }

    public void setTipoMotor(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
}
