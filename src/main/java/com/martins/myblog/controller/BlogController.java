package com.martins.myblog.controller;

import com.martins.myblog.data.dto.request.CreateBlogRequest;
import com.martins.myblog.data.dto.response.Response;
import com.martins.myblog.data.model.Blog;
import com.martins.myblog.service.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/blogs")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class BlogController {

    private final BlogService service;

    @PostMapping()
    public ResponseEntity<Response> create(@RequestBody CreateBlogRequest request){
        return ResponseEntity.ok(service.createBlog(request));
    }

    @DeleteMapping("/delete/{blogId}")
    public void deleteById(@PathVariable Long blogId){
        service.deleteBlog(blogId);
    }

    @GetMapping("/allBlog")
    public List<Blog> getAll(){
        return service.getAllBlog();
    }

    @GetMapping(value = "/blog/{blogId}")
    public Blog getById(@PathVariable("blogId") Long blogId){
        return service.getBlog(blogId);
    }
}
