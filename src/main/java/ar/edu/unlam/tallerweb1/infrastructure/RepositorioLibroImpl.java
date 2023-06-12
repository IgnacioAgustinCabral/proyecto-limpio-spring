package ar.edu.unlam.tallerweb1.infrastructure;

import ar.edu.unlam.tallerweb1.domain.libros.Libro;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositorioLibroImpl implements RepositorioLibro {
    private SessionFactory sessionFactory;

    @Autowired
    public RepositorioLibroImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void guardar(Libro libro) {
        this.sessionFactory.getCurrentSession().save(libro);
    }

    @Override
    public Libro buscarPorId(Long id) {
        return this.sessionFactory.getCurrentSession().get(Libro.class,id);
    }

    @Override
    public Libro buscarPorISBN(String isbn) {
        return (Libro) this.sessionFactory.getCurrentSession().createCriteria(Libro.class)
                .add(Restrictions.eq("ISBN",isbn))
                .uniqueResult();
    }

    @Override
    public void borrar(Libro libro) {
        this.sessionFactory.getCurrentSession().delete(libro);
    }

    @Override
    public void modificar(Libro libro) {
        this.sessionFactory.getCurrentSession().update(libro);
    }

    @Override
    public List<Libro> obtenerLibrosPorUsuario(String nombre) {
        return (List<Libro>) this.sessionFactory.getCurrentSession().createCriteria(Libro.class)
                .add(Restrictions.eq("nombre",nombre))
                .list();
    }

    @Override
    public List<Libro> obtenerLibros() {
        try {
            final Session session = sessionFactory.getCurrentSession();
            return session.createCriteria(Libro.class).list();
        } catch (HibernateException e) {
            final Session  session = sessionFactory.openSession();
            return session.createCriteria(Libro.class).list();
        }
    }


}
