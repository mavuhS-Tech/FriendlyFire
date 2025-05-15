package abstraction;

public abstract class AbstractObject {
	int id;
	String name;
	public AbstractObject(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public static void main(String[] args) {
//		AbstractObject aobj = new AbstractObject(4,"Shuvam");		Abstract classes can have constructors, but cannot be instantiated
		
	}
}
