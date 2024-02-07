public class MobileFactory {
    public OS getPhone(String str) {
        switch (str) {
            case "Samsung" -> {
                return new Samsung();
            }
            case "iPhone" -> {
                return new IPhone();
            }
            case "Nokia" -> {
                return new Nokia();
            }
        }
        return null;
    }
}