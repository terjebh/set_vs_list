import java.util.*;

public class Main {
    public static void main(String[] args) {
    int N = 50000;
    List<Integer> tallListe = new LinkedList<>();
    for(int i=0;i<N; i++) tallListe.add(i);
    //Collections.shuffle(tallListe);
    Collections.sort(tallListe);
    Set<Integer> tallSett = new HashSet<>(tallListe);

        System.out.println(STR."Fjerne \{N} tall i Arraylist: \{fjern(tallListe)} millisekunder");
        System.out.println(STR."Fjerne \{N} tall i HashSet: \{fjern(tallSett)} millisekunder");

    }

    private static long fjern(Collection<Integer> coll) {
        long start = System.currentTimeMillis();
        for(int i=0;i<coll.size(); i++) coll.remove(i);
        return (System.currentTimeMillis()-start);


    }
}