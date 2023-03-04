package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {

       String name ="James King",
                buildingName = "12335",
                streetName = "Jones Branch Dr",
                city = "Mclean",
                state = "VA",
                zipCode = "14566";

       // System.out.println(name + "\n" + buildingName + " " + streetName + "\n" + city + ", " + state + " "+ zipCode);

        String address = name + "\n" + buildingName + " " + streetName + "\n" + city + ", " + state + " "+ zipCode;
        System.out.println(address);

    }


}
     /*
        String name = "James King",
        String buildingName = "12335";
        String streetName = "Jones Branch Dr";
        String city = "Mclean";
        String state = "VA";
        String zipCode = "14566A";
*/
