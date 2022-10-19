package com.tns.dao;

import com.tns.entity.Certificate;

public interface CertificateDao {
	
		// Find Student
		public abstract Certificate getCertificateById(int studentId);
						
		// Add Student
		public abstract void addCertificate(Certificate certificate);
						
						
		//Delete Student
		public abstract void removeCertificate(Certificate certificate);
						
		//Update Student
		public abstract void updateCertificate(Certificate certificate);
		
		public abstract void commitTransection();
		public abstract void beginTransection();
}
