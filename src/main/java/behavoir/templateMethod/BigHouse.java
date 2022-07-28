package behavoir.templateMethod;

public class BigHouse extends HouseBuilder{


    @Override
    void zhuZi() {
        System.out.println("小房子的柱子纸糊的");
    }

    @Override
    void wall() {
        System.out.println("小房子的墙壁纸糊的");
    }
}
