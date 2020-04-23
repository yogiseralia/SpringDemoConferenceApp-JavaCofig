import com.demo.service.SpeakerService;
import com.demo.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
//        Enabled Spring
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

//        without spring, satisfying dependencies
//        SpeakerService speakerService = new SpeakerServiceImpl();

//        with spring, simply pull out dependencies
        SpeakerService speakerService = applicationContext.getBean("speakerService",SpeakerService.class);
        System.out.println(speakerService.findAll());
    }
}
