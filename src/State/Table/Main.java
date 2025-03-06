package State.Table;

import State.Table.States.FixingState;

public class Main {
    public static void main(String[] args) {
        Table table = new Table();

        table.printStatus();  // Free
        table.nextState();     // Chuyển sang Order

        table.printStatus();  // Order
        table.nextState();     // Chuyển sang Done

        table.printStatus();  // Done
        table.nextState();     // Chuyển về Free

        table.printStatus();  // Free
        table.setState(new FixingState());  // Chuyển sang Fixing

        table.printStatus();  // Fixing
        table.nextState();     // Chuyển sang Done

        table.printStatus();  // Done
        table.nextState();     // Chuyển về Free

        table.printStatus();  // Free
    }
}

