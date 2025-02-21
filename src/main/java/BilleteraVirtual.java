import java.util.ArrayList;

public class BilleteraVirtual {
    public String numero;
    public double saldo;
    public double COSTO=200;
    public ArrayList<RegistroTransaccion> registroTransacciones;

    public BilleteraVirtual(String numero, double saldo, double COSTO, ArrayList<RegistroTransaccion> registroTransacciones) {
        this.numero = numero;
        this.saldo = saldo;
        this.COSTO = COSTO;
        this.registroTransacciones = registroTransacciones;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getCOSTO() {
        return COSTO;
    }

    public void setCOSTO(double COSTO) {
        this.COSTO = COSTO;
    }

    public ArrayList<RegistroTransaccion> getRegistroTransacciones() {
        return registroTransacciones;
    }

    public void setRegistroTransacciones(ArrayList<RegistroTransaccion> registroTransacciones) {
        this.registroTransacciones = registroTransacciones;
    }
}
