package de.lubowiecki.products;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@RequestMapping("/") // http://localhost:8080/xyz
	public String machWas() {
		return "basic"; // basic.html wird in resources/templates gesucht
	}
}
