package ru.med.gastroapp.dao;

import org.springframework.stereotype.Repository;
import ru.med.gastroapp.entities.Drug;

@Repository
public class DrugDAO extends AbstractDAO<Drug> implements IBasicDAO<Drug> {
}
