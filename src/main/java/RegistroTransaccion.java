import java.time.LocalDateTime;

public class RegistroTransaccion {
    public String id;
    public LocalDateTime fecha;
    public double valor;
    public String titular;
    public Categoria categoria;

    public RegistroTransaccion(String id, LocalDateTime fecha, double valor, String titular, Categoria categoria) {
        this.id = id;
        this.fecha = fecha;
        this.valor = valor;
        this.titular = titular;
        this.categoria = categoria;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
