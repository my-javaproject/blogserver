package com.akhil.blogserver.service;

import com.akhil.blogserver.entity.Post;
import com.akhil.blogserver.repository.PostRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    public Post savePost(Post post) {
        post.setLikes(0);
        post.setViewCount(0);
        post.setDate(new Date());
        return postRepository.save(post);

    }
    public List<Post> getPosts() {
        return postRepository.findAll();
    }



    public Post getPost(Long id) {
        Optional<Post> optionalPost= postRepository.findById(id);
        if (optionalPost.isPresent()) {
            Post post = optionalPost.get();
            return postRepository.save(post);

        }else{
            throw new EntityNotFoundException("Post Not Found");
        }
    }




}
