package pagescontroller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import DBT1.Account;

@Controller
@RequestMapping("account")
public class AccountController {
@InitBinder
	public void initBinder(WebDataBinder databinder) {
		StringTrimmerEditor ste=new StringTrimmerEditor(true);
		databinder.registerCustomEditor(String.class, ste);
	}
	
@RequestMapping("/home")
	public String home()
	{
		return"home";
	}
@RequestMapping("/new")
public String NewAccount(@Valid @ModelAttribute("account") Account account,BindingResult result) {
	if(result.hasErrors())
	{
	return"account-form";
	}
	else 
	{
	return"account-details";
	}
		
}
@RequestMapping("Show")
public String AccountDetails(Model model)
{
     Account account=new Account();
     model.addAttribute("account", account);
     return"account-details";
}



}