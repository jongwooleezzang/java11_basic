package sec1;

public class Animal {
	private String name;
	private boolean spine;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isSpine() {
		return spine;
	}
	public void setSpine(boolean spine) {
		this.spine = spine;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", spine=" + spine + "]";
	}
	
}
