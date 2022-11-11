package ai.glamorous.entity;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Builder;

@Builder
@Entity
public class ProjectEntity {
	
	@Id
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "creation_data")
	private Date creationDate;
	
	@Column(name = "molecule")
	private String molecule;
	
	@Column(name = "project_status")
	private String status;
	
	@Column(name = "user_id")
	private Long userId;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getMolecule() {
		return molecule;
	}

	public void setMolecule(String molecule) {
		this.molecule = molecule;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProjectEntity other = (ProjectEntity) obj;
		return Objects.equals(name, other.name) && Objects.equals(userId, other.userId);
	}

}
