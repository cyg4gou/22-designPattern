package struct.adapter.object;

import struct.adapter.Target1;
import struct.adapter.Target2;

//对象适配器
public class ObjectAdapter implements Target1 {
    private Target2 target2;
    ObjectAdapter(Target2 target2) {this.target2 = target2;}
    @Override
    public void phone() {target2.computer();}
}
