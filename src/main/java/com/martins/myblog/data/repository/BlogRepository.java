package com.martins.myblog.data.repository;

import com.martins.myblog.data.model.Blog;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BlogRepository extends MongoRepository<Blog, String> {
    Blog findBlogById(String blogId);
}
