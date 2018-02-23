package com.example.exception;

import org.springframework.http.HttpStatus;

/**
 * Resource not found
 * 
 * @author <a href="mailto:mauricionrgarcia@gmail.com">Mauricio Garcia</a>
 * @version
 * @sinse 18/02/2018 20:17:45
 */
public class ResourceNotFoundException extends BusinessException {

	/**
	 * resource not found
	 */
	private static final String RESOURCE = "resource.not.found";

	/**
	 * entity not found
	 */
	private static final String ENTITY = "entity.not.found";

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 8219378476262189725L;

	/**
	 * Contruct default message
	 */
	public ResourceNotFoundException() {
		super(RESOURCE, null, "resource not found", HttpStatus.NOT_FOUND);
	}

	/**
	 * Contruct default message
	 */
	public ResourceNotFoundException(Object... args) {
		super(ENTITY, null, "resource not found", HttpStatus.NOT_FOUND, args);
	}

}
