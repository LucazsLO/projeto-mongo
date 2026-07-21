package com.estudos.workshopmongo.Services;

import com.estudos.workshopmongo.Repository.PostRepository;
import com.estudos.workshopmongo.Services.exception.ObjectNotFoundException;
import com.estudos.workshopmongo.domain.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> post = repo.findById(id);
        if (post.isEmpty()) {
            throw new ObjectNotFoundException("Objeto não encontrado");
        }
        return post.get();
    }

    public List<Post> findByTitle(String text) {
        return repo.searchTitle(text);
    }

}
