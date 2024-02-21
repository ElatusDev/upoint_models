CREATE DATABASE  IF NOT EXISTS UPOINT_MX_HR;
USE UPOINT_MX_HR;

CREATE TABLE IF NOT EXISTS MEXICAN_ADDRESS(
MEXICAN_ADDRESS_ID INT AUTO_INCREMENT PRIMARY KEY,
ADDRESS_STREET VARCHAR(40) NOT NULL,
ADDRESS_POSTAL_CODE VARCHAR(10) NOT NULL,
ADDRESS_CITY VARCHAR(40) NOT NULL,
ADDRESS_STATE VARCHAR(25) NOT NULL,
ADDRESS_COUNTRY VARCHAR(30) NOT NULL,
MEXICAN_ADDRESS_INTERIOR_NUMBER VARCHAR(4) NOT NULL,
MEXICAN_ADDRESS_EXTERIOR_NUMBER VARCHAR(4) NOT NULL,
MEXICAN_ADDRESS_NEIGHBORHOOD VARCHAR(50) NOT NULL);

CREATE TABLE IF NOT EXISTS EMPOLYEE_MEXICAN_NAME(
MEXICAN_NAME_ID INT AUTO_INCREMENT PRIMARY KEY,
FIRST_NAME VARCHAR(20) NOT NULL,
LAST_NAME VARCHAR(20) NOT NULL,
MEXICAN_NAME_SECOND_NAME VARCHAR(20) NULL,
MEXICAN_NAME_SECOND_LAST_NAME VARCHAR(20) NOT NULL);

CREATE TABLE IF NOT EXISTS MEXICAN_COMPANY_INFO(
MEXICAN_COMPANY_INFO_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
COMPANY_NAME VARCHAR(150) NOT NULL,
COMPANY_REGISTRATION_ID VARCHAR(13) NOT NULL,
COMPANY_EMAIL VARCHAR(50) NOT NULL,
COMPANY_WEBSITE_URL VARCHAR(35),
MEXICAN_ADDRESS_ID BIGINT,
FOREIGN KEY(MEXICAN_ADDRESS_ID) REFERENCES MEXICAN_ADDRESS(MEXICAN_ADDRESS_ID);

CREATE TABLE IF NOT EXISTS MEXICAN_COMPANY(
MEXICAN_COMPANY_ID INT AUTO_INCREMENT PRIMARY KEY,
MEXICAN_COMPANY_INFO_ID BIGINT NOT NULL,
FOREIGN KEY (MEXICAN_COMPANY_INFO_ID) REFERENCES MEXICAN_COMPANY_INFO(MEXICAN_COMPANY_INFO_ID);

CREATE TABLE IF NOT EXISTS MEXICAN_EMPLOYEE_INFO(
MEXICAN_EMPLOYEE_INFO_ID INT AUTO_INCREMENT PRIMARY KEY,
EMPLOYEE_INFO_CELLPHONE VARCHAR(10) NOT NULL,
EMPLOYEE_INFO_EMERGENCY_CONTACT VARCHAR(10), NOT NULL,
EMPLOYE_INFO_BIRTHDAY DATE NOT NULL,
MEXICAN_ADDRESS_ID BIGINT,
FOREIGN KEY(MEXICAN_ADDRESS_ID) REFERENCES MEXICAN_ADDRESS(MEXICAN_ADDRESS_ID);

CREATE TABLE IF NOT EXISTS EMPLOYEE_POSITION(
EMPLOYEE_POSITION_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
POSITION_NAME VARCHAR(35) NOT NULL,
SUPER_EMPLOYEE_POSITION_ID BIGINT,
MEXICAN_COMPANY_ID BIGINT,
FOREIGN KEY(SUPER_EMPLOYEE_POSITION_ID) REFERENCES EMPLOYEE_POSITION(POSITION_ID);
FOREIGN KEY(MEXICAN_COMPANY_ID) REFERENCES MEXICAN_COMPANY(MEXICAN_COMPANY_ID);

CREATE TABLE IF NOT EXISTS MEXICAN_EMPLOYEE(
MEXICAN_EMPLOYEE_ID BIG INT AUTO_INCREMENT PRIMARY KEY,
MEXICAN_EMPLOYEE_INFO_ID BIGINT NOT NULL,
EMPLOYEE_POSITION_ID BIGINT,
FOREIGN KEY(MEXICAN_EMPLOYEE_INFO_ID) REFERENCES MEXICAN_EMPLOYEE_INFO(MEXICAN_EMPLOYEE_INFO_ID);
FOREIGN KEY(EMPLOYEE_POSITION_ID) REFERENCES EMPLOYEE_POSITION(EMPLOYEE_POSITION_ID);



