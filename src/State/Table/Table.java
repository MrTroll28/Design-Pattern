package State.Table;

import State.Table.States.FreeState;
import State.Table.States.TableState;

public class Table {
    private TableState state;

    public Table() {
        state = new FreeState(); // Mặc định bàn trống khi khởi tạo
    }

    public void setState(TableState state) {
        this.state = state;
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}

