public class City {
    String cityName;
    int cityMaxLenght;
    int cityMaxWidht;

    Street [] streets;




    public City(){
        System.out.println("make city");
    }
    public City(String name, int lenght, int widht){
        cityName=name;
        cityMaxLenght=lenght;
        cityMaxWidht=widht;

    }
    public City(String name, int lenght, int widht, Street[] streets){
        cityName=name;
        cityMaxLenght=lenght;
        cityMaxWidht=widht;

    }

}
