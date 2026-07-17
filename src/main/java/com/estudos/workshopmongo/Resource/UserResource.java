package com.estudos.workshopmongo.Resource;

import com.estudos.workshopmongo.DTO.UserDTO;
import com.estudos.workshopmongo.Services.UserService;
import com.estudos.workshopmongo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List <UserDTO>> findAll(){
        List<User> list = service.findAll();
        List <UserDTO> listDTO = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
        return ResponseEntity .ok().body(listDTO);
    }
    @RequestMapping(value ="/{id}", method=RequestMethod.GET)
    public ResponseEntity <UserDTO> findById(@PathVariable String id){
        User obj = service.findById(id);
        return ResponseEntity .ok().body(new UserDTO(obj));
    }
}
