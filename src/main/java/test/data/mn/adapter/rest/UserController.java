package test.data.mn.adapter.rest;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import test.data.mn.domain.User;
import test.data.mn.domain.UserRepository;

@Controller("/users")
final class UserController {
    private final UserRepository repo;

    UserController(UserRepository repo) {
        System.out.println(repo.save(new User("first")));
        this.repo = repo;
    }

    @Post
    User create(String name) {
        return repo.save(new User(name));
    }
}
