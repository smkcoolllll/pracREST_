create database if not exists storeDB;
use storeDB;
create table Store(
strId integer primary key,
strName varchar(20),
whatwesell varchar(50),
strAddress varchar(50),
strContact varchar(20),
strEmail varchar(20),
strOwnerName varchar(20)


);
INSERT INTO Store (strId, strName, whatwesell, strAddress, strContact, strEmail, strOwnerName)
VALUES (1, 'Store 1', 'Product A', 'Address 1', 'Contact 1', 'email1@example.com', 'Owner 1');

select * from Store;