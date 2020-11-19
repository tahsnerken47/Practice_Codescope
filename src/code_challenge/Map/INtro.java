package code_challenge.Map;

import java.time.LocalDate;
import java.util.*;

public class INtro {
    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();//random

        Map<String, Integer> map2 = new LinkedHashMap<>(); // insertion order

        Map<String, Integer> map3 = new Hashtable<>(); // synchronized thread safe

        Map<String, Integer> map4 = new TreeMap<>();// sorted in ascending


        Map<String, LocalDate> SDETS = new LinkedHashMap<>();
        SDETS.put("Alex", LocalDate.of(1991, 02, 22));
        SDETS.put("Mike", LocalDate.of(1985, 10, 04));
        SDETS.put("Emmy", LocalDate.of(1977, 05, 30));
        SDETS.put("Jordan", LocalDate.of(1999, 12, 02));
        SDETS.put("Tyjee", LocalDate.of(1994, 04, 14));

        //     System.out.println(SDETS);

/*
        for(String eachKey1 : SDETS.keySet()){
            LocalDate eachValue1 = SDETS.get(eachKey1);
            System.out.println(eachKey1+" "+eachValue1);
        }

        for(LocalDate ld : SDETS.values()){
            System.out.println(ld);
        }


*/

        Map<String, Double> employees = new LinkedHashMap<>();
        employees.put("Benjamin", 100_000.0);
        employees.put("Marlyn", 145_000.0);
        employees.put("Jack", 175_0000.0);
        employees.put("Jimena", 80_0000.0);

     /*   System.out.println(employees);

        for (String each : employees.keySet()){
          //  System.out.println(each+" "+each.values());
        }

        for (Double salaryOfEach : employees.values() ){
   //         System.out.println();
        }

*/
       /* System.out.println(employees.size()+" size of map");
        System.out.println("salaary of Benjamin "+employees.get("Benjamin"));

employees.remove("Benjamin");
        System.out.println(employees);
        System.out.println(employees.containsKey("Jack"));
        System.out.println(employees.containsValue(1750000.0));
        System.out.println(employees.isEmpty());


*/

        LinkedHashMap<String, Integer> clients = new LinkedHashMap<>();
        clients.put("Selin", 125_000);
        clients.put("Sevgi", 145_000);
        clients.put("Sinan", 100_000);
        clients.put("Selma", 185_000);
        clients.put("Selim", 175_000);
        clients.put("Pelin", 105_000);

      /*  System.out.println(clients);
        for(String eachKey : clients.keySet()){
            int eachValue = clients.get(eachKey);
         //   System.out.println(eachKey+ " "+eachValue);
            if(eachValue>=130000){
                System.out.println(eachKey);
            }
        }

*/

        Map<String, String> countries = new LinkedHashMap<>();
        countries.put("Colombia", "Bogota");
        countries.put("Venezuela", "Caracas");
        countries.put("Thailand", "Bangkok");
        countries.put("Philliipines", "Manila");
        countries.put("Japan", "Tokyo");

     /*   System.out.println(countries);

        for (String eachKey : countries.keySet()){
            String eachalue = countries.get(eachKey);
            System.out.println(eachKey+" " +eachalue);

            }
        }
*/

        Map<String, LocalDate> map = new LinkedHashMap<>();
        map.put("John", LocalDate.of(1999, 8, 9));
        map.put("Aaron", LocalDate.of(1998, 5, 9));
        map.put("Daniel", LocalDate.of(1997, 4, 9));
        map.put("James", LocalDate.of(1996, 2, 9));
        map.put("Caleb", LocalDate.of(1995, 3, 9));
        map.put("Erik", LocalDate.of(1989, 1, 9));


//        System.out.println(map.keySet());
//        System.out.println(map.values());

     /*   List<String> names =new ArrayList<>(map.keySet());
        System.out.println(names.get(1));


        List<LocalDate> DOB = new ArrayList<>(map.values());
        System.out.println(DOB.get(1));


        for (Map.Entry<String,LocalDate> each : map.entrySet()){
            System.out.println(each.getKey()+" "+ each.getValue());
        }

*/
        Map<String, String> scrum1 = new LinkedHashMap<>();
        scrum1.put("Azat", "Senior SoftwareDeveloper");
        scrum1.put("Nurahmet", "SDET");
        scrum1.put("Arman", "QA");
        scrum1.put("Abide", "SDET");
        scrum1.put("Jeniffer", "BA");

        Map<String, String> scrum2 = new LinkedHashMap<>();
        scrum2.put("Hajar", "Developer");
        scrum2.put("Dania", "SDET");
        scrum2.put("Rani", "PO");
        scrum2.put("Jak", "SM");
        scrum2.put("Michel", "SDET");

        Map<String, String> scrum3 = new LinkedHashMap<>();
        scrum3.put("Imran", "Senior SoftwareDeveloper");
        scrum3.put("Dilfinar", "SDET");
        scrum3.put("Atilla", "QA");
        scrum3.put("Aidana", "SDET");
        scrum3.put("Kamran", "BA");

        List<Map<String, String>> teams = new ArrayList<>();
        teams.addAll(Arrays.asList(scrum1, scrum2, scrum3));

        //     System.out.println(teams);


     /*   for (Map<String,String> eachMap : teams){ //each map
            System.out.println(teams);
            for (Map.Entry<String,String> each : eachMap.entrySet()){
                String name = each.getKey();
                String jobTitle = each.getValue();
                if(name.equals("safsa")){
                    System.out.println(name);
                }
            }
        }
*/


        String[] friends = {"Merhaba", "Rena", "Gulyar", "Arzugul", "Rukiye"};
        LocalDate[] DOBfriends = {LocalDate.of(1992, 1, 2),
                LocalDate.of(1993, 3, 2),
                LocalDate.of(1994, 2, 3),
                LocalDate.of(1992, 4, 5),
                LocalDate.of(1998, 3, 4)};

        String[] classMates = {"Kalbinur","Ceren","Liza","Shakzod","Heydar"};
        LocalDate[] DOBClassMates = {LocalDate.of(1992,1,2),
                LocalDate.of(1993,3,2),
                LocalDate.of(1994,2,3),
                LocalDate.of(1992,4,5),
                LocalDate.of(1998,3,4)};

        String[] family = {"Marianna","Juan Carlos","Marissa","Javier","Cristina"};
        LocalDate[] DOBFamily = {LocalDate.of(1980,6,21),
                LocalDate.of(1977,12,8),
                LocalDate.of(1980,6,21),
                LocalDate.of(1981,2,8),
                LocalDate.of(1995,6,7)};

        List<Map<String,LocalDate>>  list = new ArrayList<>();
        list.addAll(Arrays.asList(
           new LinkedHashMap<>(),new LinkedHashMap<>(),new LinkedHashMap<>()
        ));

        for (int i = 0; i <DOBfriends.length ; i++) {
            list.get(0).put(friends[i],DOBfriends[i]);
        }
  for (int i = 0; i <DOBClassMates.length ; i++) {
            list.get(1).put(classMates[i],DOBClassMates[i]);
        }
  for (int i = 0; i <DOBFamily.length ; i++) {
            list.get(2).put(family[i],DOBFamily[i]);
        }
  //      System.out.println(list);

        Map<String , String> vyTrackCredentials = new LinkedHashMap<>();
        vyTrackCredentials.put("username1", "password1");
        vyTrackCredentials.put("username2", "password2");
        vyTrackCredentials.put("username3", "password3");
        vyTrackCredentials.put("username4", "password4");

    //    System.out.println(vyTrackCredentials);

       /* for (String eachKey : vyTrackCredentials.keySet()){
            System.out.println(eachKey+" "+vyTrackCredentials.get(eachKey));
        }
*/
    /*    for( Map.Entry<String, String>   each : vyTrackCredentials.entrySet() ){
            String userName = each.getKey();
            String passWord = each.getValue();
            System.out.println("Credentials Entered: "+ userName+" - "+passWord);

        }

*/
String str1 = "hellohellohello";
String[] arr = str1.split("");

Map<String ,Integer> map5 = new LinkedHashMap<>();

List<String> list4 = new ArrayList<>(Arrays.asList(arr));

for (String each : list4){
    map5.put(each,Collections.frequency(list4,each));
    {

    }
}
        System.out.println(map5);
























    }
}