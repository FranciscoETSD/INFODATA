public class Alquiler {
    private int Codigo;
    private double Precio;
    private long capacidad;

    public Alquiler(int codigo, double precio, long capacidad) {
        setCodigo(codigo);
        setPrecio(precio);
        this.setCapacidad(capacidad);
    }


    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public long getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(long capacidad) {
        this.capacidad = capacidad;
    }
}
