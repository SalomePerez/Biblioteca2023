package co.edu.uniquindio.poo;

import java.util.ArrayList;

/**
 * autores: Salomé Pérez, Samuel Castaño, Daniel Jurado
 * La clase Biblioteca representa una biblioteca y permite gestionar personas, empleados,
 * estudiantes y libros en la biblioteca.
 */
public class Biblioteca {

/**
 * Listas de Personas, Empleados, estudiantes y libros que vamos a utilizar en el desarrollo del código.
 */
    public ArrayList <Persona> listaPersonas;
    public ArrayList <Empleado> listaEmpleados;
    public ArrayList <Estudiante> listaEstudiante;
    public ArrayList <Libro> listaLibro;
/**
 * Metodo constructor que sirva para crear una instancia de la clase Biblioteca
 * @param listaPersonas
 * @param listaEmpleados
 * @param listaEstudiante
 * @param listaLibro
 */  
    public Biblioteca(ArrayList<Persona> listaPersonas, ArrayList<Empleado> listaEmpleados,
            ArrayList<Estudiante> listaEstudiante, ArrayList<Libro> listaLibro) {
        this.listaPersonas = listaPersonas;
        this.listaEmpleados = listaEmpleados;
        this.listaEstudiante = listaEstudiante;
        this.listaLibro = listaLibro;
    }

    /**
     * Obtiene la lista de personas en la Biblioteca
     * @return la lista de personas
     */
    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    /**
     * Estalece la lista de personas en la Biblioteca
     * @param listaPersonas
     */
    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    /**
     * Obtiene la lista de empleados en la Biblioteca 
     * @return la lista de Empleados
     */
    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    /**
     * Establece la lista de empleados en la Bibioteca
     * @param listaEmpleados
     */
    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    /**
     * Obtiene la lista de estudiantes en la Biblioteca
     * @return la lista de personas
     */
    public ArrayList<Estudiante> getListaEstudiante() {
        return listaEstudiante;
    }

    /**
     * Establece la lista de estudiantes en la biblioteca
     * @param listaEstudiante
     */
    public void setListaEstudiante(ArrayList<Estudiante> listaEstudiante) {
        this.listaEstudiante = listaEstudiante;
    }

    /**
     * obtiene la lista de libros en la biblioteca
     * @return la lisa de libros
     */
    public ArrayList<Libro> getListaLibro() {
        return listaLibro;
    }

    /**
     * Establece la lista de libros en la Biblioteca
     * @param listaLibro
     */
    public void setListaLibro(ArrayList<Libro> listaLibro) {
        this.listaLibro = listaLibro;
    }

//------------------------------------------------------------------------------------------------------------------
    
    /**
     * Método que trata de buscar Personas según su identificación
     * @param id (identificación de la persona, sea estudiante o empleado)
     * @return la persona encontrada
    */
    public Persona buscarPersona(String id){
        //TODO
        return null ;
    }

    /**
     * Metodo para eliminar la persona que será buscada por su identificación
     * @param id (identificación de la persona, sea estudiante o empleado)
     */
    public void eliminarPersona(String id){
        //TODO
    }
//------------------------------------------------------------------------------------------------------------------
    /**
     * Método que sirva para eliminar un libro
     * @param libro (el libro a eliminar)
     */
    public void eliminarLibro(Libro libro) {
        // TODO
    }

    /**
     * Método que sirve para actualizar la información de un libro en la biblioteca
     * @param libro (el libro desactualizado)
     * @return el libro ya actualizado
     */
    public Libro actualizarLibro(Libro libro){
        //TODO
        return null;
        }
    /**
     * Método que sirve para buscar un ISBN de un libro de la biblioteca
     * @param iSBN
     * @return el ISBN encontrado
     */
    public Libro buscarIsbn (String iSBN){
        //TODO
        return null;
    }
//------------------------------------------------------------------------------------------------------------------

    /**
    * Método que sirve para actualizar un Estudiante 
    *@param estudiante
    *@return el estudiante actualizado
    */
    public Estudiante actualizarEstudiante (Estudiante estudiante){
        //TODO
    return null;
    }


    
}
