package teams.student.myTeam.units;

import components.mod.utility.SisyphusMod;
import components.upgrade.Plating;
import components.upgrade.Shield;
import components.weapon.kinetic.Autocannon;
import components.weapon.utility.*;
import objects.entity.unit.Frame;
import objects.entity.unit.Model;
import objects.entity.unit.Style;
import teams.student.myTeam.MyTeam;
import teams.student.myTeam.MyTeamUnit;

public class Grappler extends MyTeamUnit{




        public void design()
        {
            setFrame(Frame.HEAVY);
            setModel(Model.BASTION);
            setStyle(Style.ROCKET);
            add(ElectromagneticPulse.class);
            add(Shield.class);
            add(SisyphusMod.class);

        }



    }


