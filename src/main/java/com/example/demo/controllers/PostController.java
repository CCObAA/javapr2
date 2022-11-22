package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repo.PostRepository;
import com.example.demo.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PostController {
    @Autowired
    private PostRepository postRepository;

    @GetMapping("/")
    public String blogMain(Model model)
    {
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "post-main";
    }

   @GetMapping("/post/add")
    public String blogAdd(Model model)
    {
        return "post-add";
    }

    @PostMapping("/post/add")
    public String PostAdd(@RequestParam(defaultValue = "0")  double maxsalary,
                              @RequestParam(defaultValue = "false") boolean paid,
                              @RequestParam(defaultValue = "non")  String namepost,
                              @RequestParam(defaultValue = "0")  float salary,
                              @RequestParam(defaultValue = "0")  int countemploey,
                              Model model)
    {
        Post post = new Post(maxsalary, salary, paid,namepost,countemploey);
        postRepository.save(post);
        return "redirect:/";
    }

    @GetMapping("/post/filter")
    public String postFilter(Model model)
    {
        return "post-filter";
    }

    @PostMapping("/post/filter/result")
    public String postResult(@RequestParam String namepost, Model model)
    {
        List<Post> result = postRepository.searchByRatingStartsWith(namepost);
        model.addAttribute("result", result);
        return "post-filter";
    }


}
