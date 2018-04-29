drop table retailer;
drop table supplier
create table retailer(retailer_name varchar2(20) primary key,retailer_address varchar2(20))
create table supplier(supplier_id  number primary key,supplier_name varchar2(20),supplier_address varchar2(20),quantity_order number,order_id number,amount number, retailer_name varchar2(20),foreign key(retailer_name) references retailer(retailer_name))
create table goods(goods_id number primary key,goods_name varchar2(20),goods_quantity_order number,goods_price number,supplier_id number,foreign key(supplier_id) references Supplier(supplier_id))
create table customer(customer_id number primary key,customer_name varchar2(20),customer_address varchar2(20),payment_mode varchar2(20),retailer_name varchar2(20),foreign key(retailer_name) references retailer(retailer_name))
create sequence goods_ID_seq start with 100 increment by 1;
create sequence supplier_ID_seq start with 100 increment by 1;
create sequence customer_ID_seq start with 100 increment by 1;