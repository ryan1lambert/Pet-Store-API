package petStore.pet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetController {
	@Autowired
	private PetService petService;
	
	@RequestMapping(method=RequestMethod.GET, value="/pets")
	public List<Pet> getAllPets(){
		return petService.getAllPets();
	}
	
	@RequestMapping("/pets/{id}")
	public Pet getPet(@PathVariable int id) {
		return petService.getPet(id);
	}
	
	
	@RequestMapping(method=RequestMethod.POST, value="/pets")
	public void addPet(@RequestBody Pet pet) {
		petService.addPet(pet);
	}
	
}
