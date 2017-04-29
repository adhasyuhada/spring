package demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import demo.entities.Peranan;
import demo.entities.UserPeranan;
import demo.services.UserPerananService;

@Controller
public class UserPerananController {
	
	private UserPerananService userPerananService;
	
	@Autowired
	public void setUserPerananService(UserPerananService userPerananService){
		this.userPerananService = userPerananService;
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("user", userPerananService.listAllUserPeranan());
        return "user";
    }
	
	
	@RequestMapping("user/{id}")
    public String showPeranan(@PathVariable Integer id, Model model) {
        model.addAttribute("user", userPerananService.getUserPerananById(id));
        return "usershow";
    }
	
	@RequestMapping("user/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("user", userPerananService.getUserPerananById(id));
        return "userform";
    }
	
	@RequestMapping("user/new")
    public String newProduct(Model model) {
        model.addAttribute("user", new Peranan());
        return "userform";
    }
	
	
	@RequestMapping(value = "user", method = RequestMethod.POST)
    public String saveUser(UserPeranan user) {
        userPerananService.saveUserPeranan(user);
        return "redirect:/user/" + user.getId();
    }
	
	@RequestMapping("peranan/delete/{id}")
    public String delete(@PathVariable Integer id) {
        userPerananService.deleteUserPeranan(id);
        return "redirect:/peranans";
    }
}
