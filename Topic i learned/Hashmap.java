import java.util.HashMap;

import javax.xml.transform.Source;


class Hashmap{
    public static void main(String[] args) {
        //country (key), population(value)
        HashMap<String , Integer> map/*name we can give (map) */ =new HashMap<>();

     

        //insertion 
        map.put("ind ",120);
        map.put("usa ",30);
        map.put("uae ",50);
        map.put("china ",150);
    System.out.println(map);
         map.put("japan", 120);
         System.out.println(map);
        //search
        if(map.containsKey("japan")){
            System.out.println("it is present");
        }else {
            System.out.println("it is not present");
        }

        System.out.println(map.get("japan"));


    }
}