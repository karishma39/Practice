package pojo;

import java.util.List;


	public class GetPets{
	    public long id;
	    public PetCategory category;
	    public String name;
	    public List<String> photoUrls;
	    public List<Tag> tags;
	    public String status;
	    
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public PetCategory getCategory() {
			return category;
		}
		public void setCategory(PetCategory category) {
			this.category = category;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<String> getPhotoUrls() {
			return photoUrls;
		}
		public void setPhotoUrls(List<String> photoUrls) {
			this.photoUrls = photoUrls;
		}
		public List<Tag> getTags() {
			return tags;
		}
		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
	    
	    
	}



