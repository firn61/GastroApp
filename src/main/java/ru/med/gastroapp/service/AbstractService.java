package ru.med.gastroapp.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.med.gastroapp.dao.IBasicDAO;

@Service
@Transactional
public abstract class AbstractService<T> implements IBasicService<T> {

    protected IBasicDAO<T> abstractDAO;

    public AbstractService(IBasicDAO<T> abstractDAO) {
        this.abstractDAO = abstractDAO;
    }

    @Override
    public void addNew(T t) {
        abstractDAO.save(t);
    }

    @Override
    public void update(T t) {
        abstractDAO.merge(t);
    }

    @Override
    public void delete(T t) {
        abstractDAO.delete(t);
    }

    @Override
    public T getById(long id) {
        return abstractDAO.findById(id);
    }

    @Override
    public T getByName(String name) {
        return abstractDAO.findByName(name);
    }

}
