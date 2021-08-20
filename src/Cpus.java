import java.util.Date;

public class Cpus {
    private String Modelo;
    private int Codigo;
    private String MemoriaPrincipal;
    private Date FechaCreada;
    private String PaisOrigen;

    public Cpus(String modelo, int codigo, String memoriaPrincipal, Date fechaCreada, String paisOrigen) {
        setModelo(modelo);
        setCodigo(codigo);
        setMemoriaPrincipal(memoriaPrincipal);
        setFechaCreada(fechaCreada);
        setPaisOrigen(paisOrigen);
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getMemoriaPrincipal() {
        return MemoriaPrincipal;
    }

    public void setMemoriaPrincipal(String memoriaPrincipal) {
        MemoriaPrincipal = memoriaPrincipal;
    }

    public Date getFechaCreada() {
        return FechaCreada;
    }

    public void setFechaCreada(Date fechaCreada) {
        FechaCreada = fechaCreada;
    }

    public String getPaisOrigen() {
        return PaisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        PaisOrigen = paisOrigen;
    }
}
