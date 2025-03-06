package State.Table.States;

import State.Table.Table;

class DoneState implements TableState {
    @Override
    public void next(Table table) {
        table.setState(new FreeState());
    }

    @Override
    public void printStatus() {
        System.out.println("✅ Bàn đã phục vụ xong (Done - Yellow)");
    }
}
