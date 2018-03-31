package com.caveofprogramming.spring.web.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.caveofprogramming.spring.web.service.OffersService;
import com.spring.models.Offer;

@Controller
public class OffersController {
	
	private OffersService offersService;
	
	@Autowired
	public void setOffersService(OffersService offersService) {
		this.offersService = offersService;
	}
	
	@RequestMapping("/offerscreate")
	public String showofferscreate() {
		
		return "offerscreate";
	}
	

	@RequestMapping("/offers")
	public String showOffer(Model model) {
		
		List<Offer> offers = offersService.getCurrent();
		
		model.addAttribute("offers", offers);
		
		return "offers";
	}
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String showTest(Model model, @RequestParam("id")String id)
	{
		System.out.println("value - "+id);
		return "home";
		
	}
	
	@RequestMapping("/offerCreate")
	public String offerCreate(Model model) {
		model.addAttribute("offer", new Offer());
		return "offerCreate";
	}
	
	
	
	@RequestMapping(value="/offerSuccess" , method=RequestMethod.POST)
	public String offerSuccess(Model model,@Valid Offer offer,BindingResult result) {
		
		System.out.println(offer);
		
		if(result.hasErrors())
		{
			System.out.println("Form is not valid");
			List<ObjectError> error = result.getAllErrors();
			
			for(ObjectError errors : error)
			{
				System.out.println(errors.getDefaultMessage());
			}
			
			
			
			return "offerCreate";
		}
		this.offersService.create(offer);
		return "offerSuccess";
	}
	

	
	@RequestMapping("/frame")
	public String showFrame() {
		
		return "frame";
	}
	@RequestMapping("/")
	public String showHome(Model model) {
		
		List<Offer> offers = offersService.getCurrent();
		
		model.addAttribute("offers", offers);
		
		return "home";
	}
}
