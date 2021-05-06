package fr.infocom.cra.activity.controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import fr.infocom.cra.activity.managers.ActivityManager;
import fr.infocom.cra.activity.models.Activity;

@RestController
@RequestMapping("/activity")
public class ActivityController {

	
	@Autowired
	private ActivityManager activityManager;
	
	@GetMapping("/lister")
	public List<Activity> listActivity() {
		return (List<Activity>) activityManager.findAll();
	}

	@GetMapping("/lister/{id}")
	public Optional<Activity> getOneActivityById(@PathVariable int id) {
		
		Optional<Activity> expense = activityManager.findById(id);
		return expense;
	}
	
	@PostMapping("/ajouter")
	public void addActivity(@RequestBody Activity activity) {
		activityManager.createOrUpdate(activity);
	}

	@DeleteMapping("/supprimer")
	public void deleteActivity(@RequestBody Activity activity) {
		activityManager.delete(activity);
	}
}
