package sprint_1.kib19;

public class IphoneClass3 extends CellphoneClass1.SmartphoneClass2 {

    private boolean hassiri = true;    // if smartphone has siri, true
    private boolean hasitunes = true;     // if smartphone has itunes, true
    private int storagesizeoptions = 3;      // number of storage size options

//     This is a constructor for Iphone Class3.
//    IphoneClass3(int storagesizeoptions, boolean hassiri, boolean hasitunes) {
//        hassiri = true;
//        hasitunes = true;
//        storagesizeoptions = 3;

    IphoneClass3(boolean b, boolean b1, int i) {
        super();
        this.hassiri = hassiri;
        this.hasitunes = hasitunes;
        this.storagesizeoptions = storagesizeoptions;}

    public boolean isHassiri() { return hassiri; }

    public boolean isHasitunes() { return hasitunes; }

    public int getStoragesizeoptions() { return storagesizeoptions; }

    public void setStoragesizeoptions(int storagesizeoptions) { this.storagesizeoptions = storagesizeoptions; }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "IphoneClass3{" +
                "hassiri=" + hassiri +
                ", hasitunes=" + hasitunes +
                ", storagesizeoptions=" + storagesizeoptions +
                '}';
    }
}