package fr.infocom.cra.activity.managers;

import java.util.Optional;
import fr.infocom.cra.activity.models.Activity;


public interface ActivityManager {
	public Iterable<Activity> findAll();
	public Optional<Activity> findById(int id);
	public void delete(Activity activity);
	public Activity createOrUpdate(Activity activity);

}
