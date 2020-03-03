package ru.job4j.pojo;

public class Shop {
    public static void main(String[] args) {
//        Product products[] = new Product[5];
//        products[0] = new Product("Milk", 10);
//        products[1] = new Product("Bread", 4);
//        products[2] = new Product("Egg", 19);
//
//        for (int i = 0; i < products.length; i++) {
//            Product product = products[i];
//            //проверяем, что объект не равен null. тк у нас массив не заполнен целиком.
//            if (product != null) {
//                System.out.println(product.getName());
//            } else {
//                System.out.println("null");
//            }
//        }
//
//        System.out.println();
//        System.out.println("Удаляем значение из ячейки с индексом 1");
//        //удаляем значение из ячейки с индексом 1
//        products[1] = null;
//
//        for (int i = 0; i < products.length; i++) {
//            Product product = products[i];
//            //проверяем, что объект не равен null. тк у нас массив не заполнен целиком.
//            if (product != null) {
//                System.out.println(product.getName());
//            } else {
//                System.out.println("null");
//            }
//        }
//
//        System.out.println();
//        System.out.println("Записываем  в ячейку с индексом 1 значение ячейки с индексом 2 и удаляем значение из ячейки с индексом 2");
//        //записываем в ячейку с индексом 1 значение ячейки с индексом 2.
//        products[1] = products[2];
//        //удаляем значение из ячейки с индексом 2.
//        products[2] = null;
//        for (int i = 0; i < products.length; i++) {
//            Product product = products[i];
//            //проверяем, что объект не равен null. так как  у нас массив не заполнен целиком.
//            if (product != null) {
//                System.out.println(product.getName());
//            } else {
//                System.out.println("null");
//            }
//        }

        Product products2[] = new Product[4];
        products2[0] = new Product("Water", 17);
        products2[1] = new Product("Chis", 4);
        products2[2] = new Product("Orange", 59);
        products2[3] = new Product("Potato", 20);
        Shop shop2 = new Shop();
        products2 = shop2.delete(products2, 1);
        for (int i = 0; i < products2.length; i++) {
            Product product2 = products2[i];
            //проверяем, что объект не равен null. так как  у нас массив не заполнен целиком.
            if (product2 != null) {
                System.out.println(product2.getName());
            } else {
                System.out.println("null");
            }
        }
    }

    public Product[] delete(Product[] products, int index) {
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
        return products;
    }
}