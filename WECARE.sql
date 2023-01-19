
CREATE TABLE `coach` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `pwd` varchar(50) DEFAULT NULL,
  `dob` varchar(30) DEFAULT NULL,
  `gender` varchar(30) DEFAULT NULL,
  `mobile` int(20) DEFAULT NULL,
  `spec` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;


CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `pwd` varchar(50) DEFAULT NULL,
  `dob` varchar(30) DEFAULT NULL,
  `gender` varchar(30) DEFAULT NULL,
  `mobile` int(20) DEFAULT NULL,
  `mail` varchar(30)DEFAULT NULL,
  `pin` int(7) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  `state` varchar(20) DEFAULT NULL,
  `country` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

INSERT INTO `user` values(1,'sar','sar','05/08/1989','Male',56342464,'sar@gmail.com',678789,'chennai','tamilnadu','India'),(2,'prithivi','raj','05/08/1990','Male',594400,'prithivi@gmail.com',678789,'chennai','tamilnadu','India');
INSERT INTO `coach` VALUES (1,'Raj','Raj','05/08/1989','Male',56464,'Boxer'),(2,'John','raj','05/08/1990','Male',6456,'Runner');