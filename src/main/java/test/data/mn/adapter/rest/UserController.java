package test.data.mn.adapter.rest;

import java.util.concurrent.CompletableFuture;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import test.data.mn.domain.User;
import test.data.mn.domain.UserRepository;

@Controller("/users")
final class UserController {
    private final UserRepository repo;

    UserController(UserRepository repo) {
        System.out.println(repo.save(new User("first")));
        this.repo = repo;
    }

    @Get(value = "/{id}")
    CompletableFuture<User> get(long id) {
        return repo.findById(id);
    }
}
