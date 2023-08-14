package com.salvar_pra_um.salvar.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salvar_pra_um.salvar.dto.PersonDepartmentDTO;
import com.salvar_pra_um.salvar.entities.Department;
import com.salvar_pra_um.salvar.entities.Person;
import com.salvar_pra_um.salvar.repository.DepartmentRepository;
import com.salvar_pra_um.salvar.repository.PersonRepository;


@Service
public class PersonService {

	@Autowired
	private PersonRepository repository;
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public PersonDepartmentDTO insert(PersonDepartmentDTO dto) {
		Person entity = new Person();
		entity.setName(dto.getName());
		entity.setSalary(dto.getSalary());
		
		Department dept = departmentRepository.getReferenceById(dto.getDepartment().getId());
		//dept.setId(dto.getDepartment().getId());
	    entity.setDepartment(dept);
	
	    entity = repository.save(entity);
		return new PersonDepartmentDTO(entity);
	}
}
