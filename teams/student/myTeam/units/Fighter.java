package teams.student.myTeam.units;

import components.mod.offense.EosMod;
import components.mod.offense.NyxMod;
import components.mod.offense.CerberusMod;
import components.mod.utility.AthenaMod;
import components.upgrade.Plating;
import components.upgrade.Shield;
import components.weapon.energy.HeavyLaser;
import components.weapon.energy.Laser;
import components.weapon.explosive.HeavyMissile;
import components.weapon.explosive.Missile;
import components.weapon.utility.AntiMissileSystem;
import components.weapon.utility.*;
import components.weapon.kinetic.Autocannon;
import objects.entity.unit.Frame;
import objects.entity.unit.Model;
import objects.entity.unit.Style;
import teams.student.myTeam.MyTeam;
import teams.student.myTeam.MyTeamUnit;

public class Fighter extends MyTeamUnit
{
	public void design()
	{
        setFrame(Frame.MEDIUM);
        setModel(Model.PROTOTYPE);
        setStyle(Style.DRAGON);
        add(HeavyMissile.class);
        add(Laser.class);
        add(AthenaMod.class);
	}



}
