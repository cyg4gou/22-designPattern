package behavoir.templateMethod;

public class SmallHouse extends HouseBuilder{


    @Override
    void zhuZi() {
        System.out.println("小房子的柱子纸糊的");
    }

    @Override
    void wall() {
        System.out.println("小房子的墙纸糊的");
    }
}
