package org.groundlevelgeek.macaw.users.repository;

import org.groundlevelgeek.macaw.users.document.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
