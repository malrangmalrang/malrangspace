package egovframework.sample.service.impl;

import egovframework.sample.service.SampleDAO;
import egovframework.sample.service.SampleService;

public class SampleServiceImpl implements SampleService {
	private SampleDAO sampleDAO;
	private String version;

	public void setSampleDAO(SampleDAO sampleDAO) {
		System.out.println("---> setSampleDAO() 호출");
		this.sampleDAO = sampleDAO;
	}

	public void setVersion(String version) {
		System.out.println("---> setVersion() 호출");
		this.version = version;
	}

	public void insertSample() throws Exception {
		sampleDAO.insertSample();
	}
	
	public void updateSample() throws Exception {
		sampleDAO.updateSample();
	}
	
	public void deleteSample() throws Exception {
		sampleDAO.deleteSample();
	}
	
	public void selectSample() throws Exception {
		sampleDAO.selectSample();
	}
	
	public void selectSampleList() throws Exception {
		sampleDAO.selectSampleList();
	}
}
