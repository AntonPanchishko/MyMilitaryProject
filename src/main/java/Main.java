import config.AppConfig;
import model.person.Person;
import model.person.Solider;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.PersonService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        PersonService personService = context.getBean(PersonService.class);
        Person petrov = new Person();
        petrov.setMilitaryRank("Solider");
        petrov.setName("Ivan");
        petrov.setSurname("Petrov");
        personService.add(petrov);

        Solider ivanov = new Solider();
        ivanov.setSoliderRole("machine gunner");
        ivanov.setMilitaryRank("sergeant");
        ivanov.setName("Aleksandr");
        ivanov.setSurname("Ivanov");
        personService.add(ivanov);

    }
}
