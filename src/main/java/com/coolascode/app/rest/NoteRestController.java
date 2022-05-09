package com.coolascode.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coolascode.app.entity.Note;
import com.coolascode.app.service.INoteService;


@CrossOrigin
@RestController
@RequestMapping("/api")
public class NoteRestController {
	
	@Autowired
	private INoteService noteService;
	
	//Get Note
	@GetMapping("/note")
	public List<Note> getAllNote() {
		return noteService.getNote();
		
	}
	
	//Add Prescription for Medicine
	@PostMapping("/note")
	public void addNote(@RequestBody Note note) {
		noteService.saveNote(note);
 
	}
	
	//update Prescription for Medicine
	@PutMapping("/note")
	public void updateNote(@RequestBody Note note) {
		noteService.saveNote(note);

	}
	
	//Delete Prescription for Medicine
	@DeleteMapping("/note/{id}")
	public void deleteNote(@PathVariable int id) {
		noteService.deleteNote(id);

	}

}
