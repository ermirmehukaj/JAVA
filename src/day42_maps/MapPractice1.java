package day42_maps;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        System.out.println("-----------------------------------------------------");
        int countMaleEmployee = 0;
        int countFemaleEmploye=0;

       /* for (String eachKey : employeeMap.keySet()) {
            String gender = employeeMap.get(eachKey);
            if(gender.equals("M")){
                countMaleEmployee++;
            }else {
                countFemaleEmploye++;
            }
        }*/

        for (String eachValue : employeeMap.values()) {
            if(eachValue.equals("F")){
                countFemaleEmploye++;
            }else {
                countMaleEmployee++;
            }
        }


        System.out.println(countFemaleEmploye);
        System.out.println(countMaleEmployee);

        System.out.println("----------------------------------------------------");

        for (String eachKey : employeeMap.keySet()) {
            String gender = employeeMap.get(eachKey);
            if(gender.equals("F")){
            System.out.println(eachKey);
        }
        }

        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if(eachEntry.getValue().equals("F")){
                System.out.println(eachEntry.getKey());
            }
        }

        System.out.println("--------------------------------------------------------------------");

        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if(eachEntry.getValue().equals("M")){
                eachEntry.setValue("Male");
            }else{
                eachEntry.setValue("Female");
            }
        }

        System.out.println(employeeMap);








    }
}
