package co.edu.uniquindio.poo;
    /**
     * autores: Salomé Pérez, Samuel Castaño, Daniel Jurado
    * La clase Libro representa a un Libro en el sistema de Biblioteca.
    */
public class Libro {
    /**
     * Atributos que se van a utilizar en el desarrollo del proyecto:
     * ISBN: Que es la identificación de cada libro
     * titulo: Título de cada libro
     * fechaPublicacion: la fecha de publicación de cada libro
     * autor: nombre del autor del libro. 
     */
    private String ISBN;
    private String titulo;
    private String fechaPublicacion;
    private String autor;

    /**
     * Método constructor que sirve para crear una intancia del libro 
     * @param iSBN
     * @param titulo
     * @param fechaPublicacion
     * @param autor
     */
    public Libro(String iSBN, String titulo, String fechaPublicacion, String autor) {
        ISBN = iSBN;
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
    }
    
    /**
     * Método que Obtiene el ISBN del libro 
     * @return el isbn del libro 
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Método que Establec el ISBN de un libro
     * @param iSBN
     */
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    /**
     * Método que sirve para Obtener el Titulo del libro 
     * @return el titulo del libro
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Método que sirve para establecer el título del libro
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Método que Obtiene la Fecha de Publicación de l libro
     * @return la fecha de pubicación del libro
     */
    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    /**
     * Método que establece la fecha de publicación del libro 
     * @param fechaPublicacion 
     */
    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    /**
     * Método que sirve para obtener el nombre del autor del libro 
     * @return el autor del libro 
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Método que sirve para establecer el nombre dle autor del libro 
     * @param autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
}