package collection.support;

import java.util.StringJoiner;

public class Stu implements Comparable<Stu> {

    int id;
    String name;

    double score;


    @Override
    public int compareTo(Stu o) {
        Stu s1 = this;
        Stu s2 = o;

        if(s1.getScore()>s2.getScore()) return -1;
        else if(s1.getScore()<s2.getScore()) return 1;
        else return 0;
    }

    @Override
    public int hashCode() {   // first
        System.out.println("hashcode ~~~ : " + id*name.hashCode());
        return id*name.hashCode();
//        return 1;
    }

    @Override
    public boolean equals(Object obj) { // second
//        System.out.println("equals  ~~~");
//        Stu s1 = this;
//        Stu s2 = (Stu)obj;
//
//        if(s1.getId() == s2.getId()) return true;
//        else return false;
        return true;
    }

    public Stu() {
    }

    public Stu(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Stu(int id, String name , double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Stu.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("score=" + score)
                .toString();
    }
}
