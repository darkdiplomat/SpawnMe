import java.util.logging.Logger;

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

public class SpawnMe extends Plugin{
	  SMListener SML;
	  Logger log = Logger.getLogger("Minecraft");;
	  private String name = "SpawnMe";
	  private String version = "1.0";

	  public void enable() {
		  log.info(this.name + " " + this.version + " enabled");
	  }

	  public void disable(){
		  log.info(this.name + " " + this.version + " disabled");
	  }

	  public void initialize(){
		  SML = new SMListener(this);
		  etc.getLoader().addListener(PluginLoader.Hook.BLOCK_RIGHTCLICKED, SML, this, PluginListener.Priority.LOW);
		  etc.getLoader().addListener(PluginLoader.Hook.BLOCK_PLACE, SML, this, PluginListener.Priority.LOW);
		  etc.getLoader().addListener(PluginLoader.Hook.ITEM_USE, SML, this, PluginListener.Priority.LOW);
		  log.info(this.name + " " + this.version + " initialized");
	  }
}