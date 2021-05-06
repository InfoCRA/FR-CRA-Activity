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
import fr.infocom.cra.activity.managers.TypeActivityManager;
import fr.infocom.cra.activity.models.TypeActivity;

@RestController
@RequestMapping("/typesactivity")
public class TypeActivityController {
	
	@Autowired
	private TypeActivityManager typeActivityManager;

	@GetMapping("/lister")
	public List<TypeActivity> listTypeActivity() {
		return (List<TypeActivity>) typeActivityManager.findAll();
	}

	@GetMapping("/lister/{id}")
	public Optional<TypeActivity> getOneTypeActivityById(@PathVariable int id) {

		Optional<TypeActivity> typeExpense = typeActivityManager.findById(id);
		return typeExpense;
	}

	@PostMapping("/ajouter")
	public void addTypeActivity(@RequestBody TypeActivity typeActivity) {
		typeActivityManager.createOrUpdate(typeActivity);
	}

	@DeleteMapping("/supprimer")
	public void deleteTypeActivity(@RequestBody TypeActivity typeActivity) {
		typeActivityManager.delete(typeActivity);
	}

}
