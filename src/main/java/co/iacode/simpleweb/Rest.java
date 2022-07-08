package co.iacode.simpleweb;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class Rest{
    @Scheduled(fixedRate = 5000000)
    public void cron(){
        System.out.println("daniel molina");
        
        log.debug("Hello from Logback {}", "mis niños");
	    log.error("Error message");
        log.warn("Warning message");
        log.info("Info message");
        log.debug("Debug message");
        log.trace("Trace message");
    }
}