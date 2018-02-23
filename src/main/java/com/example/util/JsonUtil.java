package com.example.util;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/***
 * Simple parse object**
 * 
 * @author <a href="mailto:mauricionrgarcia@gmail.com">Mauricio Garcia</a>
 * @version
 * @sinse 18/02/2018 20:08:27
 */
public class JsonUtil {

	/**
	 * {@link ObjectMapper}
	 */
	static ObjectMapper mapper = new ObjectMapper();

	/**
	 * @param arg0
	 * @return json
	 */
	public static String toJson(Object arg0) {
		try {
			return mapper.writeValueAsString(arg0);
		} catch (JsonProcessingException e) {
			return StringUtils.EMPTY;
		}

	}

}
