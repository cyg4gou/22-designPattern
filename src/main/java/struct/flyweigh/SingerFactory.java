package struct.flyweigh;

import java.util.HashMap;
import java.util.Map;

public class SingerFactory {

    private SingerFactory(){}
    private static int i = 0;

    private final static Map<String, Singer> map = new HashMap<>();

    private static class Builder {
        private final static SingerFactory instance = new SingerFactory();
    }

    public static SingerFactory getInstance() {
        return Builder.instance;
    }

    public Singer getSinger(String name) {
        Singer singer = map.getOrDefault(name, null);
        if (singer == null) {
            singer = new Singer(name);
            System.out.println(i++);
            map.put(name, singer);
        }
        return singer;
    }
}
