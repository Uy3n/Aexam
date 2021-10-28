import java.io.*;
import java.util.*;

public class Ex1 {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Aexam\\src\\main\\java\\data.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if(values[0].equals("ID")) continue;
                int id = Integer.parseInt(values[0]) ;
                String name = values[1] ;
                String email = values[2] ;
                int bonus = Integer.parseInt(values[3]) ;
                int report = Integer.parseInt(values[4]) ;
                int app = Integer.parseInt(values[5]) ;
                float LT = Float.parseFloat(values[6]) ;
                Student a = new Student(id, name, email,bonus,report,app,LT,0);
                students.add(a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(students, Comparator.comparing(Student::getLT));
        Collections.reverse(students);
        int dem = 0;
        for(Student s : students){
            System.out.println(s);
            dem++;
            if(dem == 10 ) break;
        }

        for(Student s : students){
            double average = s.getBonus()*(0.1) + s.getReport()*(0.3) + s.getApp()*(0.15) + s.getLT()*0.45;
            s.setAverage(Math.round(average));
            System.out.println(s.getName()+":"+ Math.round(average));
        }

        Collections.sort(students,Comparator.comparing(Student::getAverage));
        for(Student s : students){
            System.out.println(s);
            dem++;
            if(dem == 10 ) break;
        }

    }



}