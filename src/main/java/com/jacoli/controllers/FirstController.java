package com.jacoli.controllers;

import com.jacoli.DO.User;
import com.jacoli.mappers.FirstMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

/**
 * Created by lichuange on 2017/7/21.
 */
@Controller
@RequestMapping("/first")
public class FirstController {
    private final Logger logger = Logger.getLogger(FirstController.class);

    @Autowired
    private FirstMapper firstMapper;



    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String test(){
        User user = firstMapper.findByUserName("name1");
        Gson gson = new GsonBuilder().create();
        return gson.toJson(user);
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    public String users(){
        List<User> users = firstMapper.findUsers();
        Gson gson = new GsonBuilder().create();
        return gson.toJson(users);
    }

    @RequestMapping("/index")
    public ModelAndView getCityListView() {
        ModelAndView modelAndView = new ModelAndView("first/index");
        User user = firstMapper.findByUserName("name1");
        modelAndView.addObject("prompt", user.getPassword());
        return modelAndView;
    }

    @RequestMapping(value = "/form_test", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView getCityListView2(String user) {
        ModelAndView modelAndView = new ModelAndView("first/index");
        modelAndView.addObject("prompt", "user = " + user);
        logger.info("/form_test" + user);
        return modelAndView;
    }
}
