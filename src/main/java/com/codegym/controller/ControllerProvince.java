package com.codegym.controller;

import com.codegym.model.Province;
import com.codegym.service.iml.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
}
