import java.util.Arrays;
import java.util.List;

public class Citites {

    private static Boolean findCity(List<String> cities, String city) {
     Boolean flag = false;
     for(String c : cities){
         if(c.equals(city)){
             flag = true;
             break;
         }
     }
     return flag;
    }

    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Delhi", "Haryana", "Mumbai", "Bangalore", "Hyderabad", "Pune");
        System.out.println("is City found ?" + findCity(cities, "Delhi"));
    }
}
