package au.com.rea.robot;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class RobotControllerTest {
	
	@Test
	public void shouldReturnCorrectAddToX(){
		List<String> position = Arrays.asList("1", "1", "North");
		List<String> newPosition = RobotController.addToX(position);
		assertEquals(Arrays.asList("2", "1", "North"), newPosition);
	}
	
	@Test
	public void shouldReturnCorrectSubToX(){
		List<String> position = Arrays.asList("1", "1", "North");
		List<String> newPosition = RobotController.subToX(position);
		assertEquals(Arrays.asList("0", "1", "North"), newPosition);
	}
	
	@Test
	public void shouldReturnCorrectSubToY(){
		List<String> position = Arrays.asList("1", "1", "North");
		List<String> newPosition = RobotController.subToY(position);
		assertEquals(Arrays.asList("1", "0", "North"), newPosition);
	}
	
	@Test
	public void shouldReturnCorrectAddToY(){
		List<String> position = Arrays.asList("1", "1", "North");
		List<String> newPosition = RobotController.addToY(position);
		assertEquals(Arrays.asList("1", "2", "North"), newPosition);
	}
	
	@Test
	public void shouldMove(){
		List<String> positionNorth = Arrays.asList("1", "1", "North");
		List<String> newPositionNorth = RobotController.move(positionNorth);
		assertEquals(Arrays.asList("1", "2", "North"), newPositionNorth);
		
		List<String> positionSouth = Arrays.asList("1", "1", "South");
		List<String> newPositionSouth = RobotController.move(positionSouth);
		assertEquals(Arrays.asList("1", "0", "South"), newPositionSouth);
		
		List<String> positionEast = Arrays.asList("1", "1", "East");
		List<String> newPositionEast = RobotController.move(positionEast);
		assertEquals(Arrays.asList("2", "1", "East"), newPositionEast);
		
		List<String> positionWest = Arrays.asList("1", "1", "West");
		List<String> newPositionWest = RobotController.move(positionWest);
		assertEquals(Arrays.asList("0", "1", "West"), newPositionWest);
	}
	
	@Test
	public void shouldLeft(){
		List<String> positionNorth = Arrays.asList("1", "1", "North");
		List<String> newPositionNorth = RobotController.left(positionNorth);
		assertEquals(Arrays.asList("0", "1", "North"), newPositionNorth);
		
		List<String> positionSouth = Arrays.asList("1", "1", "South");
		List<String> newPositionSouth = RobotController.left(positionSouth);
		assertEquals(Arrays.asList("2", "1", "South"), newPositionSouth);
		
		List<String> positionEast = Arrays.asList("1", "1", "East");
		List<String> newPositionEast = RobotController.left(positionEast);
		assertEquals(Arrays.asList("1", "2", "East"), newPositionEast);
		
		List<String> positionWest = Arrays.asList("1", "1", "West");
		List<String> newPositionWest = RobotController.left(positionWest);
		assertEquals(Arrays.asList("1", "0", "West"), newPositionWest);
	}
	
	@Test
	public void shouldRight(){
		List<String> positionNorth = Arrays.asList("1", "1", "North");
		List<String> newPositionNorth = RobotController.right(positionNorth);
		assertEquals(Arrays.asList("2", "1", "North"), newPositionNorth);
		
		List<String> positionSouth = Arrays.asList("1", "1", "South");
		List<String> newPositionSouth = RobotController.right(positionSouth);
		assertEquals(Arrays.asList("0", "1", "South"), newPositionSouth);
		
		List<String> positionEast = Arrays.asList("1", "1", "East");
		List<String> newPositionEast = RobotController.right(positionEast);
		assertEquals(Arrays.asList("1", "0", "East"), newPositionEast);
		
		List<String> positionWest = Arrays.asList("1", "1", "West");
		List<String> newPositionWest = RobotController.right(positionWest);
		assertEquals(Arrays.asList("1", "2", "West"), newPositionWest);
	}

}
