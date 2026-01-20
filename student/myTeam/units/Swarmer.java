package teams.student.myTeam.units;

import components.mod.offense.NyxMod;
import components.mod.offense.CerberusMod;
import components.upgrade.Plating;
import components.upgrade.Shield;
import components.weapon.energy.HeavyLaser;
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

public class Swarmer extends MyTeamUnit
{
    public void design()
    {
        setFrame(Frame.LIGHT);
        setModel(Model.STRIKER);
        setStyle(Style.BOXY);
        add(Autocannon.class);
        add(SpeedBoost.class);

    }



}
