package ar.edu.unlam.tallerweb1.delivery;

public class DatosLibro {
    private String nombre;
    private String autor;
    private String ISBN;
    private String idioma;
    private String editorial;
    private String estado;

    public DatosLibro(String nombre, String autor, String ISBN, String idioma, String editorial, String estado) {
        this.nombre = nombre;
        this.autor = autor;
        this.ISBN = ISBN;
        this.idioma = idioma;
        this.editorial = editorial;
        this.estado = estado;
    }

    public DatosLibro() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "DatosLibro{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", idioma='" + idioma + '\'' +
                ", editorial='" + editorial + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
