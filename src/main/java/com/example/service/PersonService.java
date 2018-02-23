package com.example.service;

import com.example.exception.BusinessException;
import com.example.model.Person;

/**
 * Interface to person service.
 * 
 * @author <a href="mailto:mauricionrgarcia@gmail.com">Mauricio Garcia</a>
 * @version
 * @sinse 18/02/2018 19:27:02
 */
public interface PersonService {

	/**
	 * find a specific Person by:
	 * 
	 * @param code: code identifier
	 * @return Person
	 * @throws BusinessException BusinessException
	 */
	Person find(Long code) throws BusinessException;

	/**
	 * save a new Person
	 * 
	 * @param person person
	 * @return {@link Person}
	 * @throws BusinessException BusinessException
	 */
	Person savePerson(Person person) throws BusinessException;

}
