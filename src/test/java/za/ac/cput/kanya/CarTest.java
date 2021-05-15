package za.ac.cput.kanya;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void test() {

        //Collection Collection

        //Declaring Collection
        Collection<String> carCollection = new HashSet<>();

        //Adding Elements To Collection
        carCollection.add("Car Year: 2021\n");
        carCollection.add("Car Year: 2020\n");
        carCollection.add("Car Year: 2019\n");
        carCollection.add("Car Year: 2018\n");
        carCollection.add("Car Year: 2017");
        carCollection.add("Car Year: 2016\n");

        //Collection Size
        assertEquals(6, carCollection.size());

        //Removing Element In Collection
        carCollection.remove("Car Year: 2017");

        //Displaying Collection Elements After Removing An Element
        System.out.println("Car Years: \n"+carCollection);

        //Finding An Element
        boolean find = carCollection.contains("Car Year: 2021\n");

        System.out.println("Is The Car Year Year 2021 Present? "+ find);

        System.out.println("============================================================================");

        //Map

        //Declaring Map Collection
        Map<Integer, String> carMap= new HashMap<Integer, String>();

        //Adding Elements To The Map Collection
        carMap.put( 1, "Passengers: 5\n");
        carMap.put(2, "Passengers: 2\n");
        carMap.put(3, "Passengers: 6\n");
        carMap.put(4,"Passengers: 9\n");
        carMap.put(5, "Passengers: 3\n");
        carMap.put(6, "Passengers: 7");

        //Removing Element From Map Collection
        String returned_value = (String) carMap.remove(4);

        //Map Collection Element Size
        assertEquals(5, carMap.size());

        //Finding An Element In Map Collection
        System.out.println("Car Passengers: \n"+carMap);
        if(carMap.containsKey(6)){

            System.out.println("Found: Passengers: 7");
        }

        System.out.println("============================================================================");

        //Set

        //Declaring Set Collection
        Set<String> carSet = new HashSet<>();

        //Adding Elements To Set Collection
        carSet.add("\n Car Registration: 16256");
        carSet.add("\n Car Registration: 49645");
        carSet.add("\n Car Registration: 78325");
        carSet.add("\n Car Registration: 20398");
        carSet.add("\n Car Registration: 68352");
        carSet.add("\n Car Registration: 93501");

        //Set Collection Size
        assertEquals(6, carSet.size());

        //Removing Element From Set Collection
        carSet.remove("\n Car Registration: 93501");

        //Displaying All Elements After Removing An Element
        System.out.println("Car Registrations: \n"+carSet);

        //Finding An Element In Set Collection
        System.out.println("Is There Car Registration '20398'? - " + carSet.contains("\n Car Registration: 20398"));

        System.out.println("============================================================================");


        //List

        //Declaring List Collection
        List<String> carList = new ArrayList<>();

        //Adding Elements To The List Collection
            carList.add(0, "\nMercedes Benz ");
            carList.add(1, "\nBMW");
            carList.add(2, "\nPorsche");
            carList.add(3, "\nBentley");
            carList.add(4, "\nAston Martin");
            carList.add(5, "\nAudi");

            //List Collection size
            assertEquals(6, carList.size());

            //Removing Element From List Collection
            carList.remove(3);

            //Displaying Elements After Removing An Element
        System.out.println("Car Model List: \n "+carList);

        //Finding An Element In List Colection
        String i = carList.get(2);

        System.out.println("The Car In Index 2 Is: "+i);

        System.out.println("============================================================================");






        }




    }

