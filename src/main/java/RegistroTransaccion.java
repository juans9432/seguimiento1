import java.time.LocalDateTime;

public class RegistroTransaccion {
    public LocalDateTime fecha;
    public double valor;
    public String titular;
    public String categoria;

    public RegistroTransaccion(LocalDateTime fecha, double valor, String titular, String categoria) {
        this.fecha = fecha;
        this.valor=valor;
        this.titular=titular;
        this.categoria=categoria;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
