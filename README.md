# CactOS the Online Shopping System by Cactus

--------------------------------------------------------------------------------------------------------------------------------------
# Team : Cactus
# Team Members:
  1. Intan Nur Shahira Zanail	A17CS0058
  2. Izzah Atirah binti Mohamad Fazli	A17CS0060
  3. Fatin Hanani binti Kamis	A17CS0235
  4. Fitri Nabiha binti Mohd Rizalman	A17CS0047
  5. Afif bin Zamani	B17CS0036
--------------------------------------------------------------------------------------------------------------------------------------

This is an online shopping website that implements Spring Boot, Maven, Spring web-flow and Restful services.

# Functions using Spring Boot
    1) insert product
    2) add product category
    3) edit product
    4) view product
    5) manage product status


# Functions with RESTfull web-service
    1. GET method - request to read data
    2. POST method - request to create data


# How to run the project:

1. Clone this project https://github.com/sushildangi/online-shopping.git change default branch "Upgrade-spring-boot" if default branch is "master"
2. create databases schema in mysql - **online_shopping_db**
3. edit **username** and **password** in **applicaton.properties** file
4. Run Project One time using Spring boot command - **mvn spring-boot:run** or using eclipse IDE run as Java Application
5. Run this Query in mysql

```sql
insert into online_shopping_db.user_detail(contact_number,email,enabled,first_name,last_name,password,role) values ('9876543210','admin@gmail.com',true,'admin','admin','$2a$10$6UVHQoHhpoYZxBB.k9r.deSLTT0RD1Yk8GdggRywGw0Snr8syRDtG','ADMIN')
```

**Password = 123456(in encoded Form)**

6. Then Again run project using bootAS
7. create user by signup

# Presentation Video: 

### 

