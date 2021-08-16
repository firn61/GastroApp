package ru.med.gastroapp.dao;

import org.springframework.stereotype.Repository;
import ru.med.gastroapp.entities.Conclusion;

@Repository
public class ConclusionDAO extends AbstractDAO<Conclusion> implements IConclusionDAO<Conclusion> {

}
