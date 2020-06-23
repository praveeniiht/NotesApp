package com.iiht.yaksha.juniorfsd.juniorfsd.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.iiht.yaksha.juniorfsd.juniorfsd.controller.HomeController;
import com.iiht.yaksha.juniorfsd.juniorfsd.dao.NotesDaoImpl;
import com.iiht.yaksha.juniorfsd.juniorfsd.model.Notes;
import com.iiht.yaksha.juniorfsd.juniorfsd.test.utils.MasterData;
import static com.iiht.yaksha.juniorfsd.juniorfsd.test.utils.TestUtils.*;

@RunWith(MockitoJUnitRunner.class)
public class TestNotesController {

	@Mock
	private NotesServiceImpl notesService;
	
	@InjectMocks
	private HomeController homeController;
	
	private MockMvc mockmvc;

	
	@Before 
	public void init() { 
		MockitoAnnotations.initMocks(this); 
		this.mockmvc = MockMvcBuilders.standaloneSetup(homeController)
				.build();
	}

		@Test
	public void testHomePage() throws Exception {
		MvcResult result = this.mockmvc.perform(get("/")).andExpect(view().name("index")).andReturn();
		yakshaAssert(currentTest(),(result.getResponse().getStatus() == HttpStatus.OK.value() ? true : false),businessTestFile);
	}
	@Test
	public void testStatusPage() throws Exception {
		MvcResult result = this.mockmvc.perform(get("/statusManager")).andExpect(view().name("statusmanager")).andReturn();
		yakshaAssert(currentTest(),(result!=null ? true : false),businessTestFile);
	}
	/*
	 * testViewAllPage method is used to test whether redirecting to 
	 * viewAll page, expected 
	 */
	@Test
	public void testViewAllPage() throws Exception {
		MvcResult result = this.mockmvc.perform(get("/viewlAll")).andExpect(view().name("viewall")).andReturn();
		yakshaAssert(currentTest(),(result!=null ? true : false),businessTestFile);
	}
	
	
	
}
