public class Main {
    public static void main(String[] args) {
        BooleanOperations bo = new BooleanOperations(false, true);
        System.out.println(bo.conjunction());
        System.out.println(bo.disjunction());
    }
}
