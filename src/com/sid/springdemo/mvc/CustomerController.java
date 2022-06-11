package com.sid.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	// Add an initbinder ... to convert trim input strings
	// Remove leading and trailing whitespace
	// Resolve issue for our validation
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor strinEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, strinEditor);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		model.addAttribute("customer",new Customer());
		return "customer-form";
	}
	
	@RequestMapping("processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
		//System.out.println("Last name : |"+customer.getLastName()+"|");
		//System.out.println("Bindinnngggg...");
		//System.out.println("BindingResult : "+bindingResult);
		//System.out.println("\n\n\n\n");
		if(bindingResult.hasErrors()) 
			return "customer-form";
		else
			return "customer-confirmation";
	}
}
