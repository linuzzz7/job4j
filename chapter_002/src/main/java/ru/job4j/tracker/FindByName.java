package ru.job4j.tracker;

public class FindByName implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] result = tracker.findByName(name);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i].getId() + " " + result[i].getName());
        }
        return true;
    }
}
