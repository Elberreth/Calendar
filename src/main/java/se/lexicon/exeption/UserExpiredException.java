package se.lexicon.exeption;

public class UserExpiredException extends Exception {
    public UserExpiredException(String message) {
        super(message);
    }
}
