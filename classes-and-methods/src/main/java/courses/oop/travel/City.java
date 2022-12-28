package courses.oop.travel;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class City {
    String name;
    Set<Road> roads = new HashSet<>();

    public City(String name) {
        this.name = name;
    }

    public City(String name, Set<Road> road) {
        this.name = name;
        this.roads = road;
    }


    public void addRoad(Road road){
        this.roads.add(road);
    }

    public void addRoad(City city, int cost){
        Road road = new Road(city, cost);
        this.roads.add(road);
    }

    public City travel(int n){
        City now = this;
        for(int i = 0; i <=n; i++){
            Iterator<Road> iterator = now.roads.iterator();
            if(iterator.hasNext()){
                Road r = iterator.next();
                now = r.town;
            }
            else return null;
        }
        return now;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Название города: " + name + "\n");
        str.append("Список связанных с ним городов: " + "\n");
        for (Road road : roads) {
            str.append(road.town.name +": "+ road.cost + "\n");
        }
           return str.toString();
    }
}
