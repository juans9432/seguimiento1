import java.util.ArrayList;

import static java.util.Arrays.stream;

public class Banco {
    public String nombre;
    public ArrayList<Usuario> listaUsuarios;
    public ArrayList<BilleteraVirtual> billeterasVirtuales;

    public Banco(String nombre, ArrayList<Usuario> listaUsuarios, ArrayList<BilleteraVirtual> billeterasVirtuales) {
        this.nombre = nombre;
        this.listaUsuarios = listaUsuarios;
        this.billeterasVirtuales = billeterasVirtuales;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public ArrayList<Usuario> getListaUsuarios() {

        return listaUsuarios;
    }

    public void setUsuarios(ArrayList<Usuario> listaUsuarios) {

        this.listaUsuarios = listaUsuarios;
    }

    public ArrayList<BilleteraVirtual> getBilleterasVirtuales() {

        return billeterasVirtuales;
    }

    public void setBilleterasVirtuales(ArrayList<BilleteraVirtual> billeterasVirtuales) {
        this.billeterasVirtuales = billeterasVirtuales;
    }

    //crear usuarios
    public void agregar(Usuario usuario) throws Exception{

        Usuario usuarioBuscado = obtener(usuario.getId());

        // Si el estudiante ya existe, lanzar una excepción
        if(usuarioBuscado!=null){
            throw new Exception("Ya existe un estudiante con el mismo ID");
        }else{
            usuario.add(usuario);
        }
    }

    public Usuario obtener(String id) {

        // Buscar el estudiante con el ID dado (se usa programación funcional)
        return listaUsuarios
                .stream()
                .filter(Usuario -> Usuario.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
