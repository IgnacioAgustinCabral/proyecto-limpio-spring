package ar.edu.unlam.tallerweb1.domain.libros;

import javax.persistence.*;

@Entity
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String autor;
    @Column(unique=true)
    private String ISBN;
    private String idioma;
    private String editorial;
    private String estado;

    public Libro() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getEstado() {
        return estado;
    }
}
