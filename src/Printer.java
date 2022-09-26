public class Printer {

    private String model;
    private boolean isLaserJet;

    public Printer(String model, boolean isLaserJet) {
        this.model = model;
        this.isLaserJet = isLaserJet;
    }

    public void info() {
        System.out.println(model  + " " + isLaserJet);
    }

    public void print(String filePath) {
        try {
            System.out.println("{");
            Thread.sleep(100);
            System.out.println(filePath);
            Thread.sleep(100);
            System.out.println("}");
        }
        catch (Exception e) {}
    }

    /*public synchronized void print(String filePath) {
        try {
            System.out.println("{");
            Thread.sleep(100);
            System.out.println(filePath);
            Thread.sleep(100);
            System.out.println("}");
        }
        catch (Exception e) {}
    }*/

}
