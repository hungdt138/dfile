/**
 * 
 */
package com.acom.dfile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hungdt
 *
 */
@Controller
@RequestMapping("/danh-sach-file")
public class ListFileController {
	
	@RequestMapping(value = "/{fileId}")
	public String getListFile(@PathVariable String fileId, Model model)
	{
		model.addAttribute("fileId", fileId);
		return "listfile";
	}
}
