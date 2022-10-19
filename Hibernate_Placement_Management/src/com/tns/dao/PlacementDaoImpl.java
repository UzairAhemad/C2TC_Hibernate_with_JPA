package com.tns.dao;

import javax.persistence.EntityManager;
import com.tns.entity.Placement;

public class PlacementDaoImpl implements PlacementDao {
	
	private EntityManager entityManager;
	public PlacementDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}
	
	@Override
	public Placement getPlacementById(int placementId) {
		Placement placement = entityManager.find(Placement.class, placementId);
		return placement;
	}

	@Override
	public void addPlacement(Placement placement) {
		entityManager.persist(placement);
		
	}

	@Override
	public void removePlacement(Placement placement) {
		entityManager.remove(placement);
		
	}

	@Override
	public void updatePlacement(Placement placement) {
		entityManager.merge(placement);
		
	}

	@Override
	public void commitTransection() {
		entityManager.getTransaction().commit();
		
	}

	@Override
	public void beginTransection() {
		entityManager.getTransaction().begin();
		
	}

}
