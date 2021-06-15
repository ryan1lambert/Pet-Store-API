package petStore.pet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping(method=RequestMethod.PUT, value="/pets/{id}")
	public void updatePet(@RequestBody Pet pet, @PathVariable int id) {
		petService.updatePet(id, pet);
	}
	
	@RequestMapping(value="/pets/findByTags")
	public List<Pet> findByTags(@RequestParam(value="tag") String[] tags ) {
		return petService.getByTag(tags);
	}
	
	@RequestMapping(value="/pets/findByStatus")
	public List<Pet> findByStatus(@RequestParam(value="status") String status){
		return petService.getByStatus(status);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/pets/{id}/uploadImage")
	public void uploadImage(@PathVariable int id, @RequestParam(value="img") String img) {
		petService.addImage(id, img);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/pets/{id}")
	public void updateNameAndStatus(@PathVariable int id, @RequestParam(value="name") String name, @RequestParam(value="status") String status) {
		petService.updateNameAndStatus(id, name, status);
	}
	@RequestMapping(method = RequestMethod.DELETE, value="/pets/{id}")
	public void deletePet(@PathVariable int id) {
		petService.deletePet(id);
	}
}
