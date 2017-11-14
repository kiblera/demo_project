package sprint_1.kib19;

public class Controller {
    public static void main(String[] args) {

        IphoneClass3 modelx = new IphoneClass3(true, true, 3);
        modelx.setCameras(2);
        modelx.playsmusic(true);
        modelx.hasapps(true);
        modelx.setIsmobile(true);
        modelx.isMakescalls(true);
        modelx.isHasscreen(true);


        System.out.println(modelx.toString());

    }
}
