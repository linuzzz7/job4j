package ru.job4j.tracker;

import org.w3c.dom.ls.LSOutput;

public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
//            System.out.print("Select: ");
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
//                System.out.print("Enter name: ");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== All Items ====");
                Item[] result = tracker.findAll();
                for (int i = 0; i < result.length; i++) {
                    System.out.println(result[i].getId() + " " + result[i].getName());
                }
            } else if (select == 2) {
                System.out.println("=== Replace Item ====");
//                System.out.print("Enter id: ");
                String id = input.askStr("Enter id: ");
//                System.out.println("Enter new text");
                String textNew = input.askStr("Enter new text");
                Item itemNew = new Item(textNew);
                if (tracker.replace(id, itemNew)) {
                    System.out.println("Замена произведена успешно");
                } else {
                    System.out.println("Замена не произведена");
                }
            } else if (select == 3) {
                System.out.println("=== Delete Item ====");
//                System.out.print("Enter id: ");
                String id = input.askStr("Enter id: ");
                if (tracker.delete(id)) {
                    System.out.println("Удаление произведено успешно");
                } else {
                    System.out.println("Удаление не произведена");
                }
            } else if (select == 4) {
                System.out.println("=== Find item by Id ====");
//                System.out.print("Enter id: ");
                String id = input.askStr("Enter id: ");
                Item result = tracker.findById(id);
                if (result != null) {
                    System.out.println(result.getId() + " " + result.getName());
                } else {
                    System.out.println("По данному Id ничего не найдено");
                }
            } else if (select == 5) {
                System.out.println("=== Find items by name ====");
//                System.out.print("Enter name: ");
                String name = input.askStr("Enter name: ");
                Item[] result = tracker.findByName(name);
                for (int i = 0; i < result.length; i++) {
                    System.out.println(result[i].getId() + " " + result[i].getName());
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println(System.lineSeparator() + "Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}