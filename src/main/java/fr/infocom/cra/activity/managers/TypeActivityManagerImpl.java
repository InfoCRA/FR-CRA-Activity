package fr.infocom.cra.activity.managers;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import fr.infocom.cra.activity.dao.TypeActivityDAO;
import fr.infocom.cra.activity.models.TypeActivity;



public class TypeActivityManagerImpl implements TypeActivityManager {
	
	@Autowired
	private TypeActivityDAO typeActivityDAO;

	@Override
	public Iterable<TypeActivity> findAll() {
		return typeActivityDAO.findAll();
	}

	@Override
	public Optional<TypeActivity> findById(int id) {
		return typeActivityDAO.findById(id);
	}

	@Override
	public TypeActivity createOrUpdate(TypeActivity typeActivity) {
		return typeActivityDAO.save(typeActivity);
	}

	@Override
	public void delete(TypeActivity typeActivity) {
		typeActivityDAO.delete(typeActivity);
	}
}
