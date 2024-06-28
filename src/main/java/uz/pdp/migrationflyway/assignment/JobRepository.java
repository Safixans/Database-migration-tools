package uz.pdp.migrationflyway.assignment;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import uz.pdp.migrationflyway.post.Task;

import java.util.List;

@Repository
public class JobRepository {

    private final JdbcTemplate jdbcTemplate;
    private static final String TASKS_SELECT_QUERY = "select * from tasks";

    public JobRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<Job> getAll() {
        return jdbcTemplate.query(TASKS_SELECT_QUERY, BeanPropertyRowMapper.newInstance(Job.class));

    }
}
