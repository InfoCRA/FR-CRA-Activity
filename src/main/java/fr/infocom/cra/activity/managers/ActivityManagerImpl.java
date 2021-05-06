package fr.infocom.cra.activity.managers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import fr.infocom.cra.activity.dao.ActivityDAO;
import fr.infocom.cra.activity.models.Activity;


public class ActivityManagerImpl implements ActivityManager{

	@Autowired
	private ActivityDAO activityDAO;

	@Override
	public Iterable<Activity> findAll() {
		return activityDAO.findAll();
	}

	@Override
	public Optional<Activity> findById(int id) {
		return activityDAO.findById(id);
	}
	
	@Override
	public Activity createOrUpdate(Activity activity) {
		return activityDAO.save(activity);
	}


	@Override
	public void delete(Activity activity) {
		activityDAO.delete(activity);
	}

}
