package com.example.exception;

import org.springframework.http.HttpStatus;

/**
 * API business exception
 *
 * @author <a href="mailto:mauricionrgarcia@gmail.com">Mauricio Garcia</a>
 * @version
 * @sinse 18/02/2018 20:04:37
 */
public class BusinessException extends Exception {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -921775727443834374L;

	/**
	 * error code
	 */
	private String code;

	/**
	 * represent the {@link HttpStatus} code
	 */
	private HttpStatus statusCode;

	/**
	 * error mesage (business)
	 */
	private String message;

	/**
	 * description of the error message (developer)
	 */
	private String erroMessage;

	/**
	 * Arguments to message
	 */
	private Object[] argsMessage;

	/**
	 * Constructor
	 */
	public BusinessException() {
		super();
	}

	/**
	 * Constructor
	 *
	 * @param code code
	 */
	public BusinessException(String code) {
		this.code = code;
	}

	/**
	 * Constructor
	 *
	 * @param code code
	 * @param erroMessage message
	 * @param cause description of the error message
	 */
	public BusinessException(String code, String message, String erroMessage, HttpStatus statusCode,
			Object... argsMessage) {
		super(code);
		this.code = code;
		this.message = message;
		this.erroMessage = erroMessage;
		this.statusCode = statusCode;
		this.argsMessage = argsMessage;
	}

	/**
	 * Constructor
	 *
	 * @param code code
	 * @param erroMessage mensagem
	 * @param cause description of the error message
	 * @param e Throwable
	 */
	public BusinessException(String code, String message, String erroMessage, Throwable e) {
		super(code, e);
		this.code = code;
		this.message = message;
		this.erroMessage = erroMessage;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the message
	 */
	@Override
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the erroMessage
	 */
	public String getErroMessage() {
		return erroMessage;
	}

	/**
	 * @param erroMessage the erroMessage to set
	 */
	public void setErroMessage(String erroMessage) {
		this.erroMessage = erroMessage;
	}

	public HttpStatus getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(HttpStatus statusCode) {
		this.statusCode = statusCode;
	}

	public Object[] getArgsMessage() {
		return argsMessage;
	}

	public void setArgsMessage(Object[] argsMessage) {
		this.argsMessage = argsMessage;
	}

}