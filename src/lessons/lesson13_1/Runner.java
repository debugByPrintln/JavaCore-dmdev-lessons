package lessons.lesson13_1;

public class Runner {
    public static void main(String[] args) {
        Screen monitor = new Monitor(100, 100, "HP");
        Screen screen = new Screen(100, 100);

        info(monitor, screen);

    }

    public static void info(Screen... screens){
        for (Screen screen : screens) {
            screen.load();
            if (screen instanceof Monitor){
                ((Monitor) screen).incrementResolution();
                System.out.println("----------------------------------------");
                System.out.println("Hey, that screen was a monitor!");
                System.out.println("-----------------------------------------");
            }
        }
    }
}
