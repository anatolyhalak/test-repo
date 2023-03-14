package ru.courses.oop.encapsulation.sotrudniki_4;

public class Sotrudnik {
    private String name;
    private Otdel otdel;

    public Sotrudnik(String name) {
        this.name = name;
    }

    public Sotrudnik(String name, Otdel otdel) {
        this.name = name;
        this.otdel = otdel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Otdel getOtdel() {
        return otdel;
    }

    public void setOtdel(Otdel otdel) {
        this.otdel = otdel;
    }

    @Override
    public String toString() {
        if (otdel.getChief().name.equals(this.name)) {
            return name + " Начальник отдела " + otdel.getName();
        } else {
            return name + " работает в отделе " + otdel.getName();
        }
    }
}
