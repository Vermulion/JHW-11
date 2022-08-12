package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {


    String poster1 = "Star wars I";
    String poster2 = "Star wars II";
    String poster3 = "Star wars III";
    String poster4 = "Star wars IV";
    String poster5 = "Star wars V";
    String poster6 = "Star wars VI";
    String poster7 = "Star wars VII";
    String poster8 = "Star wars VIII";
    String poster9 = "Star wars IX";
    String poster10 = "Star wars X";
    String poster11 = "Star wars XI";

    //Adding and showing posters test
    @Test
    public void showSomePosters() {

        Manager manager = new Manager();
        manager.add(poster1);
        manager.add(poster2);
        manager.add(poster3);
        manager.add(poster4);
        manager.add(poster5);
        manager.add(poster6);
        manager.add(poster7);

        String[] expected = {
                poster1,
                poster2,
                poster3,
                poster4,
                poster5,
                poster6,
                poster7

        };
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowNoPosters() {

        Manager manager = new Manager();

        String[] expected = {
        };
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    //Testing limits and raw oder
    @Test
    public void shouldShowLastInTheTop() {
        Manager manager = new Manager(7);
        manager.add(poster1);
        manager.add(poster2);
        manager.add(poster3);
        manager.add(poster4);
        manager.add(poster5);
        manager.add(poster6);
        manager.add(poster7);

        String[] expected = {
                poster7,
                poster6,
                poster5,
                poster4,
                poster3,
                poster2,
                poster1

        };

        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLimited() {
        Manager manager = new Manager(6);
        manager.add(poster1);
        manager.add(poster2);
        manager.add(poster3);
        manager.add(poster4);
        manager.add(poster5);
        manager.add(poster6);
        manager.add(poster7);

        String[] expected = {
                poster7,
                poster6,
                poster5,
                poster4,
                poster3,
                poster2,

        };

        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldShowLimitedByDefault() {
        Manager manager = new Manager();
        manager.add(poster1);
        manager.add(poster2);
        manager.add(poster3);
        manager.add(poster4);
        manager.add(poster5);
        manager.add(poster6);
        manager.add(poster7);
        manager.add(poster8);
        manager.add(poster9);
        manager.add(poster10);
        manager.add(poster11);

        String[] expected = {
                poster11,
                poster10,
                poster9,
                poster8,
                poster7,
                poster6,
                poster5,
                poster4,
                poster3,
                poster2,

        };

        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldShowNothing() {
        Manager manager = new Manager(0);
        manager.add(poster1);
        manager.add(poster2);
        manager.add(poster3);
        manager.add(poster4);
        manager.add(poster5);
        manager.add(poster6);
        manager.add(poster7);
        manager.add(poster8);
        manager.add(poster9);
        manager.add(poster10);
        manager.add(poster11);

        String[] expected = {
        };

        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
