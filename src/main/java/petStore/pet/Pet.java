package petStore.pet;

import java.util.List;

public class Pet {
	
	private int cur = 3;
	private int id;
	private String name;
	private String category;
	private String photoUrl;
	private List<String> tags;
	private String status;
	
	
	
	public Pet(int id,String name, String category, String photoUrl, List<String> tags, String status) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.photoUrl = photoUrl;
		this.tags = tags;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
