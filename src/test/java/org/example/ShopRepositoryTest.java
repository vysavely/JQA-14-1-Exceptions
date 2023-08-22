package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShopRepositoryTest {

    Product product0 = new Product(10, "Тушенка", 200);
    Product product1 = new Product(11, "Макароны", 50);
    Product product2 = new Product(12, "Хлеб", 40);


    @Test
    public void repoRemoveTest1() { //тест удаления существующего продукта из репозитория

        ShopRepository shopRepository = new ShopRepository();
        shopRepository.add(product0);
        shopRepository.add(product1);
        shopRepository.remove(11);

        Product[] Expected = shopRepository.findAll();
        Product[] Actual = {product0};

        Assertions.assertArrayEquals(Expected, Actual);

    }

    @Test
    public void RemoveWhenIdNotExist() { //тест удаления несуществующего продукта и выброса соотв. исключения

        ShopRepository shopRepository = new ShopRepository();
        shopRepository.add(product2);

        Assertions.assertThrows(NotFoundException.class, () -> shopRepository.remove(15));
            }
}

//        NotFoundException notFoundException = new NotFoundException("Element with id: " + id + " not found");




