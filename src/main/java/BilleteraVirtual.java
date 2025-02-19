import java.util.ArrayList;
import java.util.List;

public class BilleteraVirtual {
    public String id;
    public double saldo;
    public ArrayList<RegistroTransaccion> registroTransacciones;

    public BilleteraVirtual(String id, double saldo, ArrayList<RegistroTransaccion> registroTransacciones) {
        this.id = id;
        this.saldo = saldo;
        this.registroTransacciones = registroTransacciones;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<RegistroTransaccion> getRegistroTransacciones() {
        return registroTransacciones;
    }

    public void setRegistroTransacciones(ArrayList<RegistroTransaccion> registroTransacciones) {
        this.registroTransacciones = registroTransacciones;
    }
}
