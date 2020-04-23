import com.demo.repository.HibernateSpeakerRepositoryImpl;
import com.demo.repository.SpeakerRepository;
import com.demo.service.SpeakerService;
import com.demo.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
//      usage of constructor injection
        SpeakerServiceImpl speakerService = new SpeakerServiceImpl(getSpeakerRepository());

//        usage of setter injection
//        SpeakerServiceImpl speakerService = new SpeakerServiceImpl();
//        speakerService.setSpeakerRepository(getSpeakerRepository());
        return speakerService;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }
}