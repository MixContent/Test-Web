package a.b.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import a.b.dao.Computerdao;
import a.b.model.Computer;

@Service
@Transactional
public class SystemService {
	@Autowired
	private Computerdao dao;

	public void store(Computer computer) {
		dao.save(computer);
	}

}
