package academy.olga.homework15.java_notebook0.src.edu.examples.java_classes.output;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import academy.olga.homework15.java_notebook0.src.edu.examples.java_classes.entity.Note;
import academy.olga.homework15.java_notebook0.src.edu.examples.java_classes.logic.NotebookLogic;

public class NotebookOutput {
	
	public void print(String title, List<Note> notes) {

		System.out.println(title.toUpperCase());
		System.out.println();
		
		if(notes == null || notes.size() <= 0) {
			System.out.println("Нет записей для вывода.");
			return;
		}
		
		for(Note n : notes) {
			System.out.println(n.getId() + " - " + n.getTitle()+ " | " + n.getD());
		}
		
	}
}
