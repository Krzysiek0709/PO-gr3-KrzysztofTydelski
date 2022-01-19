import java.util.ArrayList;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Kandydet Kandydet = new Kandydet("Jacek", 23, "licencjant", 3);
        ArrayList<Kandydet> grupa = new ArrayList<Kandydet>(Arrays.asList(
                Kandydet,
                new Kandydet("Krzysiek",
                        18,
                        "licencjant",
                        1),
                new Kandydet("Arek",
                        34,
                        "licencjant",
                        12),
                new Kandydet("Adrian",
                        21,
                        "magister",
                        4),
                new Kandydet("Bartek",
                        28,
                        "licencjant",
                        1),
                new Kandydet("Mariusz",
                        41,
                        "magister",
                        2)
        ));
        System.out.println(grupa);
        Collections.sort(grupa);
        System.out.println(grupa);
        Rekrutacja.setDoswiadczenie(2);
        System.out.println(Qualified(Kandydet));
        System.out.println(RecruitmentMap(grupa));
    }
    public static boolean Qualified(Kandydet k)
    {
        return k.getLatadoswiadczenia() >= Rekrutacja.doswiadczenie;
    }
    public static HashMap<Integer, String> RecruitmentMap(ArrayList<Kandydet> klist)
    {
        HashMap<Integer, String> result = new HashMap<Integer, String>();
        for(Kandydet osoba : klist)
        {
            if(Qualified(osoba))
            {
                result.put(osoba.getLatadoswiadczenia(), osoba.getNazwa());
            }
        }
        return result;
    }
}
