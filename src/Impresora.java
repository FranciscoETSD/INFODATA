import java.util.Date;

public class Impresora {
    private int Codigo;
    private String Modelo;
    private float velocidad;
    private Date Fechacreada;

    public Impresora(int codigo, String modelo, float velocidad, Date fechacreada) {
        setCodigo(codigo);
        setModelo(modelo);
        this.setVelocidad(velocidad);
        setFechacreada(fechacreada);
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

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public Date getFechacreada() {
        return Fechacreada;
    }

    public void setFechacreada(Date fechacreada) {
        Fechacreada = fechacreada;
    }
}
