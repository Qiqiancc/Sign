public class Sign {
    public static int Width;
    public static String Text;
    public Sign(String text, int width) {
        Text = text;
        Width = width;
    }
    public static int numberOfLines() {
        int l = Text.length();
        if (l % Width != 0) l += Width;
        return l / Width;
    }
    public static String getLines() {
        if (Text == null || Text.isEmpty()) return null;
        String a = "";
        for (int i = 0; i <= (numberOfLines()-1); i++) {
            int b = (i + 1) * Width;
            if (b > Text.length()) b = Text.length();
            a += (Text.substring((i * Width), (b)) + ";");
        }
        a = a.substring(0, (a.length() - 1));
        return a;
    }
}

