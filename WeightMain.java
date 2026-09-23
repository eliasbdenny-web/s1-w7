public class WeightMain{
    public static void main(String[] args) {
        Weight w = new Weight(5, 8);
        Weight w2 = new Weight(3, 12);
        boolean b = w.isHeavier(w2);
        System.out.println(b);
        Weight w3 = w.multiple(3);
        w.print();
    }
}