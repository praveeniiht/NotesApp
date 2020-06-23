package com.iiht.yaksha.juniorfsd.juniorfsd.service;

import java.util.List;

import com.iiht.yaksha.juniorfsd.juniorfsd.model.Notes;



public interface NotesService {
	
	// This method is to get All notes 
	public List<Notes> getAllNodes();
	
	
	
	// This method is to insert a new note
	public boolean insertNote(Notes note);
	
	
	//This method is to deletea a note 
	public Boolean deleteNote(Long id);
	
	
	// This method sis to retreive a note by its Noteid
	//public Notes getNoteById(Integer id);
	
	public Long updateNote(Notes note);



	public Notes getNoteById(Long id);
	
	

}
