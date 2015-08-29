package au.com.rea.robot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import au.com.rea.domain.Operation;

public class Robot {
	
	private List<String> position = new ArrayList<String>();
	public void input(String inputString){
		if(inputString.length()>10){
			placeRobot(inputString);
		}else{
			operateRobot(inputString);
		}
	}
	
	public void placeRobot(String inputString){
		String[] input = inputString.split(" ");
		if(Operation.PLACE.equals(input[0])){
			this.position = Arrays.asList(input[1]);
		}
	}
	
	public List<String> operateRobot(String operation){
		if(Operation.LEFT.name().equalsIgnoreCase(operation)){
			position = RobotController.left(position);
		}else if(Operation.RIGHT.name().equalsIgnoreCase(operation)){
			position = RobotController.right(position);
		}else if(Operation.MOVE.name().equalsIgnoreCase(operation)){
			position = RobotController.move(position);
		}else if(Operation.REPORT.name().equalsIgnoreCase(operation)){
			position = RobotController.report(position);
		}else if(Operation.PLACE.name().equalsIgnoreCase(operation)){
			position = RobotController.place(position);
		}
		
		return position;
	}
}
