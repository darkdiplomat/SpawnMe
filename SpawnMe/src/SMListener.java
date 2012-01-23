
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

public class SMListener extends PluginListener{
	private SMData SMD;
	private SpawnMe SM;
	private final boolean r = false;
	public SMListener(SpawnMe SM){
		this.SM = SM;
		SMD = new SMData(SM);
	}
	
	public boolean onBlockRightClick(Player player, Block blockClicked, Item itemInHand){
		if(blockClicked.getType() == 52){
			MobSpawner MS = (MobSpawner)player.getWorld().getComplexBlock(blockClicked);
			int type = 0;
			try{
				type = itemInHand.getType().getId();
			}catch(NullPointerException NPE){
				SM.log.warning("[SpawnMe] FUCK YOU Shadow386 and/or l4mRh4X0r! (null Item)");
				return r;
			}
			switch(type){
			case 35:
				if(itemInHand.getDamage() != 0){ return r; }
				if((SMD.UP && !player.canUseCommand("/spawnme")) || (SMD.UEP && (!player.canUseCommand("/spawnmesheep")) && !player.canUseCommand("/spawnmeall"))){ return r;}
				if(!MS.getSpawn().equals("Sheep") && (SMD.Sheep)){ MS.setSpawn("Sheep"); player.notify("Spawner set to Sheep"); break; }
				else{ return r; }
			case 40:
				if((SMD.UP && !player.canUseCommand("/spawnme")) || (SMD.UEP && (!player.canUseCommand("/spawnmemooshroom")) && !player.canUseCommand("/spawnmeall"))){ return r;}
				if(!MS.getSpawn().equals("MushroomCow") && (SMD.Mooshroom)){ MS.setSpawn("MushroomCow"); player.notify("Spawner set to Mooshroom"); break; }
				else{ return r; }
			case 262:
				if((SMD.UP && !player.canUseCommand("/spawnme")) || (SMD.UEP && (!player.canUseCommand("/spawnmeskeleton")) && !player.canUseCommand("/spawnmeall"))){ return r;}
				if(!MS.getSpawn().equals("Skeleton") && (SMD.Skeleton)){ MS.setSpawn("Skeleton"); player.notify("Spawner set to Skeleton"); break; }
				else{ return r; }
			case 289:
				if((SMD.UP && !player.canUseCommand("/spawnme")) || (SMD.UEP && (!player.canUseCommand("/spawnmecreeper")) && !player.canUseCommand("/spawnmeall"))){ return r;}
				if(!MS.getSpawn().equals("Creeper") && (SMD.Creeper)){ MS.setSpawn("Creeper"); player.notify("Spawner set to Creeper"); break; }
				else{ return r; }
			case 319:
				if((SMD.UP && !player.canUseCommand("/spawnme")) || (SMD.UEP && (!player.canUseCommand("/spawnmepig")) && !player.canUseCommand("/spawnmeall"))){ return r;}
				if(!MS.getSpawn().equals("Pig") && (SMD.Pig)){ MS.setSpawn("Pig"); player.notify("Spawner set to Pig"); break; }
				else{ return r; }
			case 320:
				if((SMD.UP && !player.canUseCommand("/spawnme")) || (SMD.UEP && (!player.canUseCommand("/spawnmepigzombie")) && !player.canUseCommand("/spawnmeall"))){ return r;}
				if(!MS.getSpawn().equals("PigZombie") && (SMD.PigZombie)){ MS.setSpawn("PigZombie"); player.notify("Spawner set to PigZombie"); break; }
				else{ return r; }
			case 336:
				if((SMD.UP && !player.canUseCommand("/spawnme")) || (SMD.UEP && (!player.canUseCommand("/spawnmevillager")) && !player.canUseCommand("/spawnmeall"))){ return r;}
				if(!MS.getSpawn().equals("Villager") && (SMD.Villager)){ MS.setSpawn("Villager"); player.notify("Spawner set to Villager"); break; }
				else{ return r; }
			case 341:
				if((SMD.UP && !player.canUseCommand("/spawnme")) || (SMD.UEP && (!player.canUseCommand("/spawnmeslime")) && !player.canUseCommand("/spawnmeall"))){ return r;}
				if(!MS.getSpawn().equals("Slime") && (SMD.Slime)){ MS.setSpawn("Slime"); player.notify("Spawner set to Slime"); break; }
				else{ return r; }
			case 349:
				if((SMD.UP && !player.canUseCommand("/spawnme")) || (SMD.UEP && (!player.canUseCommand("/spawnmesilverfish")) && !player.canUseCommand("/spawnmeall"))){ return r;}
				if(!MS.getSpawn().equals("Silverfish") && (SMD.Silverfish)){ MS.setSpawn("Silverfish"); player.notify("Spawner set to Silverfish"); break; }
				else{ return r; }
			case 351:
				if(itemInHand.getDamage() != 0){ return true; }
				if((SMD.UP && !player.canUseCommand("/spawnme")) || (SMD.UEP && (!player.canUseCommand("/spawnmesquid")) && !player.canUseCommand("/spawnmeall"))){ return r;}
				if(!MS.getSpawn().equals("Squid") && (SMD.Squid)){ MS.setSpawn("Squid"); player.notify("Spawner set to Squid"); break; }
				else{ return r; }
			case 352:
				if((SMD.UP && !player.canUseCommand("/spawnme")) || (SMD.UEP && (!player.canUseCommand("/spawnmewolf")) && !player.canUseCommand("/spawnmeall"))){ return r;}
				if(!MS.getSpawn().equals("Wolf") && (SMD.Wolf)){ MS.setSpawn("Wolf"); player.notify("Spawner set to Wolf"); break; }
				else{ return r; }
			case 363:
				if((SMD.UP && !player.canUseCommand("/spawnme")) || (SMD.UEP && (!player.canUseCommand("/spawnmecow")) && !player.canUseCommand("/spawnmeall"))){ return r;}
				if(!MS.getSpawn().equals("Cow") && (SMD.Cow)){ MS.setSpawn("Cow"); player.notify("Spawner set to Cow"); break; }
				else{ return r; }
			case 365:
				if((SMD.UP && !player.canUseCommand("/spawnme")) || (SMD.UEP && (!player.canUseCommand("/spawnmechicken")) && !player.canUseCommand("/spawnmeall"))){ return r;}
				if(!MS.getSpawn().equals("Chicken") && (SMD.Chicken)){ MS.setSpawn("Chicken"); player.notify("Spawner set to Chicken"); break; }
				else{ return r; }
			case 367:
				if((SMD.UP && !player.canUseCommand("/spawnme")) || (SMD.UEP && (!player.canUseCommand("/spawnmezombie")) && !player.canUseCommand("/spawnmeall"))){ return r;}
				if(!MS.getSpawn().equals("Zombie") && (SMD.Zombie)){ MS.setSpawn("Zombie"); player.notify("Spawner set to Zombie"); break; }
				else{ return r; }
			case 368:
				if((SMD.UP && !player.canUseCommand("/spawnme")) || (SMD.UEP && (!player.canUseCommand("/spawnmeenderman")) && !player.canUseCommand("/spawnmeall"))){ return r;}
				if(!MS.getSpawn().equals("Enderman") && (SMD.Enderman)){ MS.setSpawn("Enderman"); player.notify("Spawner set to Enderman"); break; }
				else{ return true; }
			case 370:
				if((SMD.UP && !player.canUseCommand("/spawnme")) || (SMD.UEP && (!player.canUseCommand("/spawnmeghast")) && !player.canUseCommand("/spawnmeall"))){ return r;}
				if(!MS.getSpawn().equals("Ghast") && (SMD.Ghast)){ MS.setSpawn("Ghast"); player.notify("Spawner set to Ghast"); break; }
				else{ return r; }
			/*case 372:  BROKEN!
				if((SMD.UP && !player.canUseCommand("/spawnme")) || (SMD.UEP && (!player.canUseCommand("/spawnmegiant")) && !player.canUseCommand("/spawnmeall"))){ return r;}
				if(!MS.getSpawn().equals("Giant") && (SMD.Giant)){ MS.setSpawn("Giant"); player.notify("Spawner set to Giant"); break; }
				else{ return r; } */
			case 375:
				if((SMD.UP && !player.canUseCommand("/spawnme")) || (SMD.UEP && (!player.canUseCommand("/spawnmespider")) && !player.canUseCommand("/spawnmeall"))){ return r;}
				if(!MS.getSpawn().equals("Spider") && (SMD.Spider)){ MS.setSpawn("Spider"); player.notify("Spawner set to Spider"); break; }
				else{ return r; }
			case 376:
				if((SMD.UP && !player.canUseCommand("/spawnme")) || (SMD.UEP && (!player.canUseCommand("/spawnmecavespider")) && !player.canUseCommand("/spawnmeall"))){ return r;}
				if(!MS.getSpawn().equals("CaveSpider") && (SMD.CaveSpider)){ MS.setSpawn("CaveSpider"); player.notify("Spawner set to CaveSpider"); break; }
				else{ return r; }
			case 378:
				if((SMD.UP && !player.canUseCommand("/spawnme")) || (SMD.UEP && (!player.canUseCommand("/spawnmemagmacube")) && !player.canUseCommand("/spawnmeall"))){ return r;}
				if(!MS.getSpawn().equals("LavaSlime") && (SMD.MagmaCube)){ MS.setSpawn("LavaSlime"); player.notify("Spawner set to MagmaCube"); break; }
				else{ return r; }
			default:
				return r;
			}
			player.getInventory().removeItem(itemInHand.getType().getId(), 1);
			player.getInventory().update();
		}
		return r;
	}
	
	public boolean onItemUse(Player player, Block blockPlaced, Block blockClicked, Item itemInHand){
		if(blockClicked != null){
			if(blockClicked.getType() == 52){
				return !r;
			}
		}
		return r;
	}
	
	public boolean onBlockPlace(Player player, Block blockPlaced, Block blockClicked, Item itemInHand){
		if(blockClicked != null && blockClicked.getType() == 52){
			if(itemInHand != null && (itemInHand.getItemId() == 40 || (itemInHand.getItemId() == 35 && itemInHand.getDamage() == 0))){
				return !r;
			}
		}
		return r;
	}
}
