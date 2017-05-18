/**
 * 
 */
package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pooja
 *
 */
@RestController
public class UserController {

	@RequestMapping("/user")
	public User getUser(@RequestParam(value="id", defaultValue="1") int id) {
		
		return new User(id);
		
	}
}
