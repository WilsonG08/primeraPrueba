public class cajeroAutomatico {

    //ATRIBUTOS
    String nombreUsuario;
    double cantidad;

    //METODOS
    public String getTitular() {
        return nombreUsuario;
    }

    public void setTitular(String titular) {
        this.nombreUsuario = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public cajeroAutomatico(String titular, double cantidad){
        this.nombreUsuario=titular;
        if(cantidad<=0){
            this.cantidad=0;
        }else {
            this.cantidad=cantidad;
        }
    }

    public void ingresar(String titular, double cantidad){
        if(cantidad>0){
            this.cantidad+=cantidad;
        }
    }

    public void retirar(String titular, double cantidad){
        if(cantidad<0){
            this.cantidad=0;
        }else{
            this.cantidad-=cantidad;
        }
    }

    public String toString(){
        return "El titular " + nombreUsuario + " tiene : " + cantidad ;
    }


}
