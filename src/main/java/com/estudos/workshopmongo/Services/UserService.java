package com.estudos.workshopmongo.Services;

import com.estudos.workshopmongo.Repository.UserRepository;
import com.estudos.workshopmongo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }
}
