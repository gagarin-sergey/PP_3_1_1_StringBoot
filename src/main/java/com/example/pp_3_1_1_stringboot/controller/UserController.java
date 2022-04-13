package com.example.pp_3_1_1_stringboot.controller;

import com.example.pp_3_1_1_stringboot.model.User;
import com.example.pp_3_1_1_stringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getUsers(Model model) {
        model.addAttribute("userList", userService.getList());
        return "users";
    }

    @GetMapping("/new")
    public String addUser(Model model) {
        model.addAttribute("user", new User());
        return "new_user";
    }

    @PostMapping
    public String newPerson(@ModelAttribute("user") User user) {
        userService.add(user);
        return "redirect:/";
    }

    @GetMapping("{id}")
    public String updateUser(Model model, @PathVariable("id") Long id) {

        model.addAttribute("user", userService.getUser(id));
        return "update_user";
    }

    @PatchMapping("{id}")
    public String userUpdate(@PathVariable("id") Long id,@ModelAttribute("user") User user) {
        userService.update(user);
        return "redirect:/";
    }
    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        userService.delete(id);
        return "redirect:/";
    }
}
