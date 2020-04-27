package ru.job4j.tracker;

public class FindById implements UserAction {
    @Override
    public String name() {
        return "=== Find item by Id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        Item result = tracker.findById(id);
        if (result != null) {
            System.out.println(result.getId() + " " + result.getName());
        } else {
            System.out.println("По данному Id ничего не найдено");
        }
        return true;
    }
}
