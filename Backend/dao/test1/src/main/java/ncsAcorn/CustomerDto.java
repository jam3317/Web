package ncsAcorn;

public class CustomerDto {

	String name;
	String id;
	String address;
	
	public CustomerDto() {

	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public CustomerDto(String name, String id, String address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}
	
}
