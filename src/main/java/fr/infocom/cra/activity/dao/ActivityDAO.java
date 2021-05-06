package fr.infocom.cra.activity.dao;

import org.springframework.data.repository.CrudRepository;
import fr.infocom.cra.activity.models.Activity;

public interface ActivityDAO extends CrudRepository<Activity, Integer>{

}
