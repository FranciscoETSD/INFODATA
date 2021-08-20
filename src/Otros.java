import java.util.Date;

public class Otros {
    private int codigo;
    private String Modelo;
    private Date FechaCreada;

    public Otros(int codigo, String modelo, Date fechaCreada) {
        this.setCodigo(codigo);
        setModelo(modelo);
        setFechaCreada(fechaCreada);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public Date getFechaCreada() {
        return FechaCreada;
    }

    public void setFechaCreada(Date fechaCreada) {
        FechaCreada = fechaCreada;
    }
}
