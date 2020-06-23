package com.iiht.yaksha.juniorfsd.juniorfsd.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iiht.yaksha.juniorfsd.juniorfsd.model.Notes;



@Repository
public class NotesDaoImpl implements NotesDao {
	
	@Autowired
    private SessionFactory sessionFactory;

	
	
	@Override
	public List<Notes> getAllNotes() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Notes").getResultList();
	}

	@Override
	public boolean insertNote(Notes note) {
		// TODO Auto-generated method stub
		System.out.println(note);
		Serializable k = sessionFactory.getCurrentSession().save(note);
		if(k!=null)
			return true;
		else
			return false;
		
	}

	@Override
	public Boolean deleteNote(Long id) {
		// TODO Auto-generated method stub
		Notes note = (Notes) sessionFactory.getCurrentSession().load(
                Notes.class, id);
        if (null != note) {
            this.sessionFactory.getCurrentSession().delete(note);
        }
		return true;
	}

	@Override
	public Notes getNoteById(Long id) {
		// TODO Auto-generated method stub
		
		Notes note = (Notes) sessionFactory.getCurrentSession().load(Notes.class,id);
		System.out.println(note.getAuthor());
		return note;
		
		
	}

	@Override
	public List<Notes> getAllNodes() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Notes").getResultList();
	}

	@Override
	public Long updateNote(Notes note) {
		// TODO Auto-generated method stub
		System.out.println(note);
		sessionFactory.getCurrentSession().update(note);
		return note.getId();
		//sessionFactory.getCurrentSession().load(Notes.class, note.getId());
	}

}
