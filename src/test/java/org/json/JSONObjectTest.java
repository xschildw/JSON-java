package org.json;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JSONObjectTest {
	
	@Test
	public void testToStringAsLong() {
		JSONObject object = new JSONObject("{\"key\":123}") ;
		String value =  object.getString("key");
		assertEquals("123", value);
	}
	
	@Test
	public void testToStringAsInteger() {
		JSONObject object = new JSONObject();
		object.put("key", 123);
		String value =  object.getString("key");
		assertEquals("123", value);
	}
	
	@Test
	public void testToStringAsString() {
		JSONObject object = new JSONObject("{\"key\":\"astring\"}") ;
		String value =  object.getString("key");
		assertEquals("astring", value);
	}
	
	@Test
	public void testToStringAsDouble() {
		JSONObject object = new JSONObject("{\"key\":1.123e12}") ;
		String value =  object.getString("key");
		assertEquals("1.123E12", value);
	}

	@Test
	public void testToStringAsBoolean() {
		JSONObject object = new JSONObject("{\"key\":true}") ;
		String value =  object.getString("key");
		assertEquals("true", value);
	}
	
	@Test
	public void testToStringAsArray() {
		JSONObject object = new JSONObject("{\"key\":[\"a\",\"b\"]}") ;
		String value =  object.getString("key");
		assertEquals("[\"a\",\"b\"]", value);
	}
	
	@Test
	public void testToStringAsJSONObject() {
		JSONObject object = new JSONObject("{\"key\":{\"subKey\":456}}")  ;
		String value =  object.getString("key");
		assertEquals("{\"subKey\":456}", value);
	}
}
