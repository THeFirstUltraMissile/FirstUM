package teams.student.myTeam;

import org.newdawn.slick.Graphics;
import player.Player;
import teams.student.myTeam.units.*;
import objects.entity.unit.Unit;
import teams.student.myTeam.MyTeamUnit;

public class MyTeam extends Player
{	
	public void setup()
	{		
		setName("Zin Chloride");
		setTeamImage("src/teams/student/myTeam/teamLogo.png");
		setTitle("Funneling many with One");

		setColorPrimary(50, 125, 255);
		setColorSecondary(255, 255, 255);
		setColorAccent(255, 255, 255);

	}
	
	public void strategy() 
	{
        Unit enemy = getEnemyUnits();

		if(getFleetValueUnitPercentage(Gatherer.class) < .1f)
		{
			buildUnit(Gatherer.class);
		}
		else if(getFleetValueUnitPercentage(Miner.class) < .125f)
		{
			buildUnit(Miner.class);
		}
        else if (getFleetValueUnitPercentage(Grappler.class) < .1f && getPlayer().getAverageEnemyMaxSpeed() < 50 )
        {
            buildUnit(Fighter.class);
        }
		else
		{
            buildUnit(Fighter.class);
		}		
	}
			
	public void draw(Graphics g) 
	{
		
	}



}
