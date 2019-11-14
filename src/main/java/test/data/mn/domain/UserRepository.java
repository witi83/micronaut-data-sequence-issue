package test.data.mn.domain;

import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;
import io.micronaut.data.repository.async.AsyncCrudRepository;

@JdbcRepository(dialect = Dialect.H2)
public interface UserRepository extends AsyncCrudRepository<User, Long> {
}
