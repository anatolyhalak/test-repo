package courses.oop.encapsulation.sotrudniki_4;

public class Otdel {
    private String name;
    private Sotrudnik chief;

    public Otdel(String name) {
        this.name = name;
    }

    public Otdel(String name, Sotrudnik chief) {
        this.name = name;
        this.chief = chief;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sotrudnik getChief() {
        return chief;
    }

    public void setChief(Sotrudnik chief) {
        this.chief = chief;
    }

    @Override
    public String toString() {
        return "Отдел " + name + ", Начальник отдела " + chief;
    }
}
