public class Test {
    public static void main(String[] args) {
        String[] array1 = {"@TAG1", "@TAG2", "@Regression", "@LEGACY_PLATFORM"};
        System.out.println(Methods.stringExistsInArray("key kiu @TAG1-2323_S2 kukui ff", array1));
        System.out.println(Methods.stringExistsInArray("key kiu @Regression_S23 kukui ff", array1));

    }
}
