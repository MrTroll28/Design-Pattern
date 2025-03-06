package State.Table.States;

import State.Table.Table;

public class FixingState implements TableState {
    @Override
    public void next(Table table) {
        table.setState(new DoneState());
    }

    @Override
    public void printStatus() {
        System.out.println("🔧 Bàn đang sửa chữa (Fixing - Red)");
    }
}
