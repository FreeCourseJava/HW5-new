public class Main {
    public static void main(String[] args) {
        City almaty=new City("Almaty", 500,100);
        Street dostyk=new Street("Dostyk", 012, true, 3000,12);
        Park park28=new Park("28 панфиловцев",3000, 200);
        dostyk.parks=new Park []{park28};
        Home home24=new Home("24","32",200,100);
        dostyk.homes=new Home []{home24};
        Street nazar=new Street("Nazarbayeva", 014, true, 6000, 18);
        Park parkPP=new Park("Парк первого президента", 600, 200);
        nazar.parks=new Park[]{parkPP};
        Home home223=new Home("223a","24",50,120);
        nazar.homes=new Home[]{home223};
        almaty.streets=new Street[]{dostyk,nazar};


        Street mangilik=new Street("Mangilik", 052,false, 8500, 12);
        Park botan=new Park("Botanicheskii Sad", 5200,500);
        mangilik.parks=new Park[]{botan};
        Home a40=new Home("40");
        mangilik.homes=new Home[]{a40};
        Street turan=new Street("Turan avenue", 010,true, 8500,16);
        Park les=new Park("Forredst", 5600, 800);
        turan.parks=new Park[]{les};

        City astana=new City("Astana", 300, 50,new Street[]{mangilik, turan});


    }
}
