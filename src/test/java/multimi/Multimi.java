package multimi;

import org.testng.annotations.Test;

import java.util.*;

public class Multimi {

    //multimi = array, list, set, map

    @Test
    public void metodaTest () {

        //numeCursantiArray();
        //numeCursantiLista();
        //exemplu1Map();
        //exemplu2Map();
        //listaBucate();
        idAngajati();
    }

    //Afisam numele cursantilor

    public void numeCursantiArray () {

        String[] cursanti = new String[10];
        cursanti[0] = "Carmen";
        cursanti[1] = "Andrei";
        cursanti[2] = "Adriana";
        cursanti[3] = "Alex";

        int index = 0;
        while (index<cursanti.length) {
            System.out.println("Numele cursantului este: " + cursanti[index]);
            index++;
        }
    }


    public void numeCursantiLista () {

        List<String> cursanti = new ArrayList<>();
        cursanti.add("Carmen");
        cursanti.add("Andrei");
        cursanti.add("Adriana");
        cursanti.add("Alex");
        cursanti.add("Cristi");

        int index= 0;
        while (index<cursanti.size()) {
            System.out.println("Numele cursantului este: " + cursanti.get(index));
            index++;
        }
    }


    //Definim niste categorii de valori
    public void exemplu1Map () {

        Map<String, String> obiecte = new HashMap<>();
        obiecte.put("Telefon", "iPhone");
        obiecte.put("Masina", "Audi");
        obiecte.put("Fruct", "Mar");

        for (String key : obiecte.keySet()) {

            System.out.println("Cheia este: " + key);
            System.out.println("Valoarea pe baza cheii este: " + obiecte.get(key));
        }
    }

 // Afisam orasele cu tara din care provin

    public void exemplu2Map () {
        Map<String,List<String>> tariOrase = new HashMap<>();

        List<String> oraseRomania = Arrays.asList("Cluj", "Bistrita", "Oradea");
        List<String> oraseItalia = Arrays.asList("Roma", "Verona", "Parma", "Genova");
        List<String> oraseSpania = Arrays.asList("Madrid", "Barcelona", "Valencia", "Bilbao");

        tariOrase.put("Romania", oraseRomania);
        tariOrase.put("Italia", oraseItalia);
        tariOrase.put("Spania", oraseSpania);

        for (String key : tariOrase.keySet()) {

            System.out.println("Tara este " + key);
            System.out.println("Orasele sunt: " + tariOrase.get(key));
        }
    }

    //Tema: carte de retete pt gatit --> supa de pui= key   ingredianete = list

    public void listaBucate () {

        Map<String,List<String>> tipuriMancare = new HashMap<>();

        List<String> ingredienteSupaPui = Arrays.asList("4 pule pui", "3l apa", "legume", "condimente");
        List<String> ingredienteTacos = Arrays.asList("chilli con carne", "lipie", "guacamole", "condimente");
        List<String> ingredientelasagna = Arrays.asList("foi lasagna", "sos ragu", "mozzarella", "sos rosii");

        tipuriMancare.put("Supa Pui",ingredienteSupaPui);
        tipuriMancare.put("Tacos",ingredienteTacos);
        tipuriMancare.put("Lasagna",ingredientelasagna);

        for (String key : tipuriMancare.keySet()) {

            System.out.println("Tipul de mancare este: " + key);
            System.out.println("Ingredientele sunt: " + tipuriMancare.get(key));
        }
    }


    public static void idAngajati () {

        Map <String, Integer> empID = new HashMap<>();
        empID.put("Ion", 123);
        empID.put("Vasile", 321);
        empID.put("Grigore", 999);

        for (String key : empID.keySet()) {
            System.out.println(key);
        }
    }

}
