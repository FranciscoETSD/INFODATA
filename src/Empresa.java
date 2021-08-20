import java.util.Date;

public class Empresa {
    private String Nombre;
    private String Direccion;
    private int Numeroempleados;
    private String Soporte;
    private int nit;
    private String Telefono;
    private String Domicilio;
    private Date FechaComprada;

    public Empresa(String nombre, String direccion, int numeroempleados, String soporte, int nit, String telefono, String domicilio, Date fechaComprada) {
        setNombre(nombre);
        setDireccion(direccion);
        setNumeroempleados(numeroempleados);
        setSoporte(soporte);
        this.setDNI(nit);
        setTelefono(telefono);
        setDomicilio(domicilio);
        setFechaComprada(fechaComprada);

    }

    @Override
    public String toString() {
        return this.Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public int getNumeroempleados() {
        return Numeroempleados;
    }

    public void setNumeroempleados(int numeroempleados) {
        Numeroempleados = numeroempleados;
    }

    public String getSoporte() {
        return Soporte;
    }

    public void setSoporte(String soporte) {
        Soporte = soporte;
    }

    public int getDNI() {
        return nit;
    }

    public void setDNI(int DNI) {
        this.nit = nit;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String domicilio) {
        Domicilio = domicilio;
    }

    public Date getFechaComprada() {
        return FechaComprada;
    }

    public void setFechaComprada(Date fechaComprada) {
        FechaComprada = fechaComprada;
    }
}
