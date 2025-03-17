class BuiltInException {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.toUpperCase()); // Attempting to call a method on null
        }
        catch (NullPointerException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
