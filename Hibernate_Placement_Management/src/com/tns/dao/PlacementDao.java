package com.tns.dao;

import com.tns.entity.Placement;

public interface PlacementDao {
		
			// Find Student
			public abstract Placement getPlacementById(int placementId);
							
			// Add Student
			public abstract void addPlacement(Placement placement);
							
							
			//Delete Student
			public abstract void removePlacement(Placement placement);
							
			//Update Student
			public abstract void updatePlacement(Placement placement);
			
			public abstract void commitTransection();
			public abstract void beginTransection();
}
