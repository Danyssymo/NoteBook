package academy.olga.homework15.java_notebook0.src.edu.examples.java_classes.util;

public final class GenerateId {
	
	private GenerateId() {}
	
	private static int nextId = 1;
	
	public static int nextId() {
		return nextId++;
	}

}
