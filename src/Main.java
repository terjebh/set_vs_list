import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int N = 80000;
        Set<Integer> hashSett = new HashSet<>();
        Set<Integer> treeSett = new TreeSet<>();
        List<Integer> arrayListe = new ArrayList<>();
        List<Integer> linkedListe = new LinkedList<>();

        System.out.print(STR."Legge til \{N} tall i Arraylist: \t \{leggTil(arrayListe, N)}  "); print(arrayListe);
        System.out.println(STR."Fjerne \{N} tall i Arraylist: \t\t \{fjern(arrayListe)} ");
        System.out.print(STR."Legge til \{N} tall i Linkedlist: \t \{leggTil(linkedListe, N)}  "); print(linkedListe);
        System.out.println(STR."Fjerne \{N} tall i Linkedlist: \t \{fjern(linkedListe)} ");

        System.out.println("-".repeat(120));
        System.out.print(STR."Legge til \{N} tall i HashSet: \t \{leggTil(hashSett, N)}  ");  print(hashSett);
        System.out.println(STR."Fjerne \{N} tall i HashSet: \t\t \{fjern(hashSett)} ");
        System.out.print(STR."Legge til \{N} tall i TreeSet: \t \{leggTil(treeSett, N)}  "); print(treeSett);
        System.out.println(STR."Fjerne \{N} tall i TreeSet: \t\t \{fjern(treeSett)} ");

    }

    private static String leggTil(Collection<Integer> coll, int N) {
        List<Integer> tall = new ArrayList<>();
        for (int i = 0; i < N; i++) tall.add(i);
        Collections.shuffle(tall);
        long start = System.currentTimeMillis();
        tall.forEach(coll::add);
        long tid = System.currentTimeMillis() - start;
        return (tid < 1000L ? tid+" millisekunder" : tid/1000.0+ " sekunder");
    }

    private static String fjern(Collection<Integer> coll) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < coll.size(); i++) coll.remove(i);
        long tid = System.currentTimeMillis() - start;
        return (tid < 1000L ? tid+" millisekunder" : tid/1000.0+ " sekunder");
    }

    private static void print(Collection<Integer> coll) {
        System.out.print("[");
        System.out.print(coll.stream().limit(10).map(String::valueOf).collect(Collectors.joining(",")));
        System.out.println("]");
    }

    }