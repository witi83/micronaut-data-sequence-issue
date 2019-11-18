package test.data.mn.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import io.micronaut.core.annotation.Creator;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public final class User {
    @Id
    @SequenceGenerator(name = "mySeq", sequenceName = "MY_SEQ", initialValue = 3)
    @GeneratedValue(generator = "mySeq", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;

    @Creator
    public User(String name) {
        this.name = name;
    }
}
