package petStore.pet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PetService {
	//this class is where the data is instantiated
	private List<Pet> pets = new ArrayList<>(Arrays.asList(
			new Pet(0,"name", "category", "photourl", new ArrayList<>(Arrays.asList("tag1", "tag2")), "status" ),
			new Pet(1, "Mo", "Dog", "photourl", new ArrayList<>(Arrays.asList("bad", "small")), "available" ),
			new Pet(2, "Cooper", "Dog", "photourl",new ArrayList<>(Arrays.asList("good", "big")), "not available" )
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
	public List<Pet> getByTag(String[] tags) {
		List<Pet> result = new ArrayList<>();
		for(int i = 0; i < pets.size(); i++) {
			for(int j = 0; j < tags.length; j++) {
				if(pets.get(i).getTags().contains(tags[j])) {
					result.add(pets.get(i));
				}
			}
		}
		return result;
	}
	public void updatePet(int id, Pet pet) {
		for(int i=0; i < pets.size(); i++) {
			if(pets.get(i).getId()==id) {
				pets.set(i, pet);
				return;
			}
		}
	}
	
	public void addImage(int id, String img) {
		for(int i=0; i < pets.size(); i++) {
			if(pets.get(i).getId()==id) {
				pets.get(i).setPhotoUrl(img);
				return;
			}
		}
	}
	
	public List<Pet> getByStatus(String status){
		List<Pet> result = new ArrayList<>();
		for(int i=0; i < pets.size(); i++) {
			if(pets.get(i).getStatus().equals(status)) {
				result.add(pets.get(i));
			}
		}
		return result; 
	}
	
	public void updateNameAndStatus(int id, String name, String status) {
		for(int i=0; i < pets.size(); i++) {
			if(pets.get(i).getId()==id) {
				pets.get(i).setName(name);
				pets.get(i).setStatus(status);
				return;
			}
		}
	}
	
	public void deletePet(int id) {
		for(int i=0; i < pets.size(); i++) {
			if(pets.get(i).getId()==id) {
				pets.remove(i);
				return;
			}
		}
	}

}
 