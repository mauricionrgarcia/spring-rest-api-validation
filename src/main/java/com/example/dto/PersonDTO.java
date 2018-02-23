package com.example.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.example.model.GenreEnum;
import com.example.model.Person;

/**
 * Dto to entity {@link Person}
 * 
 * @author <a href="mailto:mauricionrgarcia@gmail.com">Mauricio Garcia</a>
 * @version
 * @sinse 18/02/2018 22:48:34
 */
public class PersonDTO implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 4126089017877338611L;
	/**
	 * identifier
	 */
	private Long code;
	/**
	 * name
	 */
	private String name;
	/**
	 * date of birth
	 */
	private LocalDate dtBirth;
	/**
	 * genre @see {@link GenreEnum}
	 */
	private GenreEnum genre;

	/**
	 * @return the code
	 */
	public Long getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(Long code) {
		this.code = code;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the dtBirth
	 */
	public LocalDate getDtBirth() {
		return dtBirth;
	}

	/**
	 * @param dtBirth the dtBirth to set
	 */
	public void setDtBirth(LocalDate dtBirth) {
		this.dtBirth = dtBirth;
	}

	/**
	 * @return the genre
	 */
	public GenreEnum getGenre() {
		return genre;
	}

	/**
	 * @param genre the genre to set
	 */
	public void setGenre(GenreEnum genre) {
		this.genre = genre;
	}

}
