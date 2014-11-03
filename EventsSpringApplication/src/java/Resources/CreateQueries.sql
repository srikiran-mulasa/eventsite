create table event(id number(4),venue_id number(4),title varchar(50),paid char(1),private char(1),webinar char(1),description varchar(400),PRIMARY KEY (id));

create table category(id number(4),category_name varchar(50),PRIMARY KEY (id));

create table sub_category(id number(4),sub_category_name varchar(50),category_id number(4),PRIMARY KEY (id));


Alter table sub_category
    ADD CONSTRAINT FK_sub_Category FOREIGN KEY (category_id) references category(id);


Alter table event
    ADD CONSTRAINT FK_event FOREIGN KEY (venue_id) references venue(id);

-- **************Venue*************  SriKiran


create table venue(id number(4),name varchar(50),address_id number(4));

create table address(id number(4),address_line_1 varchar(100),address_line_2 varchar(100),city_id NUMBER(4),PRIMARY KEY (id));

CREATE TABLE city (    id NUMBER(4),city_name VARCHAR2(30),postal_code VARCHAR2(6),state_id NUMBER(4),PRIMARY KEY (id));

CREATE TABLE state (id NUMBER(4),state_name VARCHAR2(30),country_id NUMBER(4),PRIMARY KEY (id));
CREATE TABLE country (id NUMBER(4),country_name VARCHAR2(30),PRIMARY KEY (id));
   
Alter table state
ADD CONSTRAINT fk_state_country FOREIGN KEY(country_id)REFERNCES country(id);

Alter table city
ADD CONSTRAINT fk_state_country FOREIGN KEY(state_id)REFERNCES country(id);

Alter table address
ADD CONSTRAINT fk_state_country FOREIGN KEY(city_id)REFERNCES country(id);

Alter table venue
ADD CONSTRAINT fk_state_country FOREIGN KEY(address_id)REFERNCES country(id);


-- ******************contacts*************************** Nitesh

CREATE TABLE MEDIA
(
  ID NUMBER(4),
  SOCIAL_NAME VARCHAR2(10),
  PRIMARY KEY (ID)
);



CREATE TABLE CONTACTTYPE
(
   ID NUMBER(4),
   CONTACT_NAME VARCHAR2(15),
   PRIMARY KEY(ID)
);


CREATE TABLE CONTACT
(
  ID NUMBER(10),
  MEDIA_ID NUMBER(5),
  CTYPE_ID NUMBER(4),
  EMAIL VARCHAR2(20),
  EVENT_DISPLAY CHAR(1),
  CONTACT_FIRST_NAME VARCHAR2(20),
   CONTACT_LAST_NAME VARCHAR2(20),
   CONTACT_EMAIL VARCHAR2(20),
   CONTACT_PHNO NUMBER(12),
  PRIMARY KEY(ID)
);

Alter table CONTACT
ADD CONSTRAINT fk_country FOREIGN KEY(MEDIA_ID)REFERENCES MEDIA(ID);

Alter table CONTACT
ADD CONSTRAINT fk_country FOREIGN KEY(CTYPE_ID)REFERENCES CONTACTTYPE(ID);


-- ***************meghana**************

 CREATE TABLE USERTYPE
       (
       ID NUMBER(4),
       USERTYPE VARCHAR2(50),
       );
      CREATE TABLE PROFILE
      (
       ID NUMBER(4),
      ORGANIZATION_NAME VARCHAR2(60),
       FIRST_NAME VARCHAR2(40),
       LAST_NAME VARCHAR2(40),
      MOBILE_NUMBER NUMBER(15),
      LANDLINE_NUMBER NUMBER(15),
      EMAIL VARCHAR2(20),
      MEDIA_ID NUMBER(4),
      ADDRESS_ID NUMBER(4)
       PRIMARY KEY(ID) 
       );
       
       Alter table PROFILE
   ADD CONSTRAINT FK_PROFILE FOREIGN KEY (ADDRESS_ID) references ADDRESS(ID);
   
    Alter table PROFILE
   ADD CONSTRAINT FK_PROFILE FOREIGN KEY (MEDIA_ID) references MEDIA(ID);
      
    Alter table PROFILE
   ADD CONSTRAINT FK_PROFILE FOREIGN KEY (USERTYPE_ID) references USERTYPE(ID);



-- *************Yashwant************

CREATE TABLE TICKET
{
TICKET DATE/TIME(VARCHAR2(50),TICKET TYPE VARCHAR2(30),NO OF TICKETS TO SELL()
};


-- ***************Chandan*********

create table poll_details
 (
 poll_question varchar2(200),
 poll_multichoice char(1),
 poll_choice varchar2(200)
 
 
 );
 create table video_details
 (
 video_tile varchar2(100),
 video_url varchar(512)
);
 create table upload_file
 (
 
 upload_filename varchar2(100)
 );