import java.util.ArrayList;

public class Main {
    public static void main (String ... args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(3);
        a.add(5);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(2);
        b.add(6);
        b.add(8);
        
        merge(a, b);
        System.out.println(a);
    }

    static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int iA = 0, iB = 0;
        ArrayList<Integer> c = new ArrayList<>();

        while (iA < a.size() && iB < b.size()) {
            c.add(a.get(iA) < b.get(iB) ? a.get(iA++) : b.get(iB++));
        }

        if (iA < a.size()) {
            while (iA < a.size()) {
                c.add(a.get(iA++));
            }
        } else {
            while (iB < b.size()) {
                c.add(b.get(iB++));
            }
        }

        a.clear();
        a.addAll(c);
    }
}
