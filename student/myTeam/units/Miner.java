package teams.student.myTeam.units;


import components.weapon.Weapon;
import components.weapon.economy.Drillbeam;
import components.weapon.utility.CommandRelay;
import objects.entity.node.Node;
import objects.entity.unit.Frame;
import objects.entity.unit.Model;
import objects.entity.unit.Style;
import teams.student.myTeam.MyTeam;
import teams.student.myTeam.MyTeamUnit;

public class Miner extends MyTeamUnit
{

    private Node targetNode;


    public void design()
	{
		setFrame(Frame.LIGHT);
		setModel(Model.DESTROYER);
		setStyle(Style.DRAGON);
		add(Drillbeam.class);
	}

	public void action() 
	{
		harvest(getNearestNode(), getWeaponOne());
	}

	public void harvest(Node n, Weapon w)
	{

        n = getBaseNode();

		if(getDistance(n) > w.getMaxRange() * .5f)
		{
			moveTo(n);
		}

		else if(getDistance(n) < w.getMinRange() * 1.5f)
		{
			turnTo(n);
			turnAround();
			move();
		}
				
		w.use(n);
	}

    public Node getBaseNode()
    {
        if (targetNode == null || targetNode.isDead()) {
            targetNode = getHomeBase().getNearestNode();
        }
        return targetNode;
    }


}
