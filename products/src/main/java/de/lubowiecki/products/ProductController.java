package de.lubowiecki.products;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	private ProductRepository repository = new ProductRepository();
		
	@RequestMapping("/") // http://localhost:8080/
	public String showAll(Model model) {
		model.addAttribute("headline", "Alle Produkte");
		model.addAttribute("products", repository.findAll()); // Sendet alle Produkte an das Template
		return "list"; // list.html wird in resources/templates gesucht
	}
	
	@GetMapping("/add") // http://localhost:8080/add
	public String showForm(Model model) {
		model.addAttribute("headline", "Neues Produkt");
		return "form";
	}
	
	@PostMapping("/add")
	public String processForm(Product product) {
		repository.add(product);
		return "redirect:/"; // umleitung auf http://localhost:8080/
	}
}
