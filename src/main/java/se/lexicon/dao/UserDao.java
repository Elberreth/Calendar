package se.lexicon.dao;

import se.lexicon.exeption.UserExpiredException;

import se.lexicon.exeption.AuthorizationFailedException;
import se.lexicon.model.User;

import java.util.Optional;

public interface UserDao {

    User createUser(String username);

    Optional<User> findByUsername(String username);

    boolean authenticate(User user) throws AuthorizationFailedException, UserExpiredException;

    // Add methods for updating password as needed...


}
