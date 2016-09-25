package br.com.felippepuhle.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminIndexController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String index() {
    	return "{'status': true, 'id': 'admin'}";
    }

}
