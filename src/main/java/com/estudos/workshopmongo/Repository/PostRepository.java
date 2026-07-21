package com.estudos.workshopmongo.Repository;

import com.estudos.workshopmongo.domain.Post;
import com.estudos.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post,String> {

}
