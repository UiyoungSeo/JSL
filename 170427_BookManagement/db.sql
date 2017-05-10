/*admin table*/
CREATE TABLE admin(
	id VARCHAR(10) NOT NULL, 
	pw VARCHAR(10) NOT NULL
);

INSERT INTO admin VALUES ('admin','1234');

SELECT * FROM admin;


/* lib table */
CREATE TABLE lib (
	lib_name VARCHAR(20),
	lib_code VARCHAR(10),
	lib_price VARCHAR(10),
	lib_author VARCHAR(10),
	lib_publisher VARCHAR(10),
	lib_state VARCHAR(10)
);


/*member table*/
CREATE TABLE `member` (
	`no` INT(11) NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(20) NOT NULL DEFAULT '0',
	`phone` VARCHAR(20) NOT NULL DEFAULT '0',
	PRIMARY KEY (`no`)
)
ENGINE=InnoDB
;