public class HelloJava2 {

    public static void main(String[] args) {
        try {
            System.out.println(String.format("%s %s", args[0], args[1]));
        } catch (Exception e) {
            System.out.println("Exception thrown  :" + e);
        }
    }
}
