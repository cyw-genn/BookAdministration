package com.example.controller;

import com.example.entity.Authority;
import com.example.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Controller
public class AuthorityController {
    @Autowired
    private AuthorityService authorityService;

    @GetMapping("/index.html")
    public String userList(Map<String, List> result){
        List<Authority> Authorities=authorityService.findAll();
        result.put("authorities",Authorities);
        return "index";
    }

    @PostMapping("/add")
    public String save(Authority authority){
        authorityService.save(authority);
        return "redirect:/index.html";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable Integer id, HttpServletResponse servletResponse) throws IOException {
        authorityService.delete(id);
        System.out.println("delete successful");
        return "redirect:/index.html";
    }

    @GetMapping("/updatePage/{id}")
    public String updatePage(Model model, @PathVariable int id){
        Authority authorities=authorityService.get(id);
        model.addAttribute("authorities",authorities);
        return "modifie";
    }

    @PutMapping("/update")
    public String updateUser(Model model, Authority authority, HttpServletRequest request){
        String id=request.getParameter("id");
        Authority authorityById=authorityService.get(Integer.parseInt(id));
        authorityService.update(authority);
        System.out.println(authority);
        return "redirect:/index.html";
    }
}
