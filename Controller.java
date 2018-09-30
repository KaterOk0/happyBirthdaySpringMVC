package com.company.controller;

import com.company.DateOperations;
import com.company.User;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping(value = "/result", method = RequestMethod.POST)
    public String result(User user, ModelMap model) {
        if (DateOperations.checkDate(user.getDate()) == true) {
            model.addAttribute("date", user.getDate());
            ArrayList<Integer> date = DateOperations.splittingDate(user.getDate());
            model.addAttribute("age", DateOperations.calculateAge(date));
            model.addAttribute("days", DateOperations.daysPriorToBirthday(date));
        } else {
            return "error";
        }
        return "result";
    }
}
