package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.domain.Student;

@RepositoryRestResource(collectionResourceRel="students", path="students")
public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {

	List<Student> findByName(String name);
	
	List<Student> findByNameAndFamily(String name, String family);
}
