package _03_ApplyingAccessModifiers._03_04_PublicAccess.pond;

import _03_ApplyingAccessModifiers._03_04_PublicAccess.duck.DuckTeacher;

public class LostDuckling {
    public void swim() {
        DuckTeacher teacher = new DuckTeacher();
        teacher.swim(); //allowed
        System.out.println("Thanks" + teacher.name); //allowed
    }
}


