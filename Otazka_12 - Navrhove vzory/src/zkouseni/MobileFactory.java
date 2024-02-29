public class MobileFactory {
    public OS getPhone(String str, String c) {
        switch (str) {
            case "Samsung" -> {
                return new Samsung(c);
            }
            case "iPhone" -> {
                return new IPhone(c);
            }
            case "Nokia" -> {
                return new Nokia(c);
            }
        }
        return null;
    }
}