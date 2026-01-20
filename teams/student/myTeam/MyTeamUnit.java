package teams.student.myTeam;

import components.weapon.Weapon;
import components.weapon.economy.Collector;
import components.weapon.explosive.HeavyMissile;
import components.weapon.utility.Pullbeam;
import components.weapon.kinetic.*;
import engine.states.Game;
import objects.entity.unit.Unit;
import org.newdawn.slick.Graphics;
import player.Player;
import teams.foes.arsonist.units.Titan;
import teams.student.myTeam.units.Fighter;

public abstract class MyTeamUnit extends Unit
{
	public MyTeam getPlayer()
	{
		return (MyTeam) super.getPlayer();
	}

	public void action()
	{
        Unit friend = getNearestAlly();

        if (friend.hasWeapon(HeavyMissile.class)) {
            if (getAverageEnemyMaxSpeed() < 50) {
                attack(getWeaponOne());
            } else {
                attack(getWeaponOne());
            }
        }
        else
            attack(getWeaponOne());
            attack(getWeaponTwo());
		movement();
	}

	public void attack(Weapon w)
	{
		Unit enemy = getNearestEnemy();

		if(enemy != null && w != null)
		{
			w.use(enemy);
		}
	}

	public void movement()
	{
		Unit enemy = getNearestEnemy();
        Unit active = getNearestActiveEnemy();
        Unit gatherer = getNearestEnemyGatherer();
        Unit grappler = getNearestFriendlyGrappler();
        Unit friend = getNearestAlly();
        Unit striker = getNearestFriendlySwarmer();

 if (getDistance(getHomeBase()) > 2400 &&  getPlayer().countMyUnits(Fighter.class) < 10) {
            moveTo(getHomeBase());
            return;
        }

        if (friend != null && getDistance(friend) < 60) {
            turnTo(friend);
            turnAround();
            move();
            return;
        }


        if (enemy != null) {
            if (getDistance(enemy) > getMaxRange()) {
                if(friend.hasWeapon(Autocannon.class))
                {
                    moveTo(gatherer);
                    if (getDistance(active) < 500)
                    {
                        turnAround();
                        move();
                    }
                }
                moveTo(enemy);
            } else {
                turnTo(enemy);
            }
            return;
        }



	}

    public boolean tooFast()
    {
        int nuts = getAverageEnemyMaxSpeed();

        if (nuts < 50)

        {
            return true;
        }

        return false;
    }


// Unit grappler = getNearestFriendlyGrappler();

    /*
            if ((getDistance(enemy) < getDistance(gatherer)))
            {
                if (getDistance(gatherer) > getMaxRange())
                {
                 //   moveTo(gatherer);
                }
            }
            else */


	public void draw(Graphics g) 
	{

	}
}
