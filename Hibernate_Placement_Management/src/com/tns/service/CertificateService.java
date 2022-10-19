package com.tns.service;

import com.tns.entity.Certificate;

public interface CertificateService {
	
	public abstract Certificate findCertificateById(int studentId);
	public abstract void addCertificate(Certificate certificate);
	public abstract void updateCertificate(Certificate certificate);
	public abstract void removeCertificate(Certificate certificate);
}
