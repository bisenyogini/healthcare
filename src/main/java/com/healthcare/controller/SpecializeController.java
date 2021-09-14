package com.healthcare.controller;

import com.healthcare.entity.Specialize;
import com.healthcare.service.SpecializeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// localhost:9698/special/create
@Controller
@RequestMapping("/special")
public class SpecializeController {
    @Autowired
    private SpecializeService specializeService;
    @GetMapping("/showPage")
    public String displaySpecialize(){
        return "Specialize";
    }

   /* @PostMapping("/create")
    public String createUser(@ModelAttribute Specialize specialize, Model model)
    {
      specializeService.createUser(specialize);
      String show="User Created Successfully";
      model.addAttribute("show",show);
      return "Specialize";

    }*/
    @PostMapping("/create")
    public String createUser(@ModelAttribute Specialize specialize, Model model)
    {
        specializeService.createUser(specialize);
        String show="User Created Successfully";
        List<Specialize>list=specializeService.getAllSpecialize();
        model.addAttribute("show",show);
        model.addAttribute("list",list);
        return "InsertData";

    }
    /*@PostMapping("/update")
    public String updateUser(@RequestParam Integer id, @ModelAttribute Specialize specialize, Model model)
    {
        specializeService.updateUser(specialize,id);
        String reply="User updated Successfully";
        model.addAttribute("reply",reply);
        return "Specialize";

    }*/
    @GetMapping("/removeById")
    public String removeById(@RequestParam Integer id,Model model){
        specializeService.removeById(id);
        String sms="user "+id+" deleted successfully";
      model.addAttribute("sms",sms);
        List<Specialize>list1=specializeService.getAllSpecialize();
        model.addAttribute("list1",list1);
        return "InsertData";
    }

}
