DROP DATABASE IF EXISTS pharmacy;

CREATE DATABASE pharmacy;
USE pharmacy;

CREATE TABLE country(
    codecountry VARCHAR(5),
    namecountry VARCHAR(50),
    CONSTRAINT pk_idcountry PRIMARY KEY (codecountry)
);

CREATE TABLE region(
    codereg VARCHAR(5),
    namereg VARCHAR(50),
    codecountry VARCHAR(5),
    CONSTRAINT pk_idreg PRIMARY KEY (codereg),
    CONSTRAINT fk_idcountry FOREIGN KEY (codecountry) REFERENCES country(codecountry)
);

CREATE TABLE city(
    codecity VARCHAR(5),
    namecity VARCHAR(50),
    codereg VARCHAR(5),
    CONSTRAINT pk_idcity PRIMARY KEY (codecity),
    CONSTRAINT fk_idreg FOREIGN KEY (codereg) REFERENCES region(codereg)
);

CREATE TABLE modeadministration(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE,
    Descripcionmode VARCHAR(60),
    CONSTRAINT pk_idmodeadministration PRIMARY KEY (id)
);

CREATE TABLE activeprinciple(
    idap INT UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE,
    nameap VARCHAR(60),
    CONSTRAINT pk_idactiveprinciple PRIMARY KEY (idap)
);

CREATE TABLE unitmeasurement(
    idum INT UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE,
    nameum VARCHAR(50),
    CONSTRAINT pk_idunitmeasurement PRIMARY KEY (idum)
);

CREATE TABLE customer(
    idcustomer VARCHAR(20),
    namecustomer VARCHAR(50),
    lastnamecustomer VARCHAR(50),
    codecitycustomer VARCHAR(5),
    emailcustomer VARCHAR(100),
    birthdate DATE,
    lon FLOAT(8),
    lat FLOAT(8),
    CONSTRAINT pk_idcustomer PRIMARY KEY (idcustomer),
    CONSTRAINT fk_idcitycustomer FOREIGN KEY (codecitycustomer) REFERENCES city(codecity)
);

CREATE TABLE laboratory(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE,
    namelab VARCHAR(50),
    codecitylab VARCHAR(5),
    CONSTRAINT pk_idlaboratory PRIMARY KEY (id),
    CONSTRAINT fk_idcitylab FOREIGN KEY (codecitylab) REFERENCES city(codecity)
);

CREATE TABLE farmacy(
    idfarmacy INT UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE,
    namefarmacy VARCHAR(50),
    addressfarmacy VARCHAR(100),
    longfarmacy FLOAT(8),
    latfarmacy FLOAT(8),
    codecityfarm VARCHAR(5),
    logofarmacy VARCHAR(50),
    CONSTRAINT pk_idfarmacy PRIMARY KEY (idfarmacy),
    CONSTRAINT fk_idcityfarm FOREIGN KEY (codecityfarm) REFERENCES city(codecity)
);

CREATE TABLE medicine(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE,
    proceedings VARCHAR(10),
    namemedicine VARCHAR(100),
    healthregister VARCHAR(50),
    description TEXT,
    descriptionshort VARCHAR(60),
    codema INT UNSIGNED,
    codeap INT UNSIGNED,
    codeum INT UNSIGNED,
    namerol VARCHAR(100),
    codelab INT UNSIGNED,
    CONSTRAINT pk_idmedicine PRIMARY KEY (id),
    CONSTRAINT fk_id_modeadm FOREIGN KEY (codema) REFERENCES modeadministration(id),
    CONSTRAINT fk_idap FOREIGN KEY (codeap) REFERENCES activeprinciple(idap),
    CONSTRAINT fk_idum FOREIGN KEY (codeum) REFERENCES unitmeasurement(idum),
    CONSTRAINT fk_idlab FOREIGN KEY (codelab) REFERENCES laboratory(id)
);

CREATE TABLE farmacymedicine(
    idfarmacy INT UNSIGNED,
    idmedicinefatrm INT UNSIGNED,
    price FLOAT(8),
    CONSTRAINT pk_idfarmacymedicine PRIMARY KEY (idfarmacy,idmedicinefatrm),
    CONSTRAINT fk_idfarmacy FOREIGN KEY (idfarmacy) REFERENCES farmacy(idfarmacy),
    CONSTRAINT fk_idmedicinefatrm FOREIGN KEY (idmedicinefatrm) REFERENCES medicine(id)
);