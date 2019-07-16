package com.mastek.training.hrapp.apis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


import com.mastek.training.hrapp.entities.Project;
import com.mastek.training.hrapp.repositories.ProjectRepository;


@Component
@Scope("singleton")
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	
	
	public ProjectService() {
		System.out.println("Project Service Created");
	}
	
	public Project registerOrUpdateProject(Project project) {
		project = projectRepository.save(project);
		System.out.println("Project Registered "+project);
		return project;
	}
	
	public Project findByProjectId(int projectId) {
		try {
			return projectRepository.findById(projectId).get();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
		
	public void deleteByProjectId(int projectId) {
			projectRepository.deleteById(projectId);
			
		}	
	
}
