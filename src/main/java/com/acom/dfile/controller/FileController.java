/**
 * 
 */
package com.acom.dfile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author hungdt
 * 
 */
@Controller
@RequestMapping("/mfile")
public class FileController {

	@RequestMapping(value = "/{partner}/{alias}/{platform}", method = RequestMethod.GET)
	public String findFile(@PathVariable String partner, @PathVariable String alias, @PathVariable String platform,
			 Model model) {
		
		model.addAttribute("partner", partner);
		model.addAttribute("alias", alias);
		model.addAttribute("platform", platform);
		return "mfile";
	}
	
	
}
