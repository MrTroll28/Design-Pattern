package State.Table.States;

import State.Table.Table;

class OrderState implements TableState {
    @Override
    public void next(Table table) {
        table.setState(new DoneState());
    }

    @Override
    public void printStatus() {
        System.out.println("🍽️ Bàn đang có khách đặt món (Order - Orange)");
    }
}
