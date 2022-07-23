package org.springframework.boot.springbootstarterparent;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.springbootstarterparent.Entities.Prisoner;
import org.springframework.boot.springbootstarterparent.Repo.PrisonerRepo;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TodoApplicationTests {

	private static final Logger LOG = LoggerFactory.getLogger(Start.class);



	@Autowired
	PrisonerRepo prisonerRepo;

	@Test
	void createPrisoner() {



		Prisoner prisoner = new Prisoner();
		prisoner.setName("Misha and Liza");
		prisoner.setCriminalRecord("123");
		prisoner.setAge(10);
		prisoner.setArrival("123");
		prisoner.setCellNumber(123);

		prisonerRepo.save(prisoner);
	}

}
