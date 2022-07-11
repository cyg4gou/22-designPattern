package struct.adapter.object;

import struct.adapter.Target1;
import struct.adapter.Target2;

public class CygTest {

    public static void main(String[] args) {
        Target1 objectAdapter = new ObjectAdapter(new Target2());
        objectAdapter.phone();
    }

}
