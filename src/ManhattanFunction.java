import sac.State;
import sac.StateFunction;

public class ManhattanFunction extends StateFunction
{

	@Override
	public double calculate(State state)
	{
		int tab[][] = ((Puzzle) state).getTab();
		int manhattan = 0;
		
		for (int i = 0; i < Puzzle.n; i++)
			for (int j = 0; j < Puzzle.n; j++)
			{
				if (tab[i][j] == 0)
					continue;
				
				manhattan += Math.abs(i - tab[i][j] / Puzzle.n) + Math.abs(j - tab[i][j] % Puzzle.n);
			}
		return manhattan;
	}
	
}
