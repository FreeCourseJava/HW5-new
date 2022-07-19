public class Street {
    String streetName;
    int cadastralNumber;
    boolean isMain;
    int streetLenght;
    int streetAverageWidht;
    public Home [] homes;
    public Park [] parks;

    public Street(String streetName, int cadastralNumber, boolean isMain, int streetLenght, int streetAverageWidht, Home [] homes, Park [] parks){

        System.out.println("make with park and homes");
    }
    public Street(String streetName, int cadastralNumber, boolean isMain, int streetLenght, int streetAverageWidht){

        System.out.println("make without park and homes");
    }
    public Street(){
        System.out.println("make street");
    }
}
