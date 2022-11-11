package ai.glamorous.service;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ai.glamorous.entity.ProjectEntity;
import ai.glamorous.repo.ProjectRepo;

@Service
public class ProjectServiceImpl {
	
	@Autowired
	private ProjectRepo projectRepo;
	
	@Transactional
	public void saveBulk(List<ProjectEntity> bulkEntry) {
		Set<String> failedProjectNames = new LinkedHashSet<String>();
		
		if(bulkEntry != null && bulkEntry.size() > 0) {
			for(ProjectEntity entry : bulkEntry) {
				try {
					projectRepo.save(entry);
				} catch (Exception e) {
					//Exception occured
					failedProjectNames.add(entry.getName());
				}
			}
		}
	}

}
