package academy.olga.homework15.java_notebook0.src.edu.examples.java_classes.logic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import academy.olga.homework15.java_notebook0.src.edu.examples.java_classes.dao.NoteBookDao;
import academy.olga.homework15.java_notebook0.src.edu.examples.java_classes.entity.Note;

public class NotebookLogic {

    private final NoteBookDao dao = new NoteBookDao();

    public void add(Note n) {
        dao.save(n);
    }

    public void add(String title, String content) {
        //NoteBookDao dao = new NoteBookDao();
        Note n = new Note(title, content);

        dao.save(n);
    }

    public void remove(Note n) {
        dao.del(n);
    }

    public void remove(String title, String content) {
        Note n = new Note(title, content);
        dao.del(n);
    }

    public List<Note> find(String text) {
        List<Note> result = new ArrayList<Note>();
        List<Note> myNotes = dao.allNotes();

        for (Note n : myNotes) {
            if (isTextInNote(n, text)) {
                result.add(n);
            }
        }

		for(int i=0; i<myNotes.size(); i++) {
			Note n = myNotes.get(i);
		}
        return result;

    }

    private boolean isTextInNote(Note n, String text) {
        return n.getTitle().contains(text) || n.getContent().contains(text);
    }

    public List<Note> find(Date date) {
        List<Note> result = new ArrayList<>();

        List<Note> myNotes = dao.allNotes();

        for (Note note : myNotes) {
            if (note.getD().equals(date)) {
                result.add(note);
            }
        }

        return result;

    }

    public List<Note> allNotes() {
        return dao.allNotes();
    }

}
