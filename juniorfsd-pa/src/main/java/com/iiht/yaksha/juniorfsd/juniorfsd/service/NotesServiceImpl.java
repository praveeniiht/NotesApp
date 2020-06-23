package com.iiht.yaksha.juniorfsd.juniorfsd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iiht.yaksha.juniorfsd.juniorfsd.dao.NotesDao;
import com.iiht.yaksha.juniorfsd.juniorfsd.model.Notes;

@Service
@Transactional
public class NotesServiceImpl implements NotesService{
	
	@Autowired
	private NotesDao notesDao;

	@Override
	public List<Notes> getAllNodes() {
		// TODO Auto-generated method stub
		return notesDao.getAllNotes();
	}

	@Override
	public boolean insertNote(Notes note) {
		return notesDao.insertNote(note);
		
	}
	
	@Override
	public Boolean deleteNote(Long id) {
		// TODO Auto-generated method stub
		return notesDao.deleteNote(id);
	}
	

	

	@Override
	public Long updateNote(Notes note) {
		// TODO Auto-generated method stub
		  notesDao.updateNote(note);
		  return note.getId();
	}

	@Override
	public Notes getNoteById(Long id) {
		// TODO Auto-generated method stub
		return notesDao.getNoteById(id);
	}

	

	
	

}