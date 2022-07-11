package struct.adapter.clazz;

import struct.adapter.Target1;
import struct.adapter.Target2;

//类适配器
public class ClazzAdapter extends Target2 implements Target1 {
    @Override
    public void phone() {
        computer();
    }
}
