import java.util.Date;

public class Proveedores {
    private String nit;
    private String Direccion;
    private Date FechaAdquirida;
    private int CantidadProductos;

    public Proveedores(String nit, String direccion, Date fechaAdquirida, int cantidadProductos) {
        this.setNit(nit);
        setDireccion(direccion);
        setFechaAdquirida(fechaAdquirida);
        setCantidadProductos(cantidadProductos);
    }

    @Override
    public String toString() {
        return String.valueOf(CantidadProductos);
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public Date getFechaAdquirida() {
        return FechaAdquirida;
    }

    public void setFechaAdquirida(Date fechaAdquirida) {
        FechaAdquirida = fechaAdquirida;
    }

    public int getCantidadProductos() {
        return CantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        CantidadProductos = cantidadProductos;
    }
}
