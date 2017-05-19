package test.com.cjpowered.learn.inventory;

import java.util.List;

import com.cjpowered.learn.inventory.InventoryDatabase;
import com.cjpowered.learn.inventory.Item;

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("NYI");
    }

    @Override
    public int onOrder(final Item item) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("NYI");
    }

}
