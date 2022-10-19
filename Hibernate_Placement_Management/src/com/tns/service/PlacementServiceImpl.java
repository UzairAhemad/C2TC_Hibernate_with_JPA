package com.tns.service;

import com.tns.dao.PlacementDao;
import com.tns.dao.PlacementDaoImpl;
import com.tns.entity.Placement;

public class PlacementServiceImpl implements PlacementService {

	private PlacementDao dao;
	public PlacementServiceImpl() {
		dao = new PlacementDaoImpl();
	}
	
	@Override
	public Placement findPlacementById(int placementId) {
		Placement placement = dao.getPlacementById(placementId);
		return placement;
	}

	@Override
	public void addPlacement(Placement placement) {
		dao.beginTransection();
		dao.addPlacement(placement);
		dao.commitTransection();
		
	}

	@Override
	public void updatePlacement(Placement placement) {
		dao.beginTransection();
		dao.updatePlacement(placement);
		dao.commitTransection();
		
	}

	@Override
	public void removePlacement(Placement placement) {
		dao.beginTransection();
		dao.removePlacement(placement);
		dao.commitTransection();
		
	}

}
