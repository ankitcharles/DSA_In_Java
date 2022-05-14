package Java8;

import java.util.Collections;
import java.util.List;

public class PersonLambdaService {
        public static List<Person> getPersons(List<Person> persons){
            Collections.sort(persons,(p1,p2) ->p1.getName().compareTo(p2.getName()));
            return persons;
        }
}
