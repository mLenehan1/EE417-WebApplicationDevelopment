# Users

|ID|SURNAME|FIRSTNAME|EMAIL|USERNAME|PASSWORD|COUNTRY|
|:-:|:-:|:-:|:-:|:-:|:-:|:-:|
|||||||

CREATE TABLE MLECE_USERS (UserID int, Surname varchar(255), Firstname
varchar(255), Email varchar(255), Username varchar(255), Password varchar(255),
Country varchar(255))

INSERT INTO MLECE_USERS ( USERID, SURNAME, FIRSTNAME, EMAIL, USERNAME, PASSWORD,
COUNTRY )
 VALUES ( 2174, 'Smith', 'Peter', 'smithp@gmail.com', 'abc123', 'Ireland' )

 INSERT INTO MLECE_USERS ( USERID, SURNAME, FIRSTNAME, EMAIL, USERNAME,
 PASSWORD, COUNTRY )
  VALUES ( 2175, 'Murphy', 'Joe', 'joe.murhphy@microsoft.com', 'murhpyj',
  'pass000', 'Ireland' )

  INSERT INTO MLECE_USERS ( USERID, SURNAME, FIRSTNAME, EMAIL, USERNAME,
  PASSWORD, COUNTRY )
   VALUES ( 2176, 'Jones', 'Mary', 'mary.jones@hotmail.com', 'jonesm',
   'password2', 'United States' )

INSERT INTO MLECE_USERS ( USERID, SURNAME, FIRSTNAME, EMAIL, USERNAME, PASSWORD,
COUNTRY )
 VALUES ( 2177, 'Ryan', 'Ann', 'ann.ryan@mail.dcu.ie', 'ryana', 'dogsname',
 'England' )


# Sales

|SaleID|ItemID|StartingPrice|CurrentBid|PurchaseID|
|:-:|:-:|:-:|:-:|:-:|
||||||

CREATE TABLE MLECE_SALES (
SaleID int,
ItemID int,
StartingPrice float,
CurrentBid float,
PurchaseID int
)

INSERT INTO MLECE_SALES (SALEID, ITEMID, STARTINGPRICE, CURRENTBID, PURCHASEID )
  VALUES ( 1426, 1300, 60.00, 75.00, 2174 )

INSERT INTO MLECE_SALES (SALEID, ITEMID, STARTINGPRICE, CURRENTBID, PURCHASEID )
  VALUES ( 1427, 1301, 149.00, 200.00, 2174 )

INSERT INTO MLECE_SALES (SALEID, ITEMID, STARTINGPRICE, CURRENTBID, PURCHASEID )
  VALUES ( 1428, 1302, 134.99, 150.50, 2176 )

INSERT INTO MLECE_SALES (SALEID, ITEMID, STARTINGPRICE, CURRENTBID, PURCHASEID )
  VALUES ( 1429, 1303, 29.00, 40.00, 2177 )
# Items

|SellerID|ItemName|ItemID|ItemDescription|
|:-:|:-:|:-:|:-:|
||||

CREATE TABLE MLECE_ITEMS (
SellerID int,
ItemName varchar(255),
ItemID int,
ItemDescription varchar(255)
)

INSERT INTO MLECE_ITEMS (SELLERID, ITEMNAME, ITEMID, ITEMDESCRIPTION )
 VALUES ( 2175, 'Timberland Men Adventure 2.0 Cupsole Chukka Boots', 1300, 'EVA
 footbeds / 34 percent recycled rubber siped outsoles are designed for slip
 resistance ')

INSERT INTO MLECE_ITEMS (SELLERID, ITEMNAME, ITEMID, ITEMDESCRIPTION )
 VALUES ( 2176, 'Ring Spotlight Cam Wired | HD Security Camera with LED
 Spotlight, Alarm, Two-Way Talk, UK Plug', 1301, 'Lets you see, hear and speak
 to visitors from your phone, tablet and PC. ')

INSERT INTO MLECE_ITEMS (SELLERID, ITEMNAME, ITEMID, ITEMDESCRIPTION )
 VALUES ( 2175, 'Garmin Vivoactive 3 GPS Smartwatch with Built-In Sports Apps
 and Wrist Heart Rate - Black ', 1302, 'Sporty smartwatch with built-in GPS,
 sports apps and wrist-based heart rate. Display resolution is 240 x 240 pixels.
 The watch fits wrist with a circumference of 12.7-20.4 cm ')

INSERT INTO MLECE_ITEMS (SELLERID, ITEMNAME, ITEMID, ITEMDESCRIPTION )
 VALUES ( 2176, 'All-new Echo Dot (3rd Gen) - Smart speaker with Alexa -
 Charcoal Fabric', 1303, 'Ask Alexa to play music, answer questions, read the
 news, check the weather, set alarms, control compatible smart home devices, and
 more. ')

ALTER TABLE MLECE_ITEMS ADD CATEGORY VARCHAR(255)
