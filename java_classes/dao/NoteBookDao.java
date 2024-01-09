package academy.olga.homework15.java_notebook0.src.edu.examples.java_classes.dao;

import java.util.List;

import academy.olga.homework15.java_notebook0.src.edu.examples.java_classes.entity.Note;
import academy.olga.homework15.java_notebook0.src.edu.examples.java_classes.entity.Notebook;
import academy.olga.homework15.java_notebook0.src.edu.examples.java_classes.source.NoteBookProvider;

public class NoteBookDao {

	/*
	 * public void create() { NoteBookProvider.getInstance(); }
	 */
	
	private final NoteBookProvider provider = NoteBookProvider.getInstance();
	private final Notebook nb = provider.getNotebook();

	public void save(Note n) {
		nb.setNotes(n);
	}
	public void del(Note n) {
		nb.removeNotes(n);
	}

	public List<Note> allNotes() {
		return nb.getNotes();
	}

	public Note getNote( int index)
	{
		return nb.getNotes(index);
	}
}
