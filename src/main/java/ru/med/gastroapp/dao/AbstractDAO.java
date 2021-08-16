package ru.med.gastroapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDAO<T> implements IBasicDAO<T>{

    private Class<T> targetClass;

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Override
    public void save(T t) {
        getSession().save(t);
    }

    @Override
    public void merge(T t) {
        getSession().merge(t);
    }

    @Override
    public void delete(T t) {
        getSession().delete(t);
    }

    @Override
    public T findById(long id) {
        return getSession().get(targetClass, id);
    }

    @Override
    public T findByName(String name) {
       return getSession().get(targetClass, name);
    }
}
