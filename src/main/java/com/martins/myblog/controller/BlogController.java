package com.martins.myblog.controller;

import com.martins.myblog.data.dto.request.CreateBlogRequest;
import com.martins.myblog.data.dto.response.Response;
import com.martins.myblog.data.model.Blog;
import com.martins.myblog.service.BlogService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/blogs")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class BlogController {

    private final BlogService service;

    @PostMapping("/")
    public Response create(@RequestBody CreateBlogRequest request){
        return service.createBlog(request);
    }

    @DeleteMapping("/delete/{blogId}")
    public void deleteById(@PathVariable String blogId){
        service.deleteBlog(blogId);
    }

    @GetMapping("/allBlog")
    public List<Blog> getAll(){
        return service.getAllBlog();
    }

    @GetMapping(value = "/{blogId}")
    public Blog getById(@PathVariable String blogId){
        return service.getBlog(blogId);
    }
}
