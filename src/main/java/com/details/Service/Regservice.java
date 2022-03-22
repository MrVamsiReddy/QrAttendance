package com.details.Service;

import com.details.Entity.attendance;

import java.util.List;

public interface Regservice {

	void saveData(attendance att);

	List<attendance> ViewData();

	void Delete(long id);

	attendance markAtte(long id);

	void saveUpdate(attendance att);

	List<attendance> attend();
}
