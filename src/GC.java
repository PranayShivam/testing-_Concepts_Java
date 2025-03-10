public class GC {
    public static void main(String[] args) {
        for (int i = 0; i < 1_000_000; i++) {
            System.out.println(new Object()); // Creating many objects to trigger GC
        }
        System.gc(); // GC may run due to high memory usage
    }
}
