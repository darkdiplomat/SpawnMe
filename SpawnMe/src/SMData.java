import java.io.File;

/**
* SpawnMe v1.x
* Copyright (C) 2012 Visual Illusions Entertainment
* @author darkdiplomat <darkdiplomat@hotmail.com>
* 
* This file is part of SpawnMe
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

public class SMData {
	PropertiesFile SMProps;
	SpawnMe SM;
	boolean firstRun = false; //Part of Props creation
	boolean UP = false; //Use Normal Permissions
	boolean UEP = false; //Use Extended Permissions
	
	boolean Pig = true; //Allow Pig
	boolean Chicken = true; //Allow Chicken
	boolean Cow = true; //Allow Cow
	boolean Sheep = true; //Allow Sheep
	boolean Wolf = true; //Allow Wolf
	boolean Squid = false; //Allow Squid
	boolean Mooshroom = false; //Allow Mooshroom
	boolean PigZombie = false; //Allow PigZombie
	boolean CaveSpider = false; //Allow CaveSpider
	boolean Creeper = false; //Allow Creeper
	boolean MagmaCube = false; //Allow MagmaCube
	boolean Skeleton = false; //Allow Skeleton
	boolean Slime = false; //Allow Slime
	boolean Spider = false; //Allow Spider
	boolean Zombie = false; //Allow Zombie
	boolean Silverfish = false; //Allow Silverfish
	boolean Villager = false; //Allow Villager
	boolean Enderman = false; //Allow Enderman
	//boolean Giant = false; //Allow Giant  -- Broken...
	boolean Ghast = false; //Allow Ghast
	
	public SMData(SpawnMe SM){
		this.SM = SM;
		load();
	}
	
	private void load(){
		File file = new File("plugins/config/SpawnMe/SpawnMeProps.ini");
		if(!file.exists()){
			file = new File("plugins/config/SpawnMe");
			file.mkdirs();
			firstRun = true;
		}
		SMProps = new PropertiesFile("plugins/config/SpawnMe/SpawnMeProps.ini");
		
		UEP = LoadBooleanCheck(UEP, "Use-ExtendedPermissions");
		if(!UEP){
			UP = LoadBooleanCheck(UP, "Use-NormalPermissions");
		}
		
		Pig = LoadBooleanCheck(Pig, "Pig");
		Chicken = LoadBooleanCheck(Chicken, "Chicken");
		Cow = LoadBooleanCheck(Cow, "Cow");
		Sheep = LoadBooleanCheck(Sheep, "Sheep");
		Wolf = LoadBooleanCheck(Wolf, "Wolf");
		Squid = LoadBooleanCheck(Squid, "Squid");
		Mooshroom = LoadBooleanCheck(Mooshroom, "Mooshroom");
		PigZombie = LoadBooleanCheck(PigZombie, "PigZombie");
		CaveSpider = LoadBooleanCheck(CaveSpider, "CaveSpider");
		Creeper = LoadBooleanCheck(Creeper, "Creeper");
		MagmaCube = LoadBooleanCheck(MagmaCube, "MagmaCube");
		Skeleton = LoadBooleanCheck(Skeleton, "Skeleton");
		Slime = LoadBooleanCheck(Slime, "Slime");
		Spider = LoadBooleanCheck(Spider, "Spider");
		Zombie = LoadBooleanCheck(Zombie, "Zombie");
		Silverfish = LoadBooleanCheck(Silverfish, "Silverfish");
		Villager = LoadBooleanCheck(Villager, "Village");
		Enderman = LoadBooleanCheck(Enderman, "Enderman");
		//Giant = LoadBooleanCheck(Giant, "Giant");
		Ghast = LoadBooleanCheck(Ghast, "Ghast");
	}
	
	private boolean LoadBooleanCheck(boolean defaultvalue, String Property){
		boolean value = false;
		if(SMProps.containsKey(Property)){
			value = SMProps.getBoolean(Property);
		}
		else{
			if(!firstRun){
				SM.log.warning("[SpawnMe] Value: "+Property+" not found! Using default of "+String.valueOf(defaultvalue));
				value = defaultvalue;
			}
			SMProps.setBoolean(Property, defaultvalue);
		}
		return value;
	}
}
