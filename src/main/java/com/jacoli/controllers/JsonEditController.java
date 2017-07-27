package com.jacoli.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by lichuange on 2017/7/27.
 */
@Controller
@RequestMapping("json_edit")
public class JsonEditController {

    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public ModelAndView demo() {
        ModelAndView mv = new ModelAndView("/json_edit/demo");
        mv.addObject("title", "Json Edit Demo");
        return mv;
    }

    @RequestMapping(value = "submit", method = RequestMethod.POST)
    @ResponseBody
    public String submit() {
        return "submit success";
    }
}
