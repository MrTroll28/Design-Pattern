package State.Table.States;

import State.Table.Table;

public class FreeState implements TableState {
    @Override
    public void next(Table table) {
        table.setState(new OrderState());
    }

    @Override
    public void printStatus() {
        System.out.println("🚀 Bàn đang trống (Free - Green)");
    }
}
