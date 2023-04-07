package task055;

import java.util.ArrayList;
import java.util.List;

public class MacroCommand extends Command {
    private List<Command> commands;
    
    public MacroCommand() {
        commands = new ArrayList<>();
    }
    
    /**
     *
     * @param command2
     */
    public void addCommand(Command command2) {
        commands.add(command2);
    }
    
    public void removeCommand(Command command) {
        commands.remove(command);
    }
    
    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
    
    @Override
    public void undo() {
        for (int i = commands.size() - 1; i >= 0; i--) {
            commands.get(i).undo();
        }
    }

}
