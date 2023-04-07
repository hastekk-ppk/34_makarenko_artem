package task055;

import java.util.Stack;

public class UndoManager {
    private static UndoManager instance;
    private Stack<Command> undoStack;
    
    public UndoManager() {
        undoStack = new Stack<>();
    }
    
    public static UndoManager getInstance() {
        if (instance == null) {
            instance = new UndoManager();
        }
        return instance;
    }
    
    public void execute(Command command) {
        command.execute();
        undoStack.push(command);
    }
    
    public void undo() {
        if (!undoStack.isEmpty()) {
            Command command = undoStack.pop();
            command.undo();
        }
    }
}
