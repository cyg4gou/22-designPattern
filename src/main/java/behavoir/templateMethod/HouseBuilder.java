package behavoir.templateMethod;

public abstract class HouseBuilder {

    public final void builder() {
        System.out.println("-------------%s------------");
        daDiJi();
        zhuZi();
        wall();
        windows();
    }

    private void daDiJi() {
        System.out.println("任何房子都需要先打地基,打了");
    }
    abstract void zhuZi();
    abstract void wall();
    private void windows(){
        System.out.println("任何房子都需要窗户,这房子有");
    }

}
