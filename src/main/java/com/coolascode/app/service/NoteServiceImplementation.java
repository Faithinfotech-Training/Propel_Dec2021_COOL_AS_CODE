package com.coolascode.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coolascode.app.dao.INoteRepository;
import com.coolascode.app.entity.Note;

@Service
public class NoteServiceImplementation implements INoteService {
	
	@Autowired
	private INoteRepository noterepo;

	//List
	@Override
	public List<Note> getNote() {
		return (List<Note>) noterepo.findAll();
	}

	//Insert/ADD
	@Override
	public void saveNote(Note note) {
		noterepo.save(note);

	}

	//Update
	@Override
	public Optional<Note> getNote(int id) {
		return noterepo.findById(id);
	}

	//Delete
	@Override
	public void deleteNote(int id) {
		noterepo.deleteById(id);

	}

}
