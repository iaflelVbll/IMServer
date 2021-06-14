package command;

import java.io.IOException;

public interface Command {

	StringBuilder execute() throws IOException;
}
