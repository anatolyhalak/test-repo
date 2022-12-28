package courses.oop.leetcode;

public class MainAPP {
    public static void main(String[] args) {
//        создание городов
        City a = new City("A");
        City b = new City("B");
        City c = new City("C");
        City d = new City("D");
        City e = new City("E");
        City f = new City("F");
//        создание маршрутов города А и добавление их в город.
        Road aRoadB = new Road(b, 5);
        Road aRoadF = new Road(f, 1);
        Road aRoadD = new Road(d, 6);
        a.addRoad(aRoadB);
        a.addRoad(aRoadF);
        a.addRoad(aRoadD);
//        создание маршрутов города B и добавление их в город.
        Road bRoadA = new Road(a, 5);
        Road bRoadC = new Road(c, 3);
        b.addRoad(bRoadA);
        b.addRoad(bRoadC);
//        создание маршрутов города C и добавление их в город.
        Road cRoadB = new Road(b, 3);
        Road cRoadD = new Road(d, 4);
        c.addRoad(cRoadB);
        c.addRoad(cRoadD);
//        создание маршрутов города D и добавление их в город.
        Road dRoadC = new Road(c, 4);
        Road dRoadE = new Road(e, 2);
        Road dRoadA = new Road(a, 6);
        d.addRoad(dRoadC);
        d.addRoad(dRoadE);
        d.addRoad(dRoadA);
//        создание маршрутов города E и добавление их в город.
        Road eRoadF = new Road(f,2);
        e.addRoad(eRoadF);
//        создание маршрутов города F и добавление их в город.
        Road fRoadE = new Road(e,2);
        Road fRoadB = new Road(b,1);
        f.addRoad(fRoadE);
        f.addRoad(fRoadB);




        System.out.println(a);

        System.out.println(b.travel(1));







        }



}