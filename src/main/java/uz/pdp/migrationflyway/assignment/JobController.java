package uz.pdp.migrationflyway.assignment;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.migrationflyway.post.Task;
import uz.pdp.migrationflyway.post.TaskRepository;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/jobs")
public class JobController {

    private final JobRepository jobRepository;

    public JobController(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }


    @GetMapping("/all")
    public ResponseEntity<List<Job>> getAll() {
        log.info("Request to get all jobs");
        return ResponseEntity.ok(jobRepository.getAll());
    }

}
