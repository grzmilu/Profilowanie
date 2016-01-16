
import java.util.Map;

public class MemLeak {

    public final String key;

    public MemLeak(String key) {
        this.key = key;
    }

    public static void main(String args[]) {
        try {
            Map map = System.getProperties();
            MemLeak m = new MemLeak("key");

            for (int i = 0; i < 1000000; i++) {
                map.put(m, "value");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
