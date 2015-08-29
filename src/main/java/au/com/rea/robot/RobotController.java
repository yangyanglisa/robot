package au.com.rea.robot;

import java.util.List;


import au.com.rea.domain.Direction;
import com.google.common.annotations.VisibleForTesting;

public final class RobotController {
	
	private RobotController() {
	}
	
	public static List<String> place(List<String> position){
		return position;
	}
	
	public static List<String> move(List<String> position){
		if(Direction.NORTH.name().equalsIgnoreCase((position.get(2)))){
			return addToY(position);
		}else if(Direction.SOUTH.name().equalsIgnoreCase(position.get(2))){
			return subToY(position);
		}else if(Direction.WEST.name().equalsIgnoreCase(position.get(2))){
			return subToX(position);
		}else if(Direction.EAST.name().equalsIgnoreCase(position.get(2))){
			return addToX(position);
		}
		return null;
	}
	
	public static List<String> left(List<String> position){
		if(Direction.NORTH.name().equalsIgnoreCase(position.get(2))){
			return subToX(position);
		}else if(Direction.SOUTH.name().equalsIgnoreCase(position.get(2))){
			return addToX(position);
		}else if(Direction.WEST.name().equalsIgnoreCase(position.get(2))){
			return subToY(position);
		}else if(Direction.EAST.name().equalsIgnoreCase(position.get(2))){
			return addToY(position);
		}
		return null;
	}
	
	public static List<String> right(List<String> position){
		if(Direction.NORTH.name().equalsIgnoreCase(position.get(2))){
			return addToX(position);}
		else if(Direction.SOUTH.name().equalsIgnoreCase(position.get(2))){
			return subToX(position);
		}else if(Direction.WEST.name().equalsIgnoreCase(position.get(2))){
			return addToY(position);
		}else if(Direction.EAST.name().equalsIgnoreCase(position.get(2))){
			return subToY(position);
		}
		return null;
	}
	
	public static List<String> report(List<String> position){
		//log
		return null;
	}
	
	@VisibleForTesting
	protected static List<String> addToX(List<String> position){
		int x = Integer.parseInt(position.get(0)) + 1;
		x = setConstrain(x);
		position.set(0, Integer.toString(x));
		return position;
	}
	
	@VisibleForTesting
	protected static List<String> addToY(List<String> position){
		int y = Integer.parseInt(position.get(1)) + 1;
		y = setConstrain(y);
		position.set(1, Integer.toString(y));
		return position;
	}
	
	@VisibleForTesting
	protected static List<String> subToX(List<String> position){
		int x = Integer.parseInt(position.get(0)) - 1;
		x = setConstrain(x);
		position.set(0, Integer.toString(x));
		return position;
	}
	
	@VisibleForTesting
	protected static List<String> subToY(List<String> position){
		int y = Integer.parseInt(position.get(1)) - 1;
		y = setConstrain(y);
		position.set(1, Integer.toString(y));
		return position;
	}
	
	private static int setConstrain(int point){
		if(point>5){
		    point=5;
		}else if(point<0){
			point=0;
		}
		return point;
	}

}
