package de.lubowiecki.products;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	//private ProductMemRepository repository = new ProductMemRepository();
	
	@Autowired
	private ProductRepository repository;
		
	@RequestMapping("/") // http://localhost:8080/
	public String showAll(Model model) {
		model.addAttribute("headline", "Alle Produkte");
		model.addAttribute("products", repository.findAll()); // Sendet alle Produkte an das Template
		return "list"; // list.html wird in resources/templates gesucht
	}
	
	@GetMapping("/add") // http://localhost:8080/add
	public String showNewForm(Model model) {
		model.addAttribute("headline", "Neues Produkt");
		model.addAttribute("product", new Product());
		return "form";
	}
	
	@GetMapping("/edit/{id}") // http://localhost:8080/edit/1
	public String showEditForm(@PathVariable int id, Model model) {
		model.addAttribute("headline", "Produkt bearbeiten");
		
//		Product p = repository.findById(id);
//		if(p == null)
//			p = new Product();
//		model.addAttribute("product", p);
		
		Optional<Product> opt = repository.findById(id);
		model.addAttribute("product", opt.orElse(new Product()));
		return "form";
	}
	
	@PostMapping("/save")
	public String processForm(Product product) {
		repository.save(product);
		
//		if(product.getId() > 0) {
//			repository.update(product);
//		}
//		else {
//			repository.add(product);
//		}
		return "redirect:/"; // umleitung auf http://localhost:8080/
	}
	
	@GetMapping("/delete/{id}") // http://localhost:8080/delete/2
	public String delete(@PathVariable int id) {
		repository.deleteById(id);
		return "redirect:/"; // umleitung auf http://localhost:8080/
	}
}
