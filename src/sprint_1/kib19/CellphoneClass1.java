package sprint_1.kib19;

//  Create a three class hierarchy. Class1 should be the parent class, Class2 should extend Class1 and Class3 should extend Class2. All instance variables should be private.
//        -Demonstrate how to access instance variables in a superclass from a subclass.
//        -Demonstrate the use of (non getter and setter) methods in a superclass from a subclass.
//        -Demonstrate the use of the super keyword in at least one constructor.

public class CellphoneClass1 {

    private boolean ismobile;      // if phone is mobile, true
    private boolean makescalls;    // if phone makes calls, true
    private boolean hasscreen;     // if phone has screen, true

    public CellphoneClass1() {

        // This is a constructor for Cellphone Class1.
//        CellphoneClass1(boolean ismobile, boolean makescalls, boolean hasscreen) {
//            ismobile = true;
//            makescalls = true;
//            hasscreen = true;

//            CellphoneClass1(int cameras, boolean playsmusic, boolean hasapps) {
//                super(cameras, playsmusic, hasapps);
//            }
    }

        // Access methods for instance variables.
        public void setIsmobile(boolean ismobile) {
            this.ismobile = ismobile;
        }

        public void isMakescalls(boolean makescalls) {
            this.makescalls = makescalls;
        }

        public void isHasscreen(boolean hasscreen) {
            this.hasscreen=hasscreen;
        }


    @Override
    public String toString() {
        return "CellphoneClass1{" +
                "ismobile=" + ismobile +
                ", makescalls=" + makescalls +
                ", hasscreen='" + hasscreen + '\'' +
                '}';
    }

    public static class SmartphoneClass2 extends CellphoneClass1 {

        private int cameras = 2;      // number of cameras in phone
        private boolean playsmusic = true;    // if phone plays music, true
        private boolean hasapps = true;     // if phone has apps, true


        SmartphoneClass2() {this.cameras = cameras;}
        public boolean playsmusic(boolean b) {return playsmusic;}
        public boolean hasapps(boolean b) {return hasapps;}

        public int getCameras() { return cameras;}
        public void setCameras(int cameras) {
            this.cameras = cameras;
        }

        @Override
        public String toString() {
            System.out.println(super.toString());
            return "SmartphoneClass2{" +
                    "cameras=" + cameras +
                    ", playsmusic=" + playsmusic +
                    ", hasapps=" + hasapps +
                    '}';
        }
        // This is a constructor for Smartphone Class2.
        SmartphoneClass2(int cameras, boolean playsmusic, boolean hasapps) {
            super();
            cameras = 2;
            playsmusic = true;
            hasapps = true;
        }
    }
}