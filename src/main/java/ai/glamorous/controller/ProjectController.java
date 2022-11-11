package ai.glamorous.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ai.glamorous.entity.ProjectEntity;
import ai.glamorous.service.ProjectServiceImpl;

@RestController
public class ProjectController {

	@Autowired
	ProjectServiceImpl service;
	
	@PostMapping("/save/all")
	public ResponseEntity<List<String>> saveBulkOperation(@RequestBody List<ProjectEntity> listEntries) {
		return null;
	}
	
	@PostMapping("/save")
	public void saveEntry(@RequestBody ProjectEntity entity) {
		
	}
	
	@PutMapping
	public void updatEntry(@RequestBody ProjectEntity entry, Long id) {
		
	}
}
