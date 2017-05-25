package test.com.cjpowered.learn.inventory;

import java.time.LocalDate;
import java.util.List;

import com.cjpowered.learn.inventory.InventoryDatabase;
import com.cjpowered.learn.inventory.Item;
import com.cjpowered.learn.inventory.Warehouse;

public class DatabaseTemplate implements InventoryDatabase {

    @Override
    public int onHand(final Item item) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public List<Item> stockItems() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void setRequiredOnHand(final Item item, final int newAmount) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onOrder(final Item item) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onHand(final Item item, final Warehouse warehouse) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onOrder(Item item, Warehouse warehouse) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void setRequiredOnHand(Item item, Warehouse warehouse, int newAmount) {
        throw new UnsupportedOperationException("Not yet implemented");        
    }
    
    @Override
    public int expireOnOrBefore(final Item item, final Warehouse warehouse, final LocalDate when) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

}
