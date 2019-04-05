import sac.State;
import sac.StateFunction;

public class MisplacedTilesFunction extends StateFunction
{

	@Override
	public double calculate(State state)
	{
		int misplaced = 0;
		int[][] tab = ((Puzzle) state).getTab();
		
		int k = 0;
		for (int i = 0; i < Puzzle.n; i++)
			for (int j = 0; j < Puzzle.n; j++)
				if (tab[i][j] != k++)
					misplaced++;
		
		return misplaced;
	}
	
}
