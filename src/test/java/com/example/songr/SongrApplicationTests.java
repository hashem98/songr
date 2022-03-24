package com.example.songr;

import com.example.songr.Model.Album;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class SongrApplicationTests {

	Album test = new Album();

	/**
	 * Constructor Test on null object
	 */
	@Test
	public void testConstructor(){
		Assertions.assertNull(test.getArtist());
	}

	/**
	 *  Constructor Test on not null object
	 */
	@Test
	public void testConstructorWithValues(){
		test = new Album("frank sinatra", "My way", 10, 300, "sdsd");
		Assertions.assertNotNull(test.getArtist());
	}

	/**
	 * Getters Testing
	 */

	@Test
	public void testGetters(){
		test = new Album("My way", "frank sinatra", 10, 300, "sdsd");
		Assertions.assertEquals("My way",test.getTitle());
		Assertions.assertEquals("frank sinatra",test.getArtist());
		Assertions.assertEquals(10,test.getSongCount());
		Assertions.assertEquals(300,test.getLength());
		Assertions.assertEquals("sdsd",test.getImageUrl());
	}

	/**
	 * Setters Testing
	 */
	@Test
	public void testSetters(){
		test = new Album();
		test.setTitle("My way");
		test.setArtist("frank sinatra");
		test.setSongCount(5);
		test.setLength(30);
		test.setImageUrl("sdsd");
		Assertions.assertEquals("My way",test.getTitle());
		Assertions.assertEquals("frank sinatra",test.getArtist());
		Assertions.assertEquals(5,test.getSongCount());
		Assertions.assertEquals(30,test.getLength());
		Assertions.assertEquals("sdsd",test.getImageUrl());
	}

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void shouldReturnDefaultMessage() throws Exception {
		this.mockMvc.perform(get("/hello")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("Hello World!")));
	}


}
