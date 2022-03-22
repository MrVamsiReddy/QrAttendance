package com.details.Service;

import java.util.List;
import java.util.Optional;

import com.details.Entity.attendance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.details.Repository.RegisterRepository;

@Service
public class RegserviceImpl implements Regservice {
	@Autowired
	private RegisterRepository repo;

	@Override
	public void saveData(attendance att) {
		repo.save(att);
	}

	@Override
	public List <attendance> ViewData() {
		List<attendance> Table_Data = repo.findAll();
		return Table_Data;
	}

	@Override
	public void Delete(long id) {
		repo.deleteById(id);
	}

	@Override
	public attendance markAtte(long id) {
		Optional<attendance> data = repo.findById(id);
		attendance tabledata = data.get();
		return tabledata;

	}

	@Override
	public void saveUpdate(attendance att) {
		repo.save(att);
	}

	@Override
	public List<attendance> attend() {
		List<attendance> Table_Data = repo.findAll();
		return Table_Data;
	}


}
