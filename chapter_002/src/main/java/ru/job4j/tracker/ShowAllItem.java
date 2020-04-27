package ru.job4j.tracker;

public class ShowAllItem implements UserAction {
    @Override
    public String name() {
        return "=== All Items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] result = tracker.findAll();
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i].getId() + " " + result[i].getName());
        }
        return true;
    }
}
