package com.ganesh.controller;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ganesh.entity.AccountDetails;
import com.ganesh.repository.AccountRepository;
import com.univocity.parsers.common.record.Record;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;

@RestController
public class Controller {
	
	@Autowired
	private AccountRepository repository;
	
	@PostMapping("/upload")
	public String uploadData(@RequestParam("file")MultipartFile file) throws Exception {
		
		List<AccountDetails> accountList = new ArrayList<>();
		InputStream inputStream = file.getInputStream();
		CsvParserSettings setting = new CsvParserSettings();
		setting.setHeaderExtractionEnabled(true);
		CsvParser parser = new CsvParser(setting);
		List<Record> parseAllRecords = parser.parseAllRecords(inputStream);
		parseAllRecords.forEach(record -> {
			AccountDetails account = new AccountDetails();
			account.setAccountNumber(Integer.parseInt(record.getString("AccountNumber")));
			account.setAccounType(record.getString("AccountType"));
			account.setFirstName(record.getString("FirstName"));
			account.setLastName(record.getString("LastName"));
			account.setAddress(record.getString("Address"));
			account.setEmail(record.getString("Email"));
			account.setZipCode(record.getString("ZipCode"));
			accountList.add(account);
		});
		repository.saveAll(accountList);
		return "Upload Successfully!!";
	}

}
