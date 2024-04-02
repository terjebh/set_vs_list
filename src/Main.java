import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int N = 80000;
        Set<Integer> hashSett = new HashSet<>();
        Set<Integer> treeSett = new TreeSet<>();
        List<Integer> arrayListe = new ArrayList<>();
        List<Integer> linkedListe = new LinkedList<>();

        System.out.print(STR."Legge til \{N} tall i Arraylist: \{leggTil(arrayListe, N)} millisekunder "); print(arrayListe);
        System.out.println(STR."Fjerne \{N} tall i Arraylist: \{fjern(arrayListe)} millisekunder");
        System.out.print(STR."Legge til \{N} tall i Linkedlist: \{leggTil(linkedListe, N)} millisekunder "); print(linkedListe);
        System.out.println(STR."Fjerne \{N} tall i Linkedlist: \{fjern(linkedListe)} millisekunder");

        System.out.println("-".repeat(30));
        System.out.print(STR."Legge til \{N} tall i HashSet: \{leggTil(hashSett, N)} millisekunder ");  print(hashSett);
        System.out.println(STR."Fjerne \{N} tall i HashSet: \{fjern(hashSett)} millisekunder");
        System.out.print(STR."Legge til \{N} tall i TreeSet: \{leggTil(treeSett, N)} millisekunder "); print(treeSett);
        System.out.println(STR."Fjerne \{N} tall i TreeSet: \{fjern(treeSett)} millisekunder");

    }

    private static long leggTil(Collection<Integer> coll, int N) {
        List<Integer> tall = new ArrayList<>();
        for (int i = 0; i < N; i++) tall.add(i);
        Collections.shuffle(tall);
        long start = System.currentTimeMillis();
        tall.forEach(coll::add);
        return (System.currentTimeMillis() - start);
    }

    private static long fjern(Collection<Integer> coll) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < coll.size(); i++) coll.remove(i);
        return (System.currentTimeMillis() - start);
    }

    private static void print(Collection<Integer> coll) {
        System.out.print("[");
        System.out.print(coll.stream().limit(10).map(String::valueOf).collect(Collectors.joining(",")));
        System.out.println("]");
    }

    }