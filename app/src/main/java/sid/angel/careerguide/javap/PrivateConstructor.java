package sid.angel.careerguide.javap;

public class PrivateConstructor {


    private PrivateConstructor() {

    }

    public PrivateConstructor(int i) {

    }

    public static PrivateConstructor obj = new PrivateConstructor();

    public static PrivateConstructor getTest() {

        return obj;//new PrivateConstructor();
    }
}
