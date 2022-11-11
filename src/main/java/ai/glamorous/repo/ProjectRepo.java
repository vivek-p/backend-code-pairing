package ai.glamorous.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ai.glamorous.entity.ProjectEntity;

public interface ProjectRepo extends JpaRepository<ProjectEntity, Long> {
	
	ProjectEntity findByNameAndUserId(String name, Long userId);
	
	ProjectEntity findByNameAndUserIdAndStatus(String name, Long userId, String status);

}
