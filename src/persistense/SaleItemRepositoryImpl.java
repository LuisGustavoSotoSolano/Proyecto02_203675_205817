/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistense;

import entities.SaleItem;
import javax.persistence.EntityManager;

/**
 *
 * @author Luis
 */
public class SaleItemRepositoryImpl extends RepositoryBase<SaleItem> implements SaleItemRepository{
    
    public SaleItemRepositoryImpl(EntityManager entityManager, Class<SaleItem> cls) {
        super(entityManager, cls);
    }
    
}
