public class Main {

    public static void main(String[] args) {
        String str = "Ака'шд*шка+";
        char[] str2 = new char[str.length()];
        int key = 10;
        for (
                int i = 0; i < str.length(); i++)
            str2[i] = (char) (str.charAt(i) ^ key);
        System.out.println(str2);
    }
}
