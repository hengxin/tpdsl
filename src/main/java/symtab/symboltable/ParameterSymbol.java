package symtab.symboltable;

/**
 * A parameter is just kind of variable
 * used as an argument to a function.
 */
public class ParameterSymbol extends VariableSymbol {
	public ParameterSymbol(String name) {
		super(name);
	}
}
