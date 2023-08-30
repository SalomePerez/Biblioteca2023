package co.edu.uniquindio.poo;
/**
 * autores: Salomé Pérez, Samuel Castaño, Daniel Jurado
 * La clase Persona representa una clase PADRE, de la clase Empleado y Estudiante(Herencia)
 */
public class Persona {
    /**
     * Atrbutos de la clase Persona:
     * nombre: nombre de la persona(estudiante o empleado)
     * id: identificacion de la persona(estudiante o empleado)
     * celular: numeor telefonico de la persona(estudiante o empleado)
     * correo: correo personal de la persona(estudiante o empleado)
     * dirección: dirección de la persona(estudiante o empleado)
     */
    private String nombre;
    private String id;
    private String celular;
    private String correo;
    private String direccion;
    
    /**
     * Método constructor que sirve para crear una intancia de persona
     * @param nombre
     * @param id
     * @param celular
     * @param correo
     * @param direccion
     */
    public Persona(String nombre, String id, String celular, String correo, String direccion) {
        this.nombre = nombre;
        this.id = id;
        this.celular = celular;
        this.correo = correo;
        this.direccion = direccion;
    }

    /**
     * Método que obtiene el nombre de la persona
     * @return el nombre de la persona(estudiante o empleado)
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que establece el nombre de la persona(estudiante o empleado)
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que obtiene la identificacion de la persona(estudiante o empleado)
     * @return la identificacion de la persona(estudiante o empleado)
     */
    public String getId() {
        return id;
    }

    /**
     * Método que establece la identificacion de la persona(estudiante o empleado)
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Método que obtiene el numero celular de la persona(estudiante o empleado)
     * @return el numero celular de la persona(estudiante o empleado)
     */
    public String getCelular() {
        return celular;
    }

    /**
     * Método que EStablece el número celular de la persona(estudiante o empleado)
     * @param celular
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * Método que obtiene el correo personal de la persona(estudiante o empleado)
     * @return el correo personal de la persona
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Método que establece el correo personal de la persona(estudiante o empleado)
     * @param correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Método que obtiene la direccion de la persona(estudiante o empleado)
     * @return la direción de la persona
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Método que establece la direccion de la persona(estudiante o empleado)
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    




}

