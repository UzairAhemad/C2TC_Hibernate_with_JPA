package com.tns.dao;

import javax.persistence.EntityManager;
import com.tns.entity.Certificate;

public class CertificateDaoImpl implements CertificateDao{
	
	private EntityManager entityManager;
	public CertificateDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}
	
	@Override
	public Certificate getCertificateById(int studentId) {
		Certificate certificate = entityManager.find(Certificate.class, studentId);
		return null;
	}
	
	@Override
	public void addCertificate(Certificate certificate) {
		entityManager.persist(certificate);
		
	}
	
	@Override
	public void removeCertificate(Certificate certificate) {
		entityManager.remove(certificate);
		
	}
	
	@Override
	public void updateCertificate(Certificate certificate) {
		entityManager.merge(certificate);
		
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
