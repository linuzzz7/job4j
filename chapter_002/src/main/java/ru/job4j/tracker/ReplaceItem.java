package ru.job4j.tracker;

public class ReplaceItem implements UserAction {
    @Override
    public String name() {
        return "=== Replace Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        String textNew = input.askStr("Enter new text");
        Item itemNew = new Item(textNew);
        if (tracker.replace(id, itemNew)) {
            System.out.println("Замена произведена успешно");
        } else {
            System.out.println("Замена не произведена");
        }
        return true;
    }
}