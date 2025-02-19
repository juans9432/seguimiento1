public class Usuario {

    public String nombre, direccion, id, correo, contraseña;

    public Usuario(String nombre, String direccion, String id, String correo, String contraseña) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.id = id;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Usuario obtener(String id) {

        // Buscar el estudiante con el ID dado (se usa programación funcional)
        return usuario;
                .stream()
                .filter(u -> usuario.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
