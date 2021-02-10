import config.AppConfig;
import model.person.Officer;
import model.person.Person;
import model.person.Sergeant;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.PersonService;

public class Main {
    public static void main(String[] args) {

        Person petrov = new Person();
        petrov.setName("Ivan");
        petrov.setSurname("Petrov");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        PersonService personService = context.getBean(PersonService.class);
        personService.add(petrov);

        Officer officer = new Officer();
        officer.setName("Yurii");
        officer.setSurname("Pupkin");
        officer.setSalary(25000L);
        personService.add(officer);

        Sergeant sydorov = new Sergeant();
        sydorov.setName("Vova");
        sydorov.setSurname("Sydorov");
        sydorov.setExperience(3L);
        personService.add(sydorov);
    }
}
