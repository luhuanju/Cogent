
public class MethodOverriding {
	
	public class ParentClass {
		public void printMessage() {
			System.out.println("Parent call");
		}

	}

	public class ChildClass extends ParentClass {

		public void printMessage() {
			System.out.println("Children call");
		}

	}

	public static void main(String[] args) {

		MethodOverriding tesMethodOverriding = new MethodOverriding();
		ParentClass parent = tesMethodOverriding.new ParentClass();
		ChildClass child = tesMethodOverriding.new ChildClass();

		parent.printMessage();
		child.printMessage();
	}





	
}
