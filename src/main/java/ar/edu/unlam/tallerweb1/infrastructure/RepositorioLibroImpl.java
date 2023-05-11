package ar.edu.unlam.tallerweb1.infrastructure;

import ar.edu.unlam.tallerweb1.domain.Libro;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
}
