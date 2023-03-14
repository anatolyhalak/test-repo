package ru.courses.oop.encapsulation.sotrudniki_4;

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


    public static class Otdel {
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


    public static class Sotrudnik {
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


}
