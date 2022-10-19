package com.tns.service;

import com.tns.entity.Placement;

public interface PlacementService {
	
		public abstract Placement findPlacementById(int placementId);
		public abstract void addPlacement(Placement placement);
		public abstract void updatePlacement(Placement placement);
		public abstract void removePlacement(Placement placement);
		
}
