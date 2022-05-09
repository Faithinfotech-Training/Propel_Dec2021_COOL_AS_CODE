package com.coolascode.app.service;

import java.util.List;
import java.util.Optional;

import com.coolascode.app.entity.Note;

public interface INoteService {
	
	//List
	public List<Note> getNote();
	
	
	//Insert/ADD
	public void saveNote(Note note);
	
	//Update
	public Optional <Note> getNote(int id);
	
	//Delete
	public void deleteNote(int id);

}
