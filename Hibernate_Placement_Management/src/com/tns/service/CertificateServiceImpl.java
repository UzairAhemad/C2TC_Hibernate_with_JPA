package com.tns.service;

import com.tns.dao.CertificateDao;
import com.tns.dao.CertificateDaoImpl;
import com.tns.entity.Certificate;

public class CertificateServiceImpl implements CertificateService {
	
	private CertificateDao dao;
	public CertificateServiceImpl() {
		dao = new CertificateDaoImpl();
	}
	
	@Override
	public Certificate findCertificateById(int studentId) {
		Certificate certificate = dao.getCertificateById(studentId);
		return certificate;
	}

	@Override
	public void addCertificate(Certificate certificate) {
		dao.beginTransection();
		dao.addCertificate(certificate);
		dao.commitTransection();
	}

	@Override
	public void updateCertificate(Certificate certificate) {
		dao.beginTransection();
		dao.updateCertificate(certificate);
		dao.commitTransection();
		
	}

	@Override
	public void removeCertificate(Certificate certificate) {
		dao.beginTransection();
		dao.removeCertificate(certificate);
		dao.commitTransection();
		
	}

}
