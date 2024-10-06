package com.akhil.blogserver.service;

import com.akhil.blogserver.entity.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {
    Post savePost(Post post);
    List<Post> getPosts();

    Post getPost(Long id);
}
