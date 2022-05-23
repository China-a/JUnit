package org.example;

public class Vacation {

//        public static void main(String[] args) throws Exception {
//            System.out.println("I'd like to visit");
//            System.out.println("Tokyo");
//            System.out.println("Japan");
//        }
//    }

            public static void main(String[] args)  {
          String visit = "I'd like to visit";
          String city = " Tokyo";
          String country = " Japan";
                System.out.println(vacation(visit,city,country));
        }

    public static String vacation(String visit, String city, String country) {
        return "Hi, " + visit + city + country;
    }
}
