public class CommandPatternTest {
    public static void main(String[] args) {
        // create receiver and commands
        Receiver receiver = new Receiver();
        Command command1 = new ConcreteCommand1(receiver);
        Command command2 = new ConcreteCommand2(receiver);
        
        // create macro command and add commands
        MacroCommand macroCommand = new MacroCommand();
        macroCommand.addCommand(command1);
        macroCommand.addCommand(command2);
        
        // create invoker and set command
        Invoker invoker = new Invoker();
        invoker.setCommand(macroCommand);
        
        // execute command
        invoker.executeCommand();
        
        // undo command
        invoker.undoCommand();
    }
}
