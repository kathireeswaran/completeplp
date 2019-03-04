package com.cg.oiqgs.dao;

import java.util.List;

import com.cg.oiqgs.exception.InsuranceException;
import com.cg.oiqgs.model.AccountCreation;
import com.cg.oiqgs.model.Policy;
import com.cg.oiqgs.model.PolicyDetails;
import com.cg.oiqgs.model.Report;
import com.cg.oiqgs.model.UserRole;

public interface InsuranceQuotesDao {

	String getValidate(String userName, String password) throws InsuranceException;

	boolean userValidation(String userName) throws InsuranceException;

	int insertProfile(UserRole role) throws InsuranceException;

	long insertAccount(AccountCreation accountCreation) throws InsuranceException;

	boolean accountValidation(long accountNumber) throws InsuranceException;

	List<Policy> getBusinessSegment() throws InsuranceException;

	List<Policy> getPolicyQuestions(String segId) throws InsuranceException;

	long insertPolicy(Policy policy) throws InsuranceException;

	int insertPolicyDetails(PolicyDetails details) throws InsuranceException;

	List<Policy> getPolicyDetails(String userName) throws InsuranceException;

	List<Report> getReport(long accountNumber) throws InsuranceException;

	List<Policy> getPolicyDetails() throws InsuranceException;

	boolean checkInsured(String userName) throws InsuranceException;

}
