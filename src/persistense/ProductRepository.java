/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistense;

import entities.Category;
import entities.Product;
import java.util.List;
import persistense.ConnectionFactory;

/**
 *
 * @author Luis
 */
public interface ProductRepository extends Repository<Product>{
    List<Product> findByName(String name);
    List<Product> findByCategory(Category category);
}
