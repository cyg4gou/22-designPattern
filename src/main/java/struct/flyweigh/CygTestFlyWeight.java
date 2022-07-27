package struct.flyweigh;

import java.util.ArrayList;
import java.util.List;

public class CygTestFlyWeight {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        SingerFactory instance = SingerFactory.getInstance();
        List<Song> songs = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
//            Singer singer = instance.getSinger("tom" + Math.round(Math.random() * 100 % 10));// result = 7062
            Singer singer = new Singer("tom" +Math.round(Math.random() * 100 % 10)); // result = 12135
            songs.add(new Song("song" + i, singer));
        }
        System.out.println("spend time is : " + (System.currentTimeMillis() - start));
    }

}
