package co.edu.uniquindio.poo;
    /**
    * autores: Salomé Pérez, Samuel Castaño, Daniel Jurado
    * La clase Empleado representa a un empleado en el sistema y hereda de la clase Persona.
    */
public class Empleado extends Persona{
    /**
    * atributo que representa el cargo del empleado 
    */
    private String cargo;

    /**
     * Método contructor que sirve para crear una intancia de un Empleado
     * @param nombre
     * @param id
     * @param celular
     * @param correo
     * @param direccion
     * @param cargo
     */
    public Empleado(String nombre, String id, String celular, String correo, String direccion, String cargo) {
        super(nombre, id, celular, correo, direccion);
        this.cargo = cargo;
    }

    /**
     * Método que sirve para obtener el cargo del empleado
     * @return el cargo que tenga el empleado
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Método que establece en Cargo del empleado
     * @param cargo
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
