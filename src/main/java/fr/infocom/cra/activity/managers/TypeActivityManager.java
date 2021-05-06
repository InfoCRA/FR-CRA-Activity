package fr.infocom.cra.activity.managers;

import java.util.Optional;
import fr.infocom.cra.activity.models.TypeActivity;

public interface TypeActivityManager {
	public Iterable<TypeActivity> findAll();
	public Optional<TypeActivity> findById(int id);
	public TypeActivity createOrUpdate(TypeActivity typeActivity);
	public void delete(TypeActivity typeActivity);
}
