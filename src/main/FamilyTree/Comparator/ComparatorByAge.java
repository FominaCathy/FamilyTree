package FamilyTree.Comparator;

import FamilyTree.Human;

import java.util.Comparator;

public class ComparatorByAge implements Comparator<Human> {

    @Override
    public int compare(Human human, Human t1) {
        return human.getBirtDay().compareTo(t1.getBirtDay());

    }
}