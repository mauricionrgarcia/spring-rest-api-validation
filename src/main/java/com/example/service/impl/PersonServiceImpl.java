package com.example.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.BusinessException;
import com.example.exception.ResourceNotFoundException;
import com.example.model.Person;
import com.example.repository.PersonRepository;
import com.example.service.PersonService;

/**
 * implementation of inteface {@link PersonService}.
 * 
 * @author <a href="mailto:mauricionrgarcia@gmail.com">Mauricio Garcia</a>
 * @version
 * @sinse 18/02/2018 19:30:11
 */
@Service
public class PersonServiceImpl implements PersonService {

	/**
	 * Person Repository
	 */
	@Autowired
	private transient PersonRepository personRepository;

	public Person find(Long code) throws BusinessException {
		Optional<Person> optional = personRepository.findByCode(code);
		return optional.orElseThrow(() -> new ResourceNotFoundException("person"));
	}

	@Override
	public Person savePerson(Person person) throws BusinessException {
		Person personEntity = personRepository.save(person);
		return personEntity;
	}

}
