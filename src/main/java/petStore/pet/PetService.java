package petStore.pet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PetService {
	//this class is where the data is instantiated
	private List<Pet> pets = new ArrayList<>(Arrays.asList(
			new Pet(0,"name", "category", "photourl", Arrays.asList("tag1", "tag2"), "status" ),
			new Pet(1, "Mo", "Dog", "photourl", Arrays.asList("bad", "small"), "available" ),
			new Pet(2, "Cooper", "Dog", "photourl", Arrays.asList("good", "big"), "not available" )
			));
	public List<Pet> getAllPets(){
		return pets;
	}
	public Pet getPet(int id) {
		return pets.stream().filter(p -> p.getId() == (id)).findFirst().get();
	}
	public void addPet(Pet pet) {
		pets.add(pet);
	}

}
 