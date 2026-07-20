package com.estudos.workshopmongo.Services;

import com.estudos.workshopmongo.DTO.UserDTO;
import com.estudos.workshopmongo.Repository.UserRepository;
import com.estudos.workshopmongo.Services.exception.ObjectNotFoundException;
import com.estudos.workshopmongo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }
    public User findById(String id) {
        Optional<User> user = repo.findById(id);
        if (user.isEmpty()) {
            throw new ObjectNotFoundException("Objeto não encontrado");
        }
        return user.get();
    }
    public User insert(User obj) {
        return repo.save(obj);
    }
    public User fromDTO(UserDTO objDto) {
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }
}
