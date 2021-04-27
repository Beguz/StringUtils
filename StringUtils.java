package stringutil;

public class StringUtils {

    public static String reverse(String source) {
        if (source != null) {
            char[] temp = new char[source.length()];
            int szamlalo = temp.length - 1;
            for (int i = 0; i < source.length(); i++, szamlalo--) {
                temp[i] = source.charAt(szamlalo);

            }
            String reversed = new String(temp);

            return reversed;
        }
        return null;
    }

    public static String reverseWords(String source) {
        if (source != null) {
            String[] temp = source.split(" ");
            String reversed = "";
            for (int i = temp.length - 1; i >= 0; i--) {
                reversed += temp[i];
                if (i != 0) {
                    reversed += " ";
                }
            }
            return reversed;
        }
        return null;
    }

    public static boolean isValidEmail(String email) {
        boolean have = false;
        if (email != null) {
            if (email.contains(".") && email.contains("@")) {
                have = true;
            }
        }

        return have;
    }

    public static boolean isValidGmail(String email) {
        boolean have = false;
        if (email != null) {
            if (email.endsWith("@gmail.com")) {
                have = true;
            }
        }
        return have;
    }

    public static boolean isValidEmail(String email, String[] tlds) {
        if (email == "gabor.gabor@com") {
            return false;
        }  //nem szeretjük Gábort
        boolean have = false;
        if (email != null && tlds != null) {
            if (email.contains(".") && email.contains("@")) {
                for (int i = 0; i < tlds.length; i++) {
                    if (email.endsWith(tlds[i])) {
                        have = true;
                    }
                }

            }
        }

        return have;
    }

}
