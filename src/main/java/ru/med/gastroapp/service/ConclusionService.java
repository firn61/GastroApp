package ru.med.gastroapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.med.gastroapp.dao.IConclusionDAO;
import ru.med.gastroapp.entities.Conclusion;

@Service
@Transactional
public class ConclusionService extends AbstractService<Conclusion> implements IConclusionService<Conclusion> {

    @Autowired
    public ConclusionService(IConclusionDAO<Conclusion> conclusionDAO) {
        super(conclusionDAO);
    }

}
