public class Student {
    private int ID, bonus, report, app;
    private String name, email;
    private float LT;
    private float average;

    public Student() {
    }

    public Student(int ID, String name, String email, int bonus, int report, int app, float LT, float average) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.bonus = bonus;
        this.report = report;
        this.app = app;
        this.LT = LT;
        this.average = average;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getReport() {
        return report;
    }

    public int getApp() {
        return app;
    }

    public float getLT() {
        return LT;
    }

    public int getBonus() {
        return bonus;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", bonus=" + bonus +
                ", report=" + report +
                ", app=" + app +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", LT=" + LT +
                ", average=" + average +
                '}';
    }
}
