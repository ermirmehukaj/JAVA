package day41_maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class MapPractice {

    public static void main(String[] args) {


        Map<String, Object> person = new LinkedHashMap<>();

        person.put("name","Arthur");
        person.put("gender",'M');
        person.put("age",31);
        person.put("job_title","Developer");
        person.put("salary",90000);


        System.out.println("person = " + person);

        System.out.println(person.get("name"));


    }
}
