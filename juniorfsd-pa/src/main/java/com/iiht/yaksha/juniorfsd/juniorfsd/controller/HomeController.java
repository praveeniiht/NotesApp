package com.iiht.yaksha.juniorfsd.juniorfsd.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import com.iiht.yaksha.juniorfsd.juniorfsd.model.Notes;
import com.iiht.yaksha.juniorfsd.juniorfsd.service.NotesService;


@Controller
public class HomeController {
   
	@Autowired
	private NotesService notesService;
	 
	/*
	  Initial request will be mapped to this method and redirects to home page
	  
	  */
	 	 
	 @RequestMapping(value = "/")
	public ModelAndView showHomePage(HttpServletResponse response) throws IOException {
		 System.out.println("Inside the root method...");
		return new ModelAndView("index");
	}
	 @RequestMapping(value = "/gotoHome")
		public ModelAndView homePage(HttpServletResponse response) throws IOException {
			return new ModelAndView("index");
		}
	
	 /*
	 * This method will receive request from browser and redirects to addnote.jsp
	 * page to read the notes deails from the user
	 * 
	 */
	@RequestMapping(value = "/addNote")
	public ModelAndView addNote(HttpServletResponse response) throws IOException {
		return new ModelAndView("addnote");
	}
	

	/*
	 * This method will receive request from browser and redirects to addnote.jsp
	 * page to read the notes deails from the user
	 * 
	 */
	@RequestMapping(value = "/deleteNote")
	public ModelAndView deleteNote(HttpServletRequest request) throws IOException {
		Long noteid = Long.parseLong(request.getParameter("id"));
		notesService.deleteNote(noteid);
		List<Notes> notes = notesService.getAllNodes();
		return new ModelAndView("statusmanager", "notes", notes);

	}

	
	/*
	 * This method will receives the note id  from status manager and fetches the corresponding 
	 * note and sends that note info to editnote.jsp page to allow the user to modify and
	 * save back to database
	 * 
	 */
	
	@RequestMapping(value = "/editNote")
	public ModelAndView editNote(HttpServletRequest request) throws IOException {
		System.out.println(request.getParameter("id"));
		Long id = Long.parseLong(request.getParameter("id"));
		System.out.println(id);
		Notes note = notesService.getNoteById(id);
		System.out.println(note);
		return new ModelAndView("update","note",note);
	}
	
	/*
	 * This method will resend to statusmanager jsp page to display the statuses of all the 
	 *  user posts
	 */
	
	@RequestMapping(value = "/statusManager")
	public ModelAndView statusManager(HttpServletResponse response) throws IOException {
		List<Notes> notes = notesService.getAllNodes();
		System.out.println(notes);
		return new ModelAndView("statusmanager", "notes", notes);
	}

	
	
	/*
	 * This method will resend to view all  jsp page to display the public posts  of all the 
	 *  users
	 */
	@RequestMapping(value = "/viewlAll")
	public ModelAndView viewlAll(HttpServletResponse response) throws IOException {
		List<Notes> notes = notesService.getAllNodes();
		return new ModelAndView("viewall", "notes", notes);
		
	}

	
	
	/*
	 * This method is used to add a new post and update post
	 * 
	 */
	
	
	
	@RequestMapping(value = "/updateNote", method = RequestMethod.POST)
	public String updateNote(@ModelAttribute("note") Notes note) {
		//System.out.println(note);
		notesService.updateNote(note);
		//ModelAndView mnv = new ModelAndView("index");
		//mnv.setViewName("index");
		return "index";
	}
	@RequestMapping(value = "/addnewnote")
	public ModelAndView addNewNote(@RequestParam String title, @RequestParam String author,
			@RequestParam String description, @RequestParam String status) {
		Notes note = new Notes();
		note.setAuthor(author);
		note.setDescription(description);
		note.setStatus(status);
		note.setTitle(title);
		System.out.println(note);
		notesService.insertNote(note);
		return new ModelAndView("index");
	}
}
