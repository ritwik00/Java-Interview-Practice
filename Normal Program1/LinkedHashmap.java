import java.io.*;
import java.util.LinkedHashMap;
class LinkedHashmap{
    public static void main(String[] args) {
        //Create a new empty map in memry
    LinkedHashMap<Integer, String> emp = new LinkedHashMap<>();  
    //adding data into the has map
        emp.put(101,"Ritwik");
        emp.put(102,"Ritam");
        emp.put(103, "Gargi");
        //showing size
        System.out.println("The size of emp map is:"+emp.size());
        System.out.println(emp);
        //checkng the key avaliable or not 
        if(emp.containsKey(103)){
            String name = emp.get(103);
            System.out.println("The name of emp with id:103 is"+"  "+name);
        }

    }
    



}