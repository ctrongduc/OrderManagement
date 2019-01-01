-- begin ORDERMANAGER_CUSTOMER
create table ORDERMANAGER_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    FB_LINK varchar(2000),
    INTEGRAM_LINK varchar(2000),
    PHONE varchar(20),
    EMAIL varchar(1000),
    ADDRESS varchar(1000),
    CITY varchar(300),
    NOTE varchar(2000),
    OPTIN_ADS boolean,
    --
    primary key (ID)
)^
-- end ORDERMANAGER_CUSTOMER
-- begin ORDERMANAGER_PRODUCT
create table ORDERMANAGER_PRODUCT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PRODUCT_NAME varchar(500) not null,
    LINK varchar(2000) not null,
    NOTE varchar(2000),
    COUPON_CODE varchar(2000),
    SUPPLIER_ID varchar(36),
    --
    primary key (ID)
)^
-- end ORDERMANAGER_PRODUCT
-- begin ORDERMANAGER_SUPPLIER
create table ORDERMANAGER_SUPPLIER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    SUPPLIER_NAME varchar(255) not null,
    LINK varchar(2000) not null,
    NOTE varchar(2000),
    --
    primary key (ID)
)^
-- end ORDERMANAGER_SUPPLIER
-- begin ORDERMANAGER_COUPON
create table ORDERMANAGER_COUPON (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    COUPON_CODE varchar(255) not null,
    PRODUCT_ID varchar(36) not null,
    FROM_DATE timestamp,
    TO_DATE timestamp,
    NOTE varchar(2000),
    --
    primary key (ID)
)^
-- end ORDERMANAGER_COUPON
-- begin ORDERMANAGER_TRANSACTION
create table ORDERMANAGER_TRANSACTION (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TRANSACTION_TYPE varchar(255) not null,
    TRANSACTION_DATE timestamp,
    ORDER_ID varchar(36) not null,
    AMOUNT double precision not null,
    BANK_NAME varchar(500),
    CURRENCY varchar(10) not null,
    TARGET_CURRENCY varchar(10),
    EXCHANGE_RATE double precision,
    --
    primary key (ID)
)^
-- end ORDERMANAGER_TRANSACTION
-- begin ORDERMANAGER_ORDER_ITEM
create table ORDERMANAGER_ORDER_ITEM (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ORDER_ID varchar(36) not null,
    SHIP_DATE timestamp,
    QUALITY integer not null,
    SUPPLIER_ORDER_NUMBER varchar(255),
    SUPPLIER_ID varchar(36),
    UNIT_PRICE double precision,
    TAX double precision,
    SUPPLIER_SHIPPING_FEE double precision,
    UNIT_WEIGHT double precision,
    SHIPPING_WEIGHT double precision,
    SHIPPING_RATE double precision,
    TOTAL_SHIPPING_COST double precision,
    CUSTOM_CHARGE double precision,
    SERVICE_CHARGE double precision,
    CURRENCY varchar(10),
    CUSTOMER_CURRENCY varchar(10),
    EXCHANGE_RATE double precision,
    QUOTED_PRICE double precision,
    STATUS varchar(100) not null,
    --
    primary key (ID)
)^
-- end ORDERMANAGER_ORDER_ITEM
-- begin ORDERMANAGER_ORDER
create table ORDERMANAGER_ORDER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CUSTOMER_ID varchar(36) not null,
    ORDER_DATE timestamp not null,
    --
    primary key (ID)
)^
-- end ORDERMANAGER_ORDER
