package struct.adapter.clazz;

import struct.adapter.Target1;

public class CygTest {
    public static void main(String[] args) {
        Target1 clazzAdapter = new ClazzAdapter();
        clazzAdapter.phone();
    }
}
