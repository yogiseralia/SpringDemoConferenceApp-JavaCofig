import com.demo.repository.HibernateSpeakerRepositoryImpl;
import com.demo.repository.SpeakerRepository;
import com.demo.service.SpeakerService;
import com.demo.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    @Scope(scopeName = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService() {
        SpeakerServiceImpl speakerService = new SpeakerServiceImpl();
        return speakerService;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }
}