package com.codegym.controller;

import com.codegym.model.Province;
import com.codegym.service.iml.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerProvince {
    @Autowired
    private ProvinceService provinceService;

    @GetMapping("provinces")
    public ModelAndView showProvinces() {
        Iterable<Province> provinces = provinceService.findAll();
        ModelAndView modelAndView = new ModelAndView("province/list");
        modelAndView.addObject("province", provinces);
        return modelAndView;
    }

    @GetMapping("create-province")
    ModelAndView showCreateProvince() {
        ModelAndView modelAndView = new ModelAndView("province/create");
        modelAndView.addObject("province", new Province());
        return modelAndView;
    }

    @PostMapping("create-province")
    public ModelAndView createProvince(@ModelAttribute("province") Province province) {
        provinceService.save(province);
        ModelAndView modelAndView = new ModelAndView("province/create");
        modelAndView.addObject("province", new Province());
        modelAndView.addObject("message", "New Province created successfully");
        return modelAndView;
    }
}
