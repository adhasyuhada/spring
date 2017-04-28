package demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import demo.model.Peranan;
import demo.services.PerananService;

@Controller
public class PerananController {
	
	private PerananService perananService;
	
	
	@Autowired
	public void setPerananService(PerananService perananService){
		this.perananService = perananService;
	}
	
	@RequestMapping(value = "/peranan", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("peranan", perananService.listAllPeranan());
        System.out.println("Returning rpoducts:");
        return "peranan";
    }
	
	
	@RequestMapping("peranan/{id}")
    public String showPeranan(@PathVariable Integer id, Model model) {
        model.addAttribute("peranan", perananService.getPerananById(id));
        return "perananshow";
    }
	
	@RequestMapping("peranan/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("peranan", perananService.getPerananById(id));
        return "perananform";
    }
	
	@RequestMapping("peranan/new")
    public String newProduct(Model model) {
        model.addAttribute("peranan", new Peranan());
        return "perananform";
    }
	
	
	@RequestMapping(value = "peranan", method = RequestMethod.POST)
    public String saveProduct(Peranan peranan) {
        perananService.savePeranan(peranan);
        return "redirect:/peranan/" + peranan.getId();
    }
	
	@RequestMapping("peranan/delete/{id}")
    public String delete(@PathVariable Integer id) {
        perananService.deletePeranan(id);
        return "redirect:/peranans";
    }
}
