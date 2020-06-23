package com.iiht.yaksha.juniorfsd.juniorfsd.dao;

import java.util.List;

import com.iiht.yaksha.juniorfsd.juniorfsd.model.Notes;



public interface NotesDao {
	
public List<Notes> getAllNodes();
	
	public boolean insertNote(Notes note);
	
	public Boolean deleteNote(Long id);
	
	
	public Notes getNoteById(Long id);

	public List<Notes> getAllNotes();
	
	public Long updateNote(Notes note);
	
}
