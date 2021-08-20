import java.util.Date;

public class Monitores {
    private int Codigo;
    private String Modelo;
    private int resolucion;
    private Date FechaCreada;

    public Monitores(int codigo, String modelo, int resolucion, Date fechaCreada) {
        setCodigo(codigo);
        setModelo(modelo);
        this.setResolucion(resolucion);
        setFechaCreada(fechaCreada);
    }

    @Override
    public String toString() {
        return this.Modelo.toString() + " [" + Codigo + "]";
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public Date getFechaCreada() {
        return FechaCreada;
    }

    public void setFechaCreada(Date fechaCreada) {
        FechaCreada = fechaCreada;
    }
}
