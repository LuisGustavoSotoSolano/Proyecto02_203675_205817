/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistense;

import entities.Category;
import java.util.List;

/**
 *
 * @author Luis
 */
public interface CategoryRepository extends Repository<Category>{
    List<Category> findByName(String name);
}
