package com.codein.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codein.entities.Peranan;
import com.codein.service.PerananService;

@Controller
@RequestMapping("peranan")
public class PerananController {
	
	@Autowired
	private PerananService perananService;
	
	/*
	 * handle request index
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		modelMap.put("peranans", perananService.findAll());
		return "peranan/index";
	}
	
	/*
	 * method add new account
	 */
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String add(ModelMap modelMap){
		modelMap.put("peranan", new Peranan());
		return "peranan/add";
	}
	
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(@ModelAttribute("peranan") Peranan peranan,
			ModelMap modelMap){
		perananService.save(peranan);
		return "redirect:../peranan";
	}
	
	/*
	 * method delete account
	 */
	
	@RequestMapping(value = "delete/{id}", 
			method = RequestMethod.GET)
	public String delete(@PathVariable("id") int id){
		perananService.delete(perananService.find(id));
		return "redirect:/peranan";
	}
	
	/*
	 * method edit
	 */
	@RequestMapping(value = "edit/{id}", method = RequestMethod.GET)
	public String edit(@PathVariable("id") int id, ModelMap modelMap){
		modelMap.put("peranan", perananService.find(id));
		return "peranan/edit";
	}
	
	@RequestMapping(value = "edit", method = RequestMethod.POST)
	public String edit(@ModelAttribute("account") Peranan peranan, ModelMap modelMap){
		Peranan currentAccount = perananService.find(peranan.getId());
		currentAccount.setUsername(peranan.getUsername());
		currentAccount.setPeran(peranan.getPeran());
		currentAccount.setDescription(peranan.getDescription());
//		if(!account.getPassword().isEmpty()){
//			currentAccount.setPassword(account.getPassword());
//		}
		perananService.save(currentAccount);
		return "redirect:../peranan";
	}
}
