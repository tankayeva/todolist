package com.developer.ToDoList.controllers;

import com.developer.ToDoList.models.AppTasks;
import com.developer.ToDoList.models.AppTasksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @Autowired
    AppTasksRepo appRepo;

    @RequestMapping("/")
    public ModelAndView doHome() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("lists", appRepo.findAll());
        return mv;
    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView doSave(@RequestParam("id") String id, @RequestParam("title") String title, @RequestParam("priority") String priority, @RequestParam("status") String status) {
        ModelAndView mv = new ModelAndView("redirect:/");
        AppTasks tasks;
        if (!id.isEmpty()) {
            tasks = (AppTasks) appRepo.findOne(Integer.parseInt(id));
        } else {
            tasks = new AppTasks();
        }
        tasks.setTitle(title);

        tasks.setPriority(priority);
        tasks.setStatus(status);

        appRepo.save(tasks);
        return mv;
    }

    @RequestMapping(value = "/view/{id}", method = RequestMethod.GET)
    public ModelAndView doView(@PathVariable("id") int id) {
        ModelAndView mv = new ModelAndView("view");
        mv.addObject("lists", appRepo.findOne(id));
        return mv;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView doDelete(@PathVariable("id") int id) {
        ModelAndView mv = new ModelAndView("redirect:/");
        appRepo.delete(id);
        return mv;
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView doEdit(@PathVariable("id") int id) {
        ModelAndView mv = new ModelAndView("edit");
        mv.addObject("lists", appRepo.findOne(id));
        return mv;
    }
}