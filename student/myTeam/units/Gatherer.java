package teams.student.myTeam.units;


import components.weapon.economy.Collector;
import components.weapon.utility.SpeedBoost;
import objects.entity.unit.Frame;
import objects.entity.unit.Model;
import objects.entity.unit.Style;
import objects.entity.unit.Unit;
import objects.resource.Resource;
import teams.student.myTeam.MyTeam;
import teams.student.myTeam.MyTeamUnit;

public class Gatherer extends MyTeamUnit
{

	
	public void design()
	{
		setFrame(Frame.LIGHT);
		setModel(Model.TRANSPORT);
		setStyle(Style.BUBBLE);
		add(Collector.class);
        //add(SpeedBoost.class);
	}

	public void action() 
	{
		returnResources();
		gatherResources();
       // getWeaponTwo().use();

	}

	public void returnResources() {
        Unit ally = getNearestAlly();
        if (isFull()) {
                moveTo(getHomeBase());
                deposit();
            }

    }

	public void gatherResources()
	{
		if(hasCapacity())
		{
			Resource r = getNearestResource();
            Unit enemy = getNearestEnemy();
            Unit ally = getNearestAlly();

            float enemyDist = getDistance(enemy);
            float resDist = getDistance(r);

			if(r != null) {

                if (enemy == null || resDist < enemyDist - 100) {
                    moveTo(r);
                    ((Collector) getWeaponOne()).use(r);
                }
                else
                {
                    moveTo(getHomeBase());
                    deposit();
                }
			}
		}
	}




}
