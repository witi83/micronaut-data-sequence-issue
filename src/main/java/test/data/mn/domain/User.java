package test.data.mn.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.micronaut.core.annotation.Creator;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public final class User {
    @Id
    private long id;
    private String name;

    @Creator
    public User(String name) {
        this.name = name;
    }
}
