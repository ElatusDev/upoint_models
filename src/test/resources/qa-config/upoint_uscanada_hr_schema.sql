CREATE DATABASE IF NOT EXISTS UPOINT_US_CANADA_HR;

USE UPOINT_US_CANADA_HR;

CREATE TABLE IF NOT EXISTS US_CANADA_ADDRESS(
US_CANADA_ADDRESS_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
US_CANADA_ADDRESS_NUMBER VARCHAR(4) NOT NULL,
ADDRESS_STREET VARCHAR(40) NOT NULL,
ADDRESS_POSTAL_CODE VARCHAR(10) NOT NULL,
ADDRESS_CITY VARCHAR(40) NOT NULL,
ADDRESS_STATE VARCHAR(25) NOT NULL,
ADDRESS_COUNTRY VARCHAR(30) NOT NULL);

CREATE TABLE IF NOT EXISTS US_CANADA_NAME(
US_CANADA_NAME_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
FIRST_NAME VARCHAR(20) NOT NULL,
LAST_NAME VARCHAR(20) NOT NULL);

CREATE TABLE IF NOT EXISTS US_CANADA_COMPANY_INFO(
US_CANADA_COMPANY_INFO_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
COMPANY_NAME VARCHAR(150) NOT NULL,
COMPANY_REGISTRATION_ID VARCHAR(13) NOT NULL,
COMPANY_EMAIL VARCHAR(50) NOT NULL,
COMPANY_WEBSITE_URL VARCHAR(35) NOT NULL,
US_CANADA_ADDRESS_ID BIGINT NOT NULL,
FOREIGN KEY (US_CANADA_ADDRESS_ID) REFERENCES US_CANADA_ADDRESS(US_CANADA_ADDRESS_ID)
);

CREATE TABLE IF NOT EXISTS US_CANADA_COMPANY(
US_CANADA_COMPANY_ADDRESS_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
US_CANADA_COMPANY_INFO_ID BIGINT NOT NULL,
FOREIGN KEY (US_CANADA_COMPANY_INFO_ID) REFERENCES US_CANADA_COMPANY_INFO(US_CANADA_COMPANY_INFO_ID)
);

CREATE TABLE IF NOT EXISTS EMPLOYEE_POSITION(
EMPLOYEE_POSITION_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
POSITION_NAME VARCHAR(35) NOT NULL,
SUPER_EMPLOYEE_POSITION_ID BIGINT NOT NULL,
FOREIGN KEY (SUPER_EMPLOYEE_POSITION_ID) REFERENCES EMPLOYEE_POSITION(EMPLOYEE_POSITION_ID)
);

CREATE TABLE IF NOT EXISTS US_CANADA_EMPLOYEE_INFO(
US_CANADA_EMPLOYEE_INFO_ID BIGINT AUTO_INCREMENT PRIMARY KEY, 
US_CANADA_ADDRESS_ID BIGINT NOT NULL,
EMPLOYEE_INFO_CELLPHONE VARCHAR(10) NOT NULL,
EMPLOYEE_INFO_EMERGENCY_CONTACT VARCHAR(10) NOT NULL,
EMPLOYEE_INFO_BIRTHDAY DATE NOT NULL,
USCANADA_NAME_ID BIGINT NOT NULL,
FOREIGN KEY (US_CANADA_ADDRESS_ID) REFERENCES US_CANADA_ADDRESS(US_CANADA_ADDRESS_ID)
);

CREATE TABLE IF NOT EXISTS US_CANADA_EMPLOYEE(
US_CANADA_EMPLOYEE_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
US_CANADA_EMPLOYEE_INFO_ID BIGINT NOT NULL,
EMPLOYEE_POSITION_ID BIGINT NOT NULL,
FOREIGN KEY (US_CANADA_EMPLOYEE_INFO_ID) REFERENCES US_CANADA_EMPLOYEE_INFO(US_CANADA_EMPLOYEE_INFO_ID),
FOREIGN KEY (EMPLOYEE_POSITION_ID) REFERENCES EMPLOYEE_POSITION(EMPLOYEE_POSITION_ID)
);


 


