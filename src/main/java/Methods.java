public class Methods {

    public static boolean stringExistsInArray(String string, String[] array){
        boolean result = false;
        for (String target: array) {
            if (string.contains(target)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
