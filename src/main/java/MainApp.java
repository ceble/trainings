public class MainApp {
    private static final String TEXT = "dupadupadupadupa";
    private static final String PATTERN = "dupa";

    public static void main(String[] args) {


        StringAnaliser anal = new StringAnaliser();

       int abc = anal.findInstances(TEXT, PATTERN);

        System.out.println("Wynikiem tego programu jest: " + abc);
    }
}
