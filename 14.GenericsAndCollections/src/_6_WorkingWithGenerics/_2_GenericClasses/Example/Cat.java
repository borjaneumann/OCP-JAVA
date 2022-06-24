package _6_WorkingWithGenerics._2_GenericClasses.Example2;


public class Cat extends Animal {
    private String litterPreference;
    private String name;

    public Cat (String name) {
        this.name = name;
    }

    public String getLitterPreference() {
        return litterPreference;
    }

    public void setLitterPreference(String litterPreference) {
        this.litterPreference = litterPreference;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "litterPreference='" + litterPreference + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
