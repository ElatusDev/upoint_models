CREATE DATABASE  IF NOT EXISTS UPOINT_MX_HR;

USE UPOINT_MX_HR;

CREATE TABLE IF NOT EXISTS MEXICAN_ADRESS(
	MEXICAN_ADDRESS_ID INT_AUTO_INCREMENT PRIMARY KEY,
	MEXICAN_ADDRESS VARCHAR(40) NOT NULL,
	MEXICAN_ADDRESS_POSTAL_CODE VARCHAR(10) NOT NULL,
	MEXICAN_ADDRESS_CITY VARCHAR(40) NOT NULL,
	MEXICAN_ADDRESS_STATE VARCHAR(25) NOT NULL,
	MEXICAN_ADDRESS_COUNTRY VARCHAR(30) NOT NULL,
	MEXICAN_ADDRESS_INTERIOR_NUMBER VARCHAR(4) NOT NULL,
	MEXICAN_ADDRESS_EXTERIOR_NUMBER VARCHAR(4) NOT NULL,
	MEXICAN_ADDRESS_NEIGHBORHOOD VARCHAR(50) NOT NULL
	);
	
CREATE TABLE IF NOT EXISTS EMPLOYEE_MEXICAN_NAME(
	MEXICAN_NAME_ID INT_AUTO_INCREMENT PRIMARY KEY,
	MEXICAN_NAME_SECOND_NAME VARCHAR(20) NOT NULL,
	MAXICAN_NAME_SECOND_LAST_NAME VARCHAR(20) NOT NULL
	);
	
	CREATE TABLE IF NOT EXISTS MEXICAN_COMPANY_INFO(
	MEXICAN_COMPANY_INFO_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
	COMPANY_NAME VARCHAR(150) NOT NULL,
	COMPANY_REGISTRATION_ID VARCHAR(13) NOT NULL,
	COMPANY_EMAIL VARCHAR(50) NOT NULL
	COMPANY_WEBSITE_URL VARCHAR(35) NOT NULL,
	MEXICAN_ADDRESS_ID BIGINT,
	FOREING KEY (MEXICAN_ADDRESS_ID) REFERENCES MEXICAN_ADDRESS(MEXICAN_ADDRESS_ID)
	);
	
CREATE TABLE IF NOT EXISTS MEXICAN_COMPANY(
	MEXICAN_COMPANY_ID INT_AUTO_INCREMENT PRIMARY KEY,
	MEXICAN_COMPANY_INFO_ID BIGINT NOT NULL,
	FOREING KEY (MEXICAN_COMPANY_INFO_ID) REFERENCES MEXICAN_COMPANY_INFO(MEXICAN_COMPANY_INFO_ID
	);
	
	CREATE TABLE IF NOT EXISTS EMPLOYEE_POSITION(
	EMPLOYEE_POSITION_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
	POSITION_NAME VARCHAR(35) NOT NULL,
	MEXICAN_COMPANY_ID BIGINT NOT NULL,
	SUPER_EMPLOYEE_POSITION_ID BIGINT,
	FOREING KEY (MEXICAN_COMPANY_ID) REFERENCES MEXICAN_COMPANY(MEXICAN_COMPANY_ID)
	FOREING KEY (SUPER_EMPLOYEE_POSITION_ID) REFERENCES EMPLOYEE_POSITION(EMPLOYEE_POSITION_ID)
	);	
	
	CREATE TABLE IF NOT EXISTS MEXICAN_EMPLOYEE_INFO(
	MEXICAN_EMPLOYEE_INFO_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
	EMPLOYEE_INFO_CELLPHONE VARCHAR(10) NOT NULL,
	EMPLOYEE_INFO_EMERGENCY_CONTACT VARCHAR(10) NOT NULL,
	EMPLOYEE_INFO_BIRTHDAY DATE NOT NULL,
	MEXICAN_ADDRESS_ID BIGINT NOT NULL,
	FOREING KEY (MEXICAN_ADDRESS_ID) REFERENCES MEXICAN_ADDRESS(MEXICAN_ADDRESS_ID)
	);

CREATE TABLE IF NOT EXISTS MEXICAN_EMPLOYEE(
	MEXICAN_EMPLOYEE_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
	MEXICAN_NAME_ID INT NOT NULL,
	MEXICAN_EMPLOYEE_INFO_ID BIGINT NOT NULL,
	EMPLOYEE_POSITION_ID BIGINT NOT NULL,
	MEXICAN_COMPANY_ID BIGINT NOT NULL,
	FOREING KEY (EMPLOYEE_POSITION_ID) REFERENCES EMPLOYEE POSITION(EMPLOYEE_POSITION_ID)
	FOREING KEY (MEXICAN_COMPANY_ID) REFERENCES MEXICAN COMPANY(MEXICAN_COMPANY_ID)
	FOREING KEY (MEXICAN_NAME_ID) REFERENCES MEXICAN_NAME(MEXICAN_NAME_ID)
	FOREING KEY (MEXICAN_EMPLOYEE_INFO_ID) REFERENCES MEXICAN_EMPLOYEE_INFO(MEXICAN_EMPLOYEE_INFO_ID)
	);
	



	
	
	
	
	
	
	
	