package courses.oop.encapsulation.sotrudniki_4;

public class MainApp {
    public static void main(String[] args) {

        Sotrudnik ivan = new Sotrudnik("Ivan");
        Sotrudnik vasya = new Sotrudnik("Vasya");
        Otdel otdel1 = new Otdel("Otdel1", ivan);
        ivan.setOtdel(otdel1);
        vasya.setOtdel(otdel1);
        System.out.println(ivan);
        System.out.println(vasya);
    }
}
